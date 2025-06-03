//API GET
fetch('http://localhost:8080/alunos', {
  method: 'GET',
  headers: {
    'Content-Type': 'application/json'
  },
})
.then(response => response.json())
.then(data => {
  addlinha(data);
})
.catch(error => {
  console.log(error);
});

let editandoId = null;

//Adicionar Linha na Tabela
function addlinha(dadosAPI){
    const tabela = document.getElementById('tabelaCorpo');
    dadosAPI.forEach(element => {   
      const linha = document.createElement('tr');
      linha.innerHTML = `
        <td class="px-4 py-2 text-center">${element.id !== undefined ? element.id : ''}</td>
        <td class="px-4 py-2 text-center">${element.nome}</td>
        <td class="px-4 py-2 text-center">${element.email}</td>
        <td class="px-4 py-2 text-center">
          <button class="bg-yellow-400 text-white px-2 py-1 rounded mr-2" onclick="editar(this, ${element.id}, '${element.nome.replace(/'/g, "\\'")}', '${element.email.replace(/'/g, "\\'")}')">Editar</button>
          <button class="bg-red-500 text-white px-2 py-1 rounded" onclick="remover(this, ${element.id !== undefined ? element.id : null})">Remover</button>
        </td>
      `;
      tabela.appendChild(linha);
    });
}

//Cadastrar ou Editar pessoas do formulario
function cadastrar(){
  event.preventDefault();
  const nome = document.getElementById('nome').value;
  const email = document.getElementById('email').value;
  if(nome && email){
    if(editandoId) {
      // Editar aluno existente
      fetch(`http://localhost:8080/alunos/${editandoId}`, { 
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({"nome":nome, "email":email})
      })
      .then(response => response.json())
      .then(data => {
        atualizarLinhaTabela(data);
        document.getElementById('formCadastro').reset();
        editandoId = null;
        document.querySelector('#formCadastro button[type="submit"]').textContent = "Adicionar";
        Swal.fire({
          icon: 'success',
          title: 'Sucesso!',
          text: 'Cadastro atualizado com sucesso'
        });
      })
      .catch(error => {
        Swal.fire({
          icon: 'error',
          title: 'Erro!',
          text: 'Erro ao atualizar cadastro'
        });
      });
    } else {
      // Cadastrar novo aluno
      fetch('http://localhost:8080/alunos', { 
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({"nome":nome, "email":email})
      })
      .then(response => response.json())
      .then(data => {
        addlinha([data]);
        document.getElementById('formCadastro').reset();
        Swal.fire({
          icon: 'success',
          title: 'Sucesso!',
          text: 'Cadastro feito com sucesso'
        });
      })
      .catch(error => {
        Swal.fire({
          icon: 'error',
          title: 'Erro!',
          text: 'Erro ao cadastrar'
        });
      });
    }
  }else{
    Swal.fire({
      icon: 'error',
      title: 'Erro!',
      text: 'Falta dados para cadastar'
    });
  }
}

// Função para editar aluno
function editar(botao, id, nome, email) {
  document.getElementById('nome').value = nome;
  document.getElementById('email').value = email;
  editandoId = id;
  document.querySelector('#formCadastro button[type="submit"]').textContent = "Salvar";
  // Destacar a linha sendo editada (opcional)
  document.querySelectorAll('#tabelaCorpo tr').forEach(tr => tr.classList.remove('bg-yellow-100'));
  botao.closest('tr').classList.add('bg-yellow-100');
}

// Atualizar linha da tabela após edição
function atualizarLinhaTabela(aluno) {
  const linhas = document.querySelectorAll('#tabelaCorpo tr');
  linhas.forEach(linha => {
    const idCelula = linha.querySelector('td');
    if(idCelula && idCelula.textContent == aluno.id) {
      linha.querySelectorAll('td')[1].textContent = aluno.nome;
      linha.querySelectorAll('td')[2].textContent = aluno.email;
      linha.classList.remove('bg-yellow-100');
    }
  });
}

//Remover Alguma Linha da tabela
function remover(botao, id){
  Swal.fire({
    icon: 'question',
    title: 'Você tem certeza?',
    showCancelButton: true,
    confirmButtonText: 'Sim',
    cancelButtonText: 'Não'
  }).then((result) => {
    if (result.isConfirmed) {
      if (id) {
        fetch(`http://localhost:8080/alunos/${id}`, {
          method: 'DELETE'
        })
        .then(response => {
          if (response.ok) {
            const linharemover = botao.closest('tr');
            linharemover.remove();
            Swal.fire('Removido!', '', 'success');
          } else {
            Swal.fire('Erro ao remover!', '', 'error');
          }
        });
      } else {
        const linharemover = botao.closest('tr');
        linharemover.remove();
        Swal.fire('Removido!', '', 'success');
      }
    } else {
      Swal.fire('Cancelado', '', 'info');
    }
  });
}
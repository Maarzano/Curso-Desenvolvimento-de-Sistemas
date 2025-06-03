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

//Adicionar Linha na Tabela
function addlinha(dadosAPI){
    const tabela = document.getElementById('tabelaCorpo');
    dadosAPI.forEach(element => {   
      const linha = document.createElement('tr');
      //Adicionando HTML
      linha.innerHTML = `
        <td class="px-4 py-2">${element.id !== undefined ? element.id : ''}</td>
        <td class="px-4 py-2">${element.nome}</td>
        <td class="px-4 py-2">${element.email}</td>
        <td class="px-4 py-2"><button class="bg-red-500 text-white px-2 py-1 rounded" onclick="remover(this, ${element.id !== undefined ? element.id : null})">remover</button></td>
      `;
      tabela.appendChild(linha);
    });
}

//Cadastrar Novas pessoas do formulario
function cadastrar(){
  event.preventDefault();
  const nome = document.getElementById('nome').value;
  const email = document.getElementById('email').value;
  if(nome && email){
    //API POST  
    fetch('http://localhost:8080/alunos', { 
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({"nome":nome, "email":email})
    })
    .then(response => response.json())
    .then(data => {
      //Adicionando Linha com nosso Cadastro (agora com ID)
      addlinha([data]);
      //Limpando os campos
      document.getElementById('nome').value = "";
      document.getElementById('email').value = "";
      Swal.fire({
        icon: 'success',
        title: 'Sucesso!',
        text: 'Cadastro feito com sucesso'
      });
    })
    .catch(error => {
      console.error("Erro ao enviar dados:", error);
      Swal.fire({
        icon: 'error',
        title: 'Erro!',
        text: 'Erro ao cadastrar: ' + error
      });
    });
  }else{
    Swal.fire({
      icon: 'error',
      title: 'Erro!',
      text: 'Falta dados para cadastar'
    });
  }
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
      // Remove da API se houver ID
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
        // Remove apenas da tabela (caso não tenha ID)
        const linharemover = botao.closest('tr');
        linharemover.remove();
        Swal.fire('Removido!', '', 'success');
      }
    } else {
      Swal.fire('Cancelado', '', 'info');
    }
  });
}
fetch('http://localhost:8080/api/v1/bibliotecarios', {
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


function addlinha(dadosAPI){
  const tabela = document.getElementById('tabelaCorpo');
  dadosAPI.map(element => {   
    const linha = document.createElement('tr');
    var id = element.id;
    linha.innerHTML = `
      <td class="px-4 py-2">${element.id ? element.id : ''}</td>
      <td class="px-4 py-2">${element.nome}</td>
      <td class="px-4 py-2">${element.email}</td>
      <td class="px-4 py-2">
        <button class="bg-red-500 text-white px-2 py-1 rounded" onclick="remover(this, '${element.id ? element.id : ''}')">remover</button>
      </td>
    `;
    tabela.appendChild(linha);
  });
}

function cadastrar(){
  event.preventDefault();
  const nome = document.getElementById('nome').value;
  const email = document.getElementById('email').value;
  if(nome && email){
    fetch('http://localhost:8080/api/v1/bibliotecarios', { 
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({"nome":nome, "email":email})
    })
    .then(response => response.json())
    .then(data => {
      addlinha([data]);
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
        text: 'Erro ao cadastrar'
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

function remover(botao, id){
  Swal.fire({
    icon: 'question',
    title: 'Você tem certeza?',
    showCancelButton: true,
    confirmButtonText: 'Sim',
    cancelButtonText: 'Não'
  }).then((result) => {
    if (result.isConfirmed) {
      fetch(`http://localhost:8080/api/v1/bibliotecarios/${id}`, { 
        method: 'DELETE',
        headers: {
          'Content-Type': 'application/json'
        }
      })
      .then(response => {
        if (response.ok) {
          const linharemover = botao.closest('tr');
          linharemover.remove();
          Swal.fire('Confirmado!', '', 'success');
        } else {
          Swal.fire('Erro!', 'Não foi possível remover.', 'error');
        }
      })
      .catch(error => {
        console.error("Erro ao enviar dados:", error);
        Swal.fire('Erro!', 'Erro ao remover.', 'error');
      });
    } else {
      Swal.fire('Cancelado', '', 'info');
    }
  });

}
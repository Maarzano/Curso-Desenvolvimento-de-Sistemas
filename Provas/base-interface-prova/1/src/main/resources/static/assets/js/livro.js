function carregarBibliotecarios() {
  fetch('http://localhost:8080/api/v1/bibliotecarios')
    .then(res => res.json())
    .then(data => {
      const select = document.getElementById('bibliotecario');
      select.innerHTML = '<option value="">Selecione</option>';
      data.forEach(b => {
        select.innerHTML += `<option value="${b.id}">${b.nome}</option>`;
      });
    });
}

function carregarLivros() {
  fetch('http://localhost:8080/api/v1/livros')
    .then(res => res.json())
    .then(data => {
      const tabela = document.getElementById('tabelaLivros');
      tabela.innerHTML = '';
      data.forEach(livro => {
        tabela.innerHTML += `
          <tr>
            <td class="px-4 py-2">${livro.id}</td>
            <td class="px-4 py-2">${livro.titulo}</td>
            <td class="px-4 py-2">${livro.autor}</td>
            <td class="px-4 py-2">${livro.genero}</td>
            <td class="px-4 py-2">${livro.status}</td>
            <td class="px-4 py-2">${livro.bibliotecarioResponsavel ? livro.bibliotecarioResponsavel.nome : ''}</td>
            <td class="px-4 py-2">
              <button class="bg-yellow-500 text-white px-2 py-1 rounded" onclick="editarLivro(${livro.id})">Editar</button>
              <button class="bg-red-500 text-white px-2 py-1 rounded" onclick="excluirLivro(${livro.id})">Excluir</button>
            </td>
          </tr>
        `;
      });
    });
}

document.getElementById('formLivro').onsubmit = function(event) {
  event.preventDefault();
  const id = document.getElementById('livroId').value;
  const titulo = document.getElementById('titulo').value;
  const autor = document.getElementById('autor').value;
  const genero = document.getElementById('genero').value;
  const status = document.getElementById('status').value;
  const bibliotecarioId = document.getElementById('bibliotecario').value;

  const livro = {
    titulo,
    autor,
    genero,
    status,
    bibliotecarioResponsavel: { id: bibliotecarioId }
  };

  let url = 'http://localhost:8080/api/v1/livros';
  let method = 'POST';

  if (id) {
    url += '/' + id;
    method = 'PUT';
  }

  fetch(url, {
    method: method,
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(livro)
  })
  .then(res => {
    if (!res.ok) throw new Error('Erro ao salvar livro');
    return res.json();
  })
  .then(() => {
    Swal.fire('Sucesso!', 'Livro salvo com sucesso!', 'success');
    document.getElementById('formLivro').reset();
    document.getElementById('livroId').value = '';
    document.getElementById('cancelarEdicao').classList.add('hidden');
    carregarLivros();
  })
  .catch(() => Swal.fire('Erro!', 'Não foi possível salvar o livro.', 'error'));
};

function editarLivro(id) {
  fetch('http://localhost:8080/api/v1/livros/' + id)
    .then(res => res.json())
    .then(livro => {
      document.getElementById('livroId').value = livro.id;
      document.getElementById('titulo').value = livro.titulo;
      document.getElementById('autor').value = livro.autor;
      document.getElementById('genero').value = livro.genero;
      document.getElementById('status').value = livro.status;
      document.getElementById('bibliotecario').value = livro.bibliotecarioResponsavel ? livro.bibliotecarioResponsavel.id : '';
      document.getElementById('cancelarEdicao').classList.remove('hidden');
    });
}

document.getElementById('cancelarEdicao').onclick = function() {
  document.getElementById('formLivro').reset();
  document.getElementById('livroId').value = '';
  this.classList.add('hidden');
};

function excluirLivro(id) {
  Swal.fire({
    icon: 'question',
    title: 'Você tem certeza?',
    showCancelButton: true,
    confirmButtonText: 'Sim',
    cancelButtonText: 'Não'
  }).then((result) => {
    if (result.isConfirmed) {
      fetch('http://localhost:8080/api/v1/livros/' + id, { method: 'DELETE' })
        .then(res => {
          if (!res.ok) throw new Error();
          Swal.fire('Removido!', '', 'success');
          carregarLivros();
        })
        .catch(() => Swal.fire('Erro!', 'Não foi possível remover.', 'error'));
    }
  });
}

carregarBibliotecarios();
carregarLivros();

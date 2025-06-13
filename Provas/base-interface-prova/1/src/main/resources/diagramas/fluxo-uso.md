https://www.mermaidchart.com/app/projects/f97e05d7-305a-4e5e-8793-7f8d918de8e1/diagrams/f5dad8e1-408b-4285-91c8-5cf67fa0e8b1/share/invite/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkb2N1bWVudElEIjoiZjVkYWQ4ZTEtNDA4Yi00Mjg1LTkxYzgtNWNmNjdmYTBlOGIxIiwiYWNjZXNzIjoiVmlldyIsImlhdCI6MTc0OTc3NDc5OH0.VI3fZ0n_7rxXVL-mkiD8ORVKoB-85wI3s7ITBYxMT38

flowchart TD
    A[Usuário acessa tela de Bibliotecários] --> B{Deseja cadastrar?}
    B -- Sim --> C[Preenche nome e e-mail]
    C --> D[Envia formulário]
    D --> E[API cadastra bibliotecário]
    E --> F[Atualiza tabela de bibliotecários]
    B -- Não --> G{Deseja excluir?}
    G -- Sim --> H[Usuário clica em Remover]
    H --> I[API exclui bibliotecário]
    I --> F
    G -- Não --> J{Deseja ir para Livros?}
    J -- Sim --> K[Usuário acessa tela de Livros]
    K --> L{Deseja cadastrar livro?}
    L -- Sim --> M[Preenche dados do livro e escolhe bibliotecário]
    M --> N[Envia formulário]
    N --> O[API cadastra livro]
    O --> P[Atualiza tabela de livros]
    L -- Não --> Q{Deseja editar/excluir livro?}
    Q -- Editar --> R[Usuário clica em Editar]
    R --> S[Formulário preenchido com dados do livro]
    S --> N
    Q -- Excluir --> T[Usuário clica em Excluir]
    T --> U[API exclui livro]
    U --> P

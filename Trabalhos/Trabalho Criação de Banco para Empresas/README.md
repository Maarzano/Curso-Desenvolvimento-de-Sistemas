# Projeto de Banco de Dados - Banco Inter

## Descrição do Projeto

Este trabalho em grupo tem como objetivo o desenvolvimento de um banco de dados para o Banco Inter, com a implementação de um modelo relacional que abrange diversas áreas da empresa. A estrutura do banco de dados está organizada de maneira a refletir as diferentes áreas de operação do banco, garantindo que ele seja eficiente, normalizado e com integridade referencial.

### Integrantes do Grupo

- **Arthur Augusto Alves Araujo**
- **Arthur Araujo Marzano**
- **Gabriel Arthur Ferreira de Jesus**
- **Isaac Adrian de Souza**
- **João Lucas da Costa Bernardo**

### Áreas Abordadas

O banco de dados desenvolvido abrange as seguintes áreas do Banco Inter:

1. **Geral**
2. **Relacionamento com o Cliente**  
3. **Operações Bancárias**  
4. **Recursos Humanos (RH)**

Cada integrante do grupo ficou responsável pela criação de um conjunto de tabelas dentro de uma área específica.

### Requisitos

- **Estrutura do Banco:** O banco de dados foi projetado para abranger no mínimo três áreas da empresa (Relacionamento com o Cliente, Operações Bancárias, Recursos Humanos e Geral).
  
- **Tabelas por Área:** Cada área possui no mínimo 5 tabelas de composição.
  
- **População de Dados:** O banco contém pelo menos 15 inserções de dados em cada tabela (dados fictícios).

- **Primeira Forma Normal (1NF):** Todo o banco foi desenvolvido seguindo a Primeira Forma Normal, ou seja, sem dados repetidos e com atributos atômicos.

- **Integridade Relacional:** O banco de dados foi projetado com chaves primárias (PKs) e chaves estrangeiras (FKs) para garantir a integridade referencial entre as tabelas.


### Modelo Relacional

![Imagem modelo relacional do Banco Inter](https://exemplo.com/imagem-banco-inter.jpg)

### Estrutura do Banco de Dados

#### 1. Geral

A área de Geral visa gerenciar as informações que seriam utilizadas por mais de uma área constantemente, ou que participa de várias áreas ao mesmo tempo.

- Tabelas:
  - **Clientes**
  - **Contas**

#### 2. Relacionamento com o Cliente

A área de Relacionamento com o Cliente visa gerenciar as informações e interações do banco com seus clientes. Tabelas e dados relacionados a contatos, FeedBacks e histórico de atendimentos estão nesta área.

- Tabelas:
  - **Feedbacks**
  - **Alertas e Suspensões**
  - **Atendente**
  - **Atendimentos**
  - **Contatos**

#### 3. Operações Bancárias

A área de Operações Bancárias envolve os processos financeiros internos do Banco Inter, como movimentação de contas, transações entre clientes e os serviços oferecidos.

- Tabelas:
  - **Transações**
  - **Cartões**
  - **Empréstimos**
  - **Investimentos**
  - **Faturas**

#### 4. Recursos Humanos (RH)

A área de Recursos Humanos é responsável pela gestão dos colaboradores e das informações relacionadas à folha de pagamento, contratos e cargos dentro da organização.

- Tabelas:
  - **Funcionários**
  - **Setores**
  - **Cargos**
  - **Salários**
  - **Férias**

### Tecnologias Utilizadas

- **Banco de Dados:** SQL Server
- **Ferramentas de Modelagem:** Diagrama de Entidade-Relacionamento (DER) no SSMS
- **SGBD:** SQL Server Management Studio (SSMS)
- **IA:** A geração de dados fictícios foi realizada com o auxílio do 'ChatGPT'

### Conclusão

Este trabalho visa não apenas o entendimento e aplicação de conceitos de modelagem de banco de dados, mas também o desenvolvimento de uma solução que seja funcional e representativa de um ambiente bancário real. Com as áreas bem definidas e tabelas normalizadas, o banco de dados foi construído de forma a ser eficiente, organizado e com integridade dos dados garantida.

### Como Executar
1.  **Backup:**
  - **Configure o SQL Server** (ou qualquer outro SGBD compatível).
  - **Baixe** o arquivo de Backup.
  - **Faça o backup**.

2. **Query:**
  - **Configure o SQL Server** (ou qualquer outro SGBD compatível).
  - **Copie a Query** a seguir, cole em seu SSMS e execute.
    ```sql
    COLOCAR QUERY





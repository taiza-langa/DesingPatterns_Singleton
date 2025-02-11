## ConfigurationManager - Padrão Singleton em Java

Este repositório contém uma implementação do padrão Singleton em Java para gerenciar configurações globais da aplicação.

<h2>📌 Sobre o projeto</h2>

O ConfigurationManager é uma classe que garante que apenas uma instância seja criada e utilizada ao longo do programa. Ele armazena configurações essenciais, como a URL do banco de dados e a chave de API, simulando um gerenciador de configurações.

<h2>🛠️ Tecnologias utilizadas</h2>

- Java
- Padrão de projeto Singleton
  
<h2>🚀 Como funciona</h2>
1- A classe ConfigurationManager possui um construtor privado, impedindo a criação de novas instâncias externas.
2- A única instância da classe é acessada através do método getInstance().
3- As configurações são inicializadas internamente e podem ser acessadas por meio de métodos públicos.

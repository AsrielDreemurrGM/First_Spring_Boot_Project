<h1>Client CRUD - Spring Boot</h1>
<p>This README is also available in <a href="./README.md">English</a>.</p>
<p>
  Este projeto é uma aplicação CRUD básica desenvolvida com Spring Boot para registrar e armazenar informações de clientes.
  Utiliza Spring Data JPA para persistência, Lombok para reduzir o código repetitivo e PostgreSQL como banco de dados.
  O projeto foi gerado utilizando o <a href="https://start.spring.io/">Spring Initializr</a>.
</p>
<h2>🚀 Funcionalidades</h2>
<ul>
  <li>Armazena dados de clientes em um banco PostgreSQL usando JPA;</li>
  <li>Modelo de domínio construído com anotações do Lombok para reduzir repetição de código;</li>
  <li>Utiliza a interface <code>CrudRepository</code> para acesso simplificado aos dados;</li>
  <li>Classe principal da aplicação inicializa e salva um cliente de exemplo ao iniciar;</li>
  <li>Estrutura de pacotes organizada seguindo separação de domínio, repositório e aplicação.</li>
</ul>
<h2>🧠 O Que Foi Aprendido</h2>
<ul>
  <li>Criação de projeto Spring Boot com Maven e Java 21;</li>
  <li>Configuração e conexão com banco de dados PostgreSQL;</li>
  <li>Implementação de classes de domínio com anotações do JPA e Lombok;</li>
  <li>Uso da interface <code>CrudRepository</code> do Spring Data JPA;</li>
  <li>Inicialização de lógica usando a interface <code>CommandLineRunner</code>.</li>
</ul>
<h2>🛠️ Tecnologias Utilizadas</h2>
<ul>
  <li>Java 21</li>
  <li>Spring Boot 3.5.4</li>
  <li>Spring Data JPA</li>
  <li>Lombok</li>
  <li>PostgreSQL</li>
  <li>Maven</li>
</ul>
<h2>📜 Resumo dos Commits</h2>
<ul>
  <li>Projeto criado com Spring Initializr e dependências necessárias;</li>
  <li>Configuração de conexão com PostgreSQL e propriedades do JPA no <code>application.properties</code>;</li>
  <li>Criação da classe de domínio <code>Client</code> com validação e estruturação;</li>
  <li>Implementação da interface <code>IClientRepository</code> estendendo <code>CrudRepository</code>;</li>
  <li>Lógica adicionada na classe principal para salvar um cliente de exemplo ao iniciar a aplicação.</li>
</ul>

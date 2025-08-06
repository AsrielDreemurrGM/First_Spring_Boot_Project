<h1>Client CRUD - Spring Boot</h1>
<p>Este README também está disponível em <a href="./README.pt-br.md">Português</a>.</p>
<p>
  This project is a basic CRUD application built with Spring Boot that saves and stores client information.
  It uses Spring Data JPA for persistence, Lombok for reducing boilerplate code, and PostgreSQL as the database.
  The project was generated using <a href="https://start.spring.io/">Spring Initializr</a>.
</p>
<h2>🚀 Features</h2>
<ul>
  <li>Stores client data in a PostgreSQL database using JPA;</li>
  <li>Domain model built with Lombok annotations to reduce boilerplate code;</li>
  <li>Uses <code>CrudRepository</code> for simplified data access;</li>
  <li>Main application class initializes and saves a sample client on startup;</li>
  <li>Organized package structure following domain-repository-application separation.</li>
</ul>
<h2>🧠 What Was Learned</h2>
<ul>
  <li>Creating a Spring Boot project with Maven and Java 21;</li>
  <li>Configuring and connecting to a PostgreSQL database;</li>
  <li>Implementing domain classes with JPA and Lombok annotations;</li>
  <li>Using Spring Data JPA <code>CrudRepository</code> interface;</li>
  <li>Initializing logic through the <code>CommandLineRunner</code> interface.</li>
</ul>
<h2>🛠️ Technologies Used</h2>
<ul>
  <li>Java 21</li>
  <li>Spring Boot 3.5.4</li>
  <li>Spring Data JPA</li>
  <li>Lombok</li>
  <li>PostgreSQL</li>
  <li>Maven</li>
</ul>
<h2>📜 Commit Summary</h2>
<ul>
  <li>Created project using Spring Initializr with required dependencies;</li>
  <li>Configured PostgreSQL connection and JPA properties in <code>application.properties</code>;</li>
  <li>Created domain model class <code>Client</code> with validation and structure;</li>
  <li>Implemented <code>IClientRepository</code> interface extending <code>CrudRepository</code>;</li>
  <li>Added logic in main class to save a sample client on application startup.</li>
</ul>

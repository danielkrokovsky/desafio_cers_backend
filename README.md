# Desafio Cers Backend

1. Para executar a aplicação com a base de dados limpa, execute a aplicação normalmente.

Para o back-end: <blockquote>mvn clean install</blockquote>

Quando finalizar execute: <blockquote>mvn spring-boot:run</blockquote> 

Para o front-end: <blockquote>npm i</blockquote>

Quando finalizar execute: <blockquote>ng serve</blockquote>

2. Para executar a aplicação com uma massa de dados, vá até o arquivo application.properties, 
e altere a linha 15 

<blockquote>spring.jpa.hibernate.ddl-auto=create</blockquote> 

para 

<p><blockquote>spring.jpa.hibernate.ddl-auto=none</blockquote>

e descomente a linha 17 

<p><blockquote> spring.datasource.initialization-mode=embedded</blockquote>


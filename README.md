# Desafio Cers Backend

1. Para executar a aplicação com a base de dados limpa, execute a aplicação normalmente.

2. Para executar a aplicação com uma carga de dados, vá até o arquivo application.properties, 
e altere a linha 15 <blockquote>spring.jpa.hibernate.ddl-auto=create</blockquote> para <p> <blockquote>spring.jpa.hibernate.ddl-auto=none</blockquote>

e descomente a linha 17 <p><blockquote> spring.datasource.initialization-mode=embedded </blockquote>


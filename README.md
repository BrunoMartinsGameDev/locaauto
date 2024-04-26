
<h1 align="center">
    API Exemplo - Guia para compilar e executar o projeto
</h1>

---

# Compilando

<br>

Se posicionar na pasta base do código-fonte da aplicação:


```bash

cd [PASTA DA APLICAÇÃO]/exemplo

```


É indicado que as dependências sejam baixadas localmente para facilitar o trabalho:

```bash

mvn dependency:copy-dependencies

```

> Basta executar esse procedimento uma vez!

<br>

Para compilar:

<br>

```bash

mvn package

```
<br>
---
---
Alterar a conexão com a base de dados no arquivo application.properties e criar a base de dados chamada locaauto
```bash
spring.application.name=locaauto
spring.datasource.url=jdbc:mysql://localhost:3306/locaauto
spring.datasource.username=seuUsuario
spring.datasource.password=suasenha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

```

<br>

---


Execute um comando mvn para executar a aplicação. Como também pode-se utilizar o mvnw:

```bash

mvn spring-boot:run

```


A mensagem que aparece no final "Tomcat started on port(s): 8081 (http)" significa que a sua aplicação web já está rodando na porta 8081.

---


Para acessar a Documentação Online basta utilizar o link abaixo:

<http://localhost:8081/swagger-ui/#/>

---





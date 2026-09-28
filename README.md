# Atividade MVC e DTO

Projeto desenvolvido com Spring Boot para demonstrar o uso de MVC, DTO e requisição POST.

## Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2
- Bean Validation
- Maven

## Como executar

Execute a classe `AtividadeMvcApplication`.

A aplicação será iniciada em:

http://localhost:8080

## Cadastro de usuário

Endpoint:

POST /usuarios

Content-Type:

application/json

Exemplo:

{
  "nome": "Maria da Silva",
  "email": "maria.silva@email.com",
  "senha": "senhaSegura123"
}

## Listagem

GET /usuarios

## Banco H2

Console:

http://localhost:8080/h2-console

JDBC URL:

jdbc:h2:mem:usuarios

Usuário:

sa

Senha:

deixe em branco

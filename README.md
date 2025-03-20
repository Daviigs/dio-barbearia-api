# Dio Barbearia API

API REST para gerenciamento de agendamentos em um salão de beleza, desenvolvida em **Java** com **Spring Boot** e integrada ao banco de dados **PostgreSQL**.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (Web, Data JPA, Validation)
- **PostgreSQL** (com **Flyway** para versionamento do banco)
- **Maven** (Gerenciamento de dependências)

## 📌 Funcionalidades

- Criar, listar e excluir agendamentos
- Validação de conflito de horários
- Controle de clientes

## 📦 Configuração do Ambiente

1. Clone o repositório:

```bash
git clone <URL_DO_REPOSITORIO>
```

2. Configure as variáveis de ambiente no `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
spring.datasource.username=<usuario>
spring.datasource.password=<senha>
```

3. Execute a aplicação:

```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 🔗 Integração com o Front-End

Este projeto é integrado ao [Barbearia Front](https://github.com/Daviigs/dio-barberia-ui), uma aplicação Angular para a interface do usuário.

Certifique-se de que ambos os projetos estejam em execução para acessar todas as funcionalidades.

## 📚 Endpoints Principais

### Agendamentos (Schedules)

| Método | Rota                  | Descrição                |
|--------|-----------------------|--------------------------|
| POST   | `/schedules`          | Cria um novo agendamento |
| GET    | `/schedules/{ano}/{mês}` | Lista agendamentos por mês |
| DELETE | `/schedules/{id}`     | Exclui um agendamento    |

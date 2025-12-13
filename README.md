# ✅ Gerenciador de Tarefas

Sistema completo de gerenciamento de tarefas com **categorias**, **prioridades** e **status de conclusão**, desenvolvido para **estudos e portfólio** utilizando **Java 21 + Spring Boot 3**.

> Projeto ideal para nível **iniciante/júnior**, demonstrando boas práticas de API REST, JPA e organização em camadas.

---

## 🎯 Objetivo do Projeto

Permitir o controle de tarefas do dia a dia, possibilitando:

* Criar, editar, excluir e listar tarefas
* Organizar tarefas por categorias
* Definir prioridade (Alta, Média ou Baixa)
* Marcar tarefas como concluídas
* Consumir via **API REST** ou **interface web simples**

---

## 🛠️ Tecnologias Utilizadas

| Camada          | Tecnologia                        |
| --------------- | --------------------------------- |
| Linguagem       | Java 21                           |
| Framework       | Spring Boot 3 + Spring MVC        |
| Persistência    | Spring Data JPA + Hibernate       |
| Banco de Dados  | H2 Database (em memória)          |
| Build           | Maven                             |
| Template Engine | Thymeleaf (opcional)              |
| Front-end       | HTML5, CSS3, JavaScript (Vanilla) |

---

## ✨ Funcionalidades

* 📌 Cadastro de tarefas
* ✏️ Edição de tarefas
* 🗑️ Exclusão de tarefas
* 📋 Listagem geral
* 🗂️ Categorias personalizadas
* ⚠️ Prioridades: **Alta · Média · Baixa**
* ✅ Marcar tarefa como concluída
* 🌐 API REST completa
* 💾 Banco H2 em memória (ideal para testes)
* 🚀 Dados iniciais pré-cadastrados

---

## 📂 Estrutura do Projeto

```
gerenciador-tarefas/
 ├── src/main/java/br/com/gerenciador/tarefas/
 │   ├── model/        # Entidades JPA (Tarefa, Categoria)
 │   ├── controller/   # Controllers REST e MVC
 │   ├── repository/   # Repositórios (JpaRepository)
 │   ├── config/       # DadosIniciais.java (carga de dados)
 │   └── GerenciadorDeTarefasApplication.java
 │
 ├── src/main/resources/
 │   ├── static/       # HTML, CSS e JS
 │   ├── templates/    # Páginas Thymeleaf (opcional)
 │   └── application.properties
 │
 ├── pom.xml
 └── README.md
```

---

## ▶️ Como Executar o Projeto

### 🔧 Pré-requisitos

* Java 21
* Maven (ou Maven Wrapper)

### 🚀 Passo a Passo

```bash
# 1. Clone o repositório
git clone https://github.com/SEU_USUARIO/gerenciador-tarefas.git

# 2. Acesse a pasta do projeto
cd gerenciador-tarefas

# 3. Execute a aplicação
./mvnw spring-boot:run
# ou
mvn spring-boot:run
```

### 🌐 Acesso

* Aplicação Web: **[http://localhost:8080](http://localhost:8080)**
* Console H2 (ambiente de desenvolvimento):

  * URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  * JDBC URL: `jdbc:h2:mem:testdb`
  * Usuário: `sa`
  * Senha: *(em branco)*

---

## 🔗 Endpoints da API REST

| Método | Endpoint            | Descrição              |
| ------ | ------------------- | ---------------------- |
| GET    | `/api/tarefas`      | Lista todas as tarefas |
| GET    | `/api/tarefas/{id}` | Busca tarefa por ID    |
| POST   | `/api/tarefas`      | Cria nova tarefa       |
| PUT    | `/api/tarefas/{id}` | Atualiza tarefa        |
| DELETE | `/api/tarefas/{id}` | Remove tarefa          |

---

## 📦 Exemplo de JSON (POST / PUT)

```json
{
  "titulo": "Estudar Spring Security",
  "descricao": "Implementar JWT e OAuth2",
  "prioridade": "ALTA",
  "categoriaId": 2,
  "concluida": false
}
```

---

## 🚀 Evoluções Sugeridas

* Uso de DTOs
* Validações com Bean Validation
* Paginação e ordenação
* Spring Security (login + JWT)
* Banco PostgreSQL
* Deploy em nuvem

---

## 📌 Projeto para Portfólio

Este projeto demonstra:

* Organização em camadas
* CRUD completo
* API REST
* JPA / Hibernate
* Boas práticas com Spring Boot

Perfeito para **GitHub e currículo** 🚀

---

👨‍💻 Desenvolvido para fins de estudo com **Java + Spring Boot**

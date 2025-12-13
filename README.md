Markdown# Gerenciador de Tarefas  
**Sistema completo de tarefas com categorias, prioridades e status**  
Desenvolvido com Java 21 + Spring Boot 3

![Java](https://img.shields.io/badge/Java-21-%23ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3+-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![H2](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge&logo=h2&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)



## Funcionalidades

- Cadastro, edição, exclusão e listagem de tarefas  
- Categorias personalizadas  
- Prioridades: Alta · Média · Baixa  
- Marcar tarefa como concluída  
- Interface web moderna + API REST completa  
- Banco H2 em memória (ideal para testes e estudos)  
- Dados iniciais pré-cadastrados  

## Tecnologias

| Camada           | Tecnologia                        |
|------------------|-----------------------------------|
| Linguagem        | Java 21                           |
| Framework        | Spring Boot 3 + Spring MVC        |
| Persistência     | Spring Data JPA + Hibernate       |
| Banco de dados   | H2 Database (em memória)          |
| Build            | Maven                             |
| Template Engine  | Thymeleaf (ou uso como API pura)  |
| Front-end        | HTML5, CSS3, Vanilla JS           |

## Estrutura do Projeto
gerenciador-tarefas/
├── src/main/java/br/com/gerenciador/tarefas/
│   ├── model/          # Entidades JPA (Tarefa, Categoria)
│   ├── controller/     # Controllers REST + MVC
│   ├── repository/     # Repositórios JpaRepository
│   ├── config/         # DadosIniciais.java (carga inicial)
│   └── GerenciadorDeTarefasApplication.java
├── src/main/resources/
│   ├── static/         # index.html, estilo.css, script.js
│   ├── templates/      # Páginas Thymeleaf (opcional)
│   └── application.properties
├── pom.xml
└── README.md
text## Como Executar

### Pré-requisitos
- Java 21
- Maven (ou use o wrapper `./mvnw`)

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/SEU_USUARIO/gerenciador-tarefas.git

#2. Entre na pasta
cd gerenciador-tarefas

#3. Execute a aplicação
./mvnw spring-boot:run
# ou
mvn spring-boot:run
Acesse: http://localhost:8080
Console H2 (apenas em dev)
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: (em branco)
Endpoints da API REST




Método,Endpoint,Descrição
GET,/api/tarefas,Lista todas as tarefas
GET,/api/tarefas/{id},Busca tarefa por ID
POST,/api/tarefas,Cria nova tarefa
PUT,/api/tarefas/{id},Atualiza tarefa
DELETE,/api/tarefas/{id},Remove tarefa


{
  "titulo": "Estudar Spring Security",
  "descricao": "Implementar JWT e OAuth2",
  "prioridade": "ALTA",
  "categoriaId": 2,
  "concluida": false
}

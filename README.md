README.md – Gerenciador de Tarefas (Profissional)
# 📝 Gerenciador de Tarefas  
Sistema completo para cadastro, listagem e gerenciamento de tarefas com categorias e prioridades, desenvolvido em **Java 21 + Spring Boot**.

---

## 🚀 Tecnologias utilizadas
- **Java 21**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database** (modo dev)
- **Maven**
- **HTML, CSS e JavaScript**
- **Thymeleaf ou API REST (dependendo de uso futuro)**

---

## 📂 Estrutura do projeto



gerenciador-tarefas/
├── src/main/java/br/com/gerenciador/tarefas/
│ ├── model/ # Entidades (Tarefa, Categoria, Prioridade)
│ ├── controller/ # Controladores REST
│ ├── repositorio/ # Interfaces JpaRepository
│ ├── config/ # Carga de dados iniciais
│ └── GerenciadorDeTarefasApplication.java
│
├── src/main/resources/
│ ├── static/ # index.html, CSS e JS
│ └── application.properties
│
├── pom.xml # Dependências Maven
└── README.md


---

## ⚙️ Configuração do ambiente

### **Pré-requisitos**
- Java 21 instalado
- Maven instalado (ou usar o wrapper `./mvnw`)
- IDE recomendada: IntelliJ IDEA / VSCode / Eclipse

---

## ▶️ Como executar o projeto

### **1. Clonar o repositório**
```bash
git clone https://github.com/SEU_USUARIO/gerenciador-tarefas.git

2. Acessar a pasta
cd gerenciador-tarefas

3. Rodar o projeto
./mvnw spring-boot:run


ou

mvn spring-boot:run

4. Acessar no navegador
http://localhost:8080

🧩 Modelagem
Tarefa

id

título

descrição

prioridade (BAIXA, MEDIA, ALTA)

categoria

data de criação

concluída (true/false)

Categoria

id

nome

Prioridade

Enum com valores:

ALTA

MEDIA

BAIXA

📡 Endpoints Principais (API REST)
Listar tarefas
GET /api/tarefas

Buscar tarefa por ID
GET /api/tarefas/{id}

Criar tarefa
POST /api/tarefas
Body (JSON):
{
  "titulo": "Estudar Java",
  "descricao": "Revisar POO",
  "prioridade": "ALTA",
  "categoriaId": 1
}

Atualizar tarefa
PUT /api/tarefas/{id}

Excluir tarefa
DELETE /api/tarefas/{id}

💾 Banco de dados

O projeto utiliza H2 Database em memória para facilitar testes.

Acesse o console web:

http://localhost:8080/h2-console


Configurações padrão:

JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:

🌱 Dados iniciais

O arquivo DadosIniciais.java cria:

Categorias base

Tarefas de exemplo

Prioridades

🖥️ Interface Web

A pasta src/main/resources/static/ possui:

index.html

estilo.css

script.js

Uma interface simples para visualizar e interagir com as tarefas.

📜 Licença

Este projeto é distribuído sob a licença MIT.
Sinta-se livre para usar, modificar e distribuir.

👤 Autor

Washington Jesus
Projeto desenvolvido para estudos e prática profissional em Java + Spring Boot.


---

Se quiser, posso:

✅ **Gerar um README ainda mais profissional**  
✅ **Adicionar badges (Java, Spring Boot, Status, Licença)**  
✅ **Criar um diagrama UML do sistema**  
✅ **Gerar documentação completa dos endpoints (Swagger/Redoc)**  
✅ **Criar a logo do projeto**  

Deseja que eu incremente esse README? ​:contentReference[oaicite:0]{index=0}​

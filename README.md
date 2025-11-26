# 📚 Gerenciador de Livros — API RESTful com Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![Status](https://img.shields.io/badge/Status-Ativo-success)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

Uma API RESTful simples e eficiente para o gerenciamento de livros.  
Desenvolvida com *Spring Boot*, seguindo boas práticas de arquitetura, validação e organização de código.

---

## ✨ Funcionalidades

- Cadastrar novos livros  
- Listar todos os livros  
- Buscar livro por ID  
- Atualizar informações do livro  
- Remover livro do sistema  

---

## 🛠 Tecnologias utilizadas

- *Java 17*  
- *Spring Boot 3*  
- *Spring Web*  
- *Spring Data JPA*  
- *Validation API*  
- *H2 / MySQL / PostgreSQL* (dependendo da configuração)  
- *Maven*  

---

## 📂 Estrutura do Projeto

<pre>src/<br>
  └── main/<br>
      ├── java/<br>
      |   └── com.example.livros<br>
      |      ├── config<br>
      |      |      └── OpenApiConfig<br>
      |      ├── domain<br>
      |      |      └── Book<br>
      |      ├── dto<br>
      |      |      └── BookRequest<br>
      |      |      └── BookResponse<br>
      |      ├── exception<br>
      |      |      └── ApiExceptionHandler<br>
      |      |      └── DuplicateResourceException<br>
      |      |      └── ResourceNotFoundException<br>
      |      ├── mapper<br>
      |      |      └── BookMapper<br>
      |      ├── repository<br>
      |      |      └── BookRepository<br>
      |      ├── service<br>
      |      |      └── BookService<br>
      |      └── web<br>
      |              └── GerenciadorDeLivrosApplication<br>
      └── resources<br>
             └──application.properties<br></pre>

---

## 🚀 Como rodar o projeto

### Pré-requisitos
- Java 17+
- Maven 3.8+
- Git

### Passos

# Clonar o repositório
git clone https://github.com/GabrielCosta06/gerenciador-livro-springboot-com-restful.git

# Entrar no diretório
cd gerenciador-livro-springboot-com-restful

# Compilar e rodar
mvn spring-boot:run

--------------------

📌 Endpoints da API

📚 Listar todos os livros<br>
GET /livros<br>

🔍 Buscar por ID<br>
GET /livros/{id}<br>

➕ Cadastrar um livro<br>
POST /livros<br>

Corpo da requisição:<br>
{<br>
  "titulo": "Clean Code",<br>
  "autor": "Robert C. Martin",<br>
  "isbn": "9780132350884",<br>
  "ano": 2009<br>
}<br>

✏ Atualizar um livro<br>
PUT /livros/{id}<br>

🗑 Deletar um livro<br>
DELETE /livros/{id}<br>

🗂 Exemplos de Respostas<br>
✔ Sucesso<br>
{<br>
  "id": 1,<br>
  "titulo": "Clean Code",<br>
  "autor": "Robert C. Martin",<br>
  "isbn": "9780132350884",<br>
  "ano": 2009<br>
}<br>

❌ Erro (exemplo)<br>
{<br>
  "timestamp": "2025-11-25T12:30:15",<br>
  "status": 404,<br>
  "message": "Livro não encontrado",<br>
  "path": "/livros/999"<br>
}<br>

--------------------

🧪 Coleção Postman<br>
Você pode importar esta coleção para testar a API:<br>
📁 postman_collection.json<br>

--------------------

🏛 Arquitetura da Aplicação<br>
flowchart TD<br>
    C[Controller] --> S[Service]<br>
    S --> R[Repository]<br>
    R --> DB[(Banco de Dados)]<br>

--------------------

⚙ Configuração de Banco de Dados

⭐ H2 (padrão para desenvolvimento)<br>
application.properties:<br>
spring.h2.console.enabled=true<br>
spring.datasource.url=jdbc:h2:mem:livrosdb<br>
spring.datasource.driverClassName=org.h2.Driver<br>
spring.jpa.hibernate.ddl-auto=create<br>

📦 MySQL (exemplo)<br>
spring.datasource.url=jdbc:mysql://localhost:3306/livros<br>
spring.datasource.username=root<br>
spring.datasource.password=1234<br>
spring.jpa.hibernate.ddl-auto=update<br>

--------------------

📈 Melhorias Futuras (Roadmap)<br>
    • Autenticação com JWT<br>
    • Documentação com Swagger (OpenAPI)<br>
    • Paginação e ordenação<br>
    • Testes unitários e de integração<br>
    • Upload da capa do livro<br>
    • Suporte a múltiplas categorias de livros<br>
    • Deploy em container Docker<br>

--------------------

🤝 Como contribuir<br>

1. Faça um fork do repositório<br>

2. Crie uma branch com sua feature:<br>
git checkout -b minha-feature<br>

3. Faça commit das suas alterações:<br>
git commit -m "Minha nova feature"<br>

4. Envie para seu repositório:<br>
git push origin minha-feature<br>

5. Abra um Pull Request<br>

--------------------

📜 Licença<br>
Este projeto está licenciado sob a MIT License.<br>
Sinta-se livre para usar, estudar, modificar e compartilhar.<br>

--------------------

👨‍💻 Autor<br>
Projeto desenvolvido por José Gabriel, Matheus Tavares e Gabriel Souza.<br>




# Challenge Odontoprev
<p align="center">  <img loading="lazy" src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>  </p>

## Índice

1. [Sobre o Projeto](#sobre-o-projeto)
2. [Arquitetura da Solução](#arquitetura-da-solução)
3. [Funcionalidades Principais](#funcionalidades=principais)
4. [Como Rodar o Projeto](#como-rodar-o-projeto)
5. [Pré-requisitos](#pré-requisitos)
6. [Modelo Relacional (DER)](#modelo-relacional-der)
7. [Diagrama de Classes](#diagrama-de-classes)
8. [Documentação da API](#documentação-da-api)
9. [Video](#video)

---

## Sobre o Projeto

Este projeto consiste em uma aplicação de gerenciamento para uma clínica odontológica. Ele permite que dentistas, pacientes e clínicas gerenciem consultas, feedbacks, sinistros, formulários detalhados e muito mais. A aplicação utiliza tecnologias como Java, Spring Boot, e um banco de dados relacional para facilitar o gerenciamento eficiente das operações diárias da clínica.

## Arquitetura da Solução
![Arquitetura da Solução](Diagrama%20sem%20nome.drawio.png)

**Funcionalidades principais**
- Cadastro de pacientes, dentistas e clínicas.
- Marcação e controle de consultas.
- Gerenciamento de formulários detalhados de pacientes.
- Recepção de feedbacks e controle de sinistros.
 
## Como Rodar o Projeto

Para rodar a aplicação Java Spring Boot, siga as instruções abaixo:
 #### Pré-requisitos 
 - **Java 17** ou superior instalado 
 - - **Maven** instalado 
 - - **Banco de Dados Oracle** configurado e em execução 
 - - **IDE** (como IntelliJ IDEA ou Eclipse) para editar e executar o projeto (opcional) 
 #### Passos para rodar a aplicação 
 1. **Clonar o repositório**
  
```sh
    git clone https://github.com/patinaomi/sprint-3-devops
    cd sprint-3-devops
```
2. **Configurar o banco de dados**
No arquivo `application.properties` ou `application.yml` (localizado em `src/main/resources`), configure os detalhes do banco de dados, como a URL, nome de usuário e senha:

```sh
    spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521/orcl
    spring.datasource.username=seu-usuario
    spring.datasource.password=sua-senha
    spring.datasource.driver-class
    name=oracle.jdbc.OracleDriver
```

3. **Instalar dependências**
Execute o comando Maven para baixar as dependências necessárias:
```sh
    mvn clean install
```

4. **Executar a aplicação**
Com as dependências instaladas, rode a aplicação com:
```sh
    mvn spring-boot:run
```
5.  **Acessar a aplicação**
    
    -   A aplicação estará disponível em: `http://localhost:8080`
    -   A documentação Swagger estará disponível em: `http://localhost:8080/swagger-ui.html`

#### Observações

-   Certifique-se de que o banco de dados está em execução antes de iniciar a aplicação.
-   Para testes, você pode utilizar o **Postman** ou acessar diretamente o **Swagger UI** para testar os endpoints.


## Modelo Relacional (DER)
![Modelo Relacional](Relational_1.png)

## Diagrama de Classes
![Diagrama de Classes](diagrama-de-classes.png)

![Domains](domains.png)

## Documentação da API
Foi realizada a documentação da API utilizando **Swagger**, o que facilita a visualização e teste de todos os endpoints disponíveis no sistema. Para acessar a documentação completa, basta visitar o link [Swagger](http://localhost:8080/swagger-ui/index.html#/) quando o projeto estiver em execução.

Além disso, o projeto conta com um arquivo de exportação do Postman contendo todas as requisições para teste dos endpoints da API. Esse arquivo pode ser importado diretamente no Postman, facilitando a realização de testes e a validação das funcionalidades disponíveis. Basta acessar o arquivo [por este link](https://github.com/patinaomi/delfos-machine/blob/main/JAVA%20ADVANCED/sprint-2/Challenge%20Odontoprev.postman_collection.json) e importar no Postman para ter acesso a todas as operações configuradas.

#### Cliente

- **GET /clientes**: Lista todos os clientes.
- **POST /clientes/criar**: Cria um novo cliente.
- **GET /clientes/{id}**: Retorna os detalhes de um cliente específico pelo ID.
- **PUT /clientes/{id}**: Atualiza as informações de um cliente.
- **PATCH /clientes/{id}/**: Atualiza parcialmente um dado do cliente.
- **DELETE /clientes/{id}**: Remove um cliente.

#### Consulta

- **GET /consultas**: Lista todas as consultas.
- **POST /consultas/criar**: Cria uma nova consulta.
- **GET /consultas/{id}**: Retorna os detalhes de uma consulta específica pelo ID.
- **PUT /consultas/{id}**: Atualiza as informações de uma consulta.
- **PATCH /consultas/{id}**: Atualiza o dado parcial da consulta.
- **DELETE /consultas/{id}**: Remove uma consulta.

#### Dentista

- **GET /dentistas**: Lista todos os dentistas.
- **POST /dentistas/criar**: Cria um novo dentista.
- **GET /dentistas/{id}**: Retorna os detalhes de um dentista específico pelo ID.
- **PUT /dentistas/{id}**: Atualiza as informações de um dentista.
- **PATCH /dentistas/{id}**: Atualiza um dado parcial do dentista.
- **DELETE /dentistas/{id}**: Remove um dentista.

## Feedback

- **GET /feedbacks**: Lista todos os feedbacks.
- **POST /feedbacks/criar**: Cria um novo feedback.
- **GET /feedbacks/{id}**: Retorna os detalhes de um feedback específico pelo ID.
- **PUT /feedbacks/{id}**: Atualiza as informações de um feedback.
- **PATCH /feedbacks/{id}**: Atualiza um dado parcial do feedback.
- **DELETE /feedbacks/{id}**: Remove um feedback.

## Formulário Detalhado

- **GET /formularios**: Lista todos os formulários detalhados.
- **POST /formularios/criar**: Cria um novo formulário detalhado.
- **GET /formularios/{id}**: Retorna os detalhes de um formulário específico pelo ID.
- **PUT /formularios/{id}**: Atualiza as informações de um formulário detalhado.
- **PATCH /formularios/{id}**: Atualiza um dado no formulário.
- **DELETE /formularios/{id}**: Remove um formulário detalhado.

## Sinistro

- **GET /sinistros**: Lista todos os sinistros.
- **POST /sinistros/criar**: Cria um novo sinistro.
- **GET /sinistros/{id}**: Retorna os detalhes de um sinistro específico pelo ID.
- **PUT /sinistros/{id}**: Atualiza as informações de um sinistro.
- **PATCH /sinistros/{id}**: Atualiza um dado parcial de um sinistro.
- **DELETE /sinistros/{id}**: Remove um sinistro.


## Video
Também disponibilizamos um vídeo no YouTube demonstrando nossa solução e explicando as principais funcionalidades do projeto. Você pode assisti-lo através do seguinte link: [Link do Video no Youtube](https://youtu.be/XrRJLczRDN4)

## 🧑‍🤝‍🧑 Equipe

| <h3>Claudio Bispo</h3><img src="https://avatars.githubusercontent.com/u/110735259?v=4" width=180px> <h6>RM553472</h6> <a href="https://github.com/claubis"><img src="https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white"></a> <a href="https://www.linkedin.com/in/claudiosbispo"><img src="https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white"></a> <a href="https://www.instagram.com/_claudiobispo/"><img src="https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white"></a>|<h3>Patricia Naomi</h3> <img src="https://avatars.githubusercontent.com/u/132932532?v=4" width=180px><h6>RM552981</h6> <a href="https://github.com/patinaomi"><img src="https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white"></a> <a href="https://www.linkedin.com/in/patinaomi/"><img src="https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white"></a> <a href="https://www.instagram.com/naomipati/"><img src="https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white"></a>|
|--|--|


[:arrow_up: voltar para o índice :arrow_up:](#índice)


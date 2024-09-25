<img src="./img/banner github.png"/> <br><br>

# Desafio: Modelo de Domínio e ORM

## Descrição do Projeto

Este projeto é uma aplicação desenvolvida em **Spring Boot** com **Java** e **H2 Database** que tem como objetivo gerenciar as informações dos participantes e atividades de um evento acadêmico. O sistema permite cadastrar diversas atividades, como palestras, cursos e oficinas práticas, além de armazenar os blocos de horários em que as atividades ocorrem e o cadastro dos participantes.

O modelo de domínio foi implementado seguindo o padrão ORM (Mapeamento Objeto-Relacional), utilizando o **Hibernate** para o gerenciamento das entidades e o banco de dados **H2** para armazenamento. A aplicação faz o "seeding" automático da base de dados com dados predefinidos, conforme especificado no diagrama de objetos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.4**
- **Spring Data JPA (Hibernate)**
- **H2 Database** (em memória)
- **Maven** para gerenciamento de dependências

## Modelo Conceitual

O sistema gerencia as seguintes entidades:

- **Categoria**: Representa a categoria de uma atividade (ex: Curso, Oficina, Palestra).
- **Atividade**: Representa uma atividade do evento, como uma palestra ou um curso. Cada atividade possui:
  - Nome
  - Descrição
  - Preço
  - Um conjunto de blocos de horários
- **Bloco**: Representa um bloco de horário em que uma atividade ocorre. Cada bloco possui:
  - Início do bloco (data/hora)
  - Fim do bloco (data/hora)
- **Participante**: Representa os participantes do evento, com:
  - Nome
  - Email
- **AtividadeParticipante**: Tabela intermediária que relaciona participantes e atividades (associação N:N).

## Estrutura do Projeto UML
![image](https://github.com/user-attachments/assets/02947029-e98b-42eb-b2fa-3b6b6905f782)

## Instância dos dados para seeding
![image](https://github.com/user-attachments/assets/ebc4f88d-b9bf-40a5-a77b-181b19b2343a)

## O projeto segue a arquitetura MVC (Model-View-Controller):

- **entities**: Representa as entidades do domínio.

## Executando o Projeto

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- **Java 17** ou superior
- **Maven**

### Passos para execução

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/desafio-modelo-dominio-orm.git
   ````
   Navegue até o diretório do projeto:

 ```bash
cd desafio-modelo-dominio-orm
Compile e execute o projeto com o Maven:

mvn spring-boot:run
````
### Acesse o H2 Console no seu navegador através do seguinte endereço:

````
Copiar código
http://localhost:8080/h2-console
Use as seguintes credenciais de conexão:

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (deixe em branco)
`````
### Verifique as tabelas e dados gerados no banco H2. O banco de dados deverá conter as seguintes tabelas:
- tb_categoria
- tb_atividade
- tb_bloco
- tb_participante
- tb_atividade_participante
  
Estrutura de Arquivos
````bash
src/
│
├── main/
│   ├── java/com/devgabriellucas/desafio/
│   │   ├── entities/
│   └── resources/
│       ├── application.properties
│       └── import.sql
└── test/
````
### Observações
- O projeto foi configurado para criar o banco de dados H2 automaticamente ao ser iniciado.
- O arquivo import.sql é utilizado para inserir os dados de exemplo automaticamente no banco de dados.

  <img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=4C89F8&height=120&section=footer"/>


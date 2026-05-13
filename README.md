# Mastersys sistema de gerenciamento de academias de artes marciais.

Sistema back-end para gestão de alunos, matrículas e turmas em academias de artes marciais, desenvolvido com Java, Spring Boot e MySQL.

## Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Instalação e Configuração](#instalação-e-configuração)
- [Estrutura do Banco de Dados](#estrutura-do-banco-de-dados)
- [Endpoints da API](#endpoints-da-api)
- [Como Testar](#como-testar)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre o Projeto

Este sistema foi desenvolvido para academias de artes marciais (Jiu-Jitsu, Karatê, Judô, Muay Thai, etc.), permitindo o gerenciamento eficiente de:

- Cadastro completo de alunos
- Controle de turmas e horários
- Gestão de matrículas e planos
- Registro de frequência e avaliações
- Controle de faixas/graduações

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 3.x** - Framework principal
  - Spring Data JPA - Persistência de dados
  - Spring Web - API REST
  - Spring Validation - Validação de dados
- **MySQL 8.x** - Banco de dados relacional
- **Maven** - Gerenciador de dependências
- **Lombok** - Redução de código boilerplate
- **BaseURL-HTTP** - Teste da API 

## Funcionalidades

- CRUD completo de alunos
- CRUD de turmas
- Controle de matrículas
- Registro de frequência por aula
- Controle de pagamentos/mensalidades
- Sistema de graduação (faixas/belt ranks)
- Relatórios de alunos por turma
- Busca de alunos por nome, faixa ou status
- Validação de dados (CPF, email, datas)

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL Server 8+](https://dev.mysql.com/downloads/mysql/)
- [Git](https://git-scm.com/)

## Instalação e Configuração

### Clone o repositório

```bash
git clone https://github.com/victor-hugo-oliveira-dev/mastersys.git
cd mastersys

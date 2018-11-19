# Trabalho Final - Disciplina Linguagem de Programação I
Pequena aplicação para cadastrar itens em um estoque. Esta
aplicação permite ao usuário a entrada de dados, bem como consulta, edição e remoção de itens do estoque. Este tipo de aplicação é conhecido como CRUD – da sigla em
inglês para Create Read Update Delete – isto é, “Criar Ler Atualizar Remover”, que é amplamente utilizado em sistemas deste tipo.
Para a camada de persistência, utilizamos um banco de dados relacional, o MySQL, e JDBC (Java) para comunicar com o mesmo.

## Sumário
  - [Introdução](#introdu%C3%A7%C3%A3o)
    - [Pré-requisitos](#pr%C3%A9-requisitos)
    - [Instalação do Trabalho](#instala%C3%A7%C3%A3o-do-trabalho)
  - [Autora](#autora)

## Introdução

Nessa seção é descrito as dependências utilizadas no trabalho como um todo e instruções de como iniciar e rodar o trabalho.

### Pré-requisitos

O que foi necessário para rodar o trabalho: 

- Eclipse
- Docker ou MySQL Workbench instalado direto na máquina

### Instalação do Ambiente com Docker

Passos necessários para rodar o trabalho: 

- Clonar no projeto: 
```
  git clone https://github.com/barbbecker/trabalho-crud-java.git
```
- Abrir o terminal no diretório Resources:
```
docker-compose up
```

- Rodar o script do mySQL que está dentro da pasta Resources, para assim importar o squema do banco.

- Após abrir o projeto no Eclipse.

## Autora

* *Bárbara Becker da Rosa* -  [GitHub](https://github.com/barbbecker)
* E-mail: [bbeckerdarosa@gmail.com](bbeckerdarosa@gmail.com)
<a>
  <img 
  alt="Imagem da Autora Bárbara Becker" src="https://avatars1.githubusercontent.com/u/39573350?s=400&u=3a24cbbb390e39b0eaab3c8278124a8b8ee252ae&v=4" width="100">
</a>

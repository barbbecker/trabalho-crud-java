# Trabalho Final - Disciplina Linguagem de Programação I
Pequena aplicação para cadastrar itens em um estoque. Esta
aplicação permite ao usuário a entrada de dados, bem como consulta, edição e
remoção de itens do estoque. Este tipo de aplicação é conhecido como CRUD – da sigla em
inglês para Create Read Update Delete – isto é, “Criar Ler Atualizar Remover”, que é
amplamente utilizado em sistemas deste tipo.
Para a camada de persistência, iremos utilizar um banco de dados relacional, o MySQL, e
JDBC (Java) para comunicar com o mesmo.

## Sumário
  - [Introdução](#introdu%C3%A7%C3%A3o)
    - [Principais recursos utilizados](#principais-recursos-utilizados)
    - [Pré-requisitos](#pr%C3%A9-requisitos)
    - [Instalação do Ambiente](#instala%C3%A7%C3%A3o-do-ambiente)
    - [Uso do GitHub](#uso-do-github)
  - [Possíveis melhorias](#poss%C3%ADveis-melhorias)
  - [Autoras](#autoras)
  - [License](#license)

## Introdução

Nessa seção é descrito as dependências utilizadas na aplicação como um todo e instruções de como iniciar o projeto em modo de desenvolvimento.

### Principais recursos utilizados

* [Angular](http://angular.io) - O framework web utilizado. Versão 6 utilizada, última até o momento.
* [Node](https://nodejs.org/) - Necessário para o Angular.
* [NPM](https://www.npmjs.com) - Gerenciador de Dependências.
*  [Angular Material](https://material.angular.io/) - Framework de estilo.
*  [GitHub](https://github.com/) - Repositório de versionamento do código.


### Pré-requisitos

O que foi necessário para rodar o projeto: 

- Node versão v10.9.0
- GIT instalado
- Conta no GitHub

### Instalação do Ambiente

Passos necessários para rodar o projeto: 

- Clonar no projeto: 
```
  git clone https://github.com/s2b-barbaras/achei_frontend
```
- Instalar o angular-cli para ter acesso as ferramentas necessárias para rodar um projeto Angular em desenvolvimento: 

```
npm install -g @angular/cli
```

- Entrar no diretório do projeto e instalar as dependências necessárias:

```
cd achei_frontend

npm install
```

- rodar o projeto:
```
npm start ou ng serve
```

NOTA: O comando npm start configurado nos scripts do package.json, executa o --aot para já evitar possíveis erros na hora de gerar uma build com esse recurso, que otimiza o bundle final.

- Se tudo der certo no terminal, abra no navegador pela URL localhost:4200 que qualquer modificação no projeto refletirá no browser.
  - https://localhost:4200


### Uso do GitHub
  - Criação de um kanban com as etapas Todo, Doing e Closed. [Link do Board](https://github.com/orgs/s2b-barbaras/projects/1)
  - Criação de issues para poder relacionar nos commits.
  [Link das Issues](https://github.com/s2b-barbaras/achei_frontend/issues)


## Possíveis melhorias

- Expandir para outros domínios de utilidade (cinemas, postos de gasolina, etc).
- Limitar a quantidade que vem da lista, através de um parâmetro de raio de localização.
- Rotas e Direções.
- Adicionar campos com descrições dos lugares no modal detalhes.
  
## Autoras

* *Bárbara Becker da Rosa* -  [GitHub](https://github.com/barbbecker)
* E-mail: [bbeckerdarosa@gmail.com](bbeckerdarosa@gmail.com)
<a>
  <img 
  alt="Imagem da Autora Bárbara Becker" src="https://avatars1.githubusercontent.com/u/39573350?s=400&u=3a24cbbb390e39b0eaab3c8278124a8b8ee252ae&v=4" width="100">
</a>

* *Bárbara Anger* -  [GitHub](https://github.com/BarbaraAnger)
* E-mail: [barbaraanger@hotmail.com](barbaraanger@hotmail.com)
<a>
  <img 
  alt="Imagem da Autora Bárbara Anger" src="https://avatars3.githubusercontent.com/u/28331915?s=400&v=4" width="100">
</a>

## License

Este projeto possui Licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para saber mais detalhes.

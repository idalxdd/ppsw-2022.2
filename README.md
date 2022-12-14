<h1 align="center"> 
[Disciplina de Padrões de Projeto de Software - PPSW]
</h1>
<h4 align="center"> 
    Universidade de Pernambuco | Campus Garanhuns | Curso de Engenharia de Software
</h4>
<h4 align="center"> 
 🚧 Estudo aplicado de padrões de projeto de software 🚀 em construção... 🚧
</h4>
<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/upe-garanhuns/ppsw?color=%2304D361">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/upe-garanhuns/ppsw">
  <a href="https://github.com/upe-garanhuns/ppsw/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/upe-garanhuns/ppsw">
  </a>
</p>

## __Estrutura__

- [Sobre](#sobre)
- [Requisitos](#requisitos)
- [Configuração de Ambiente](#configuracao)
- [Referências](#referencias)
- [Licença](#license)
- [Sobre](#sobre)

---

## __Sobre__

Vivenciar a experiência de aplicar na prática os conhecimentos sobre padrões de projeto de software. Utilizamos como linguagem de referência Java utilizando Spring Boot.

## __Requisitos__

- Git
- SDKMan (0pcional)
- Java Virtual Machine 11
- Apache Maven 3.6.3
- Eclipse IDE for Enterprise Java Developers ou Visual Studio Code
- Spring Tool Suite 4 (STS)

---

## __Configuração de Ambiente__

### __SDKMan__

Você pode utilizar o SDKMan para realizar a configuração do seu ambiente. Por ele conseguimos instalar e gerenciar as versões do JDK, Apache Maven e do Spring Tools.

Neste [link](https://sdkman.io/install) seguindo as instruções de instalação você consegue instalá-lo facilmente.

**PS**: Existe um [BUG](https://github.com/sdkman/sdkman-cli/issues/593) no SDKMAN no Windows que não efetua corretamente a troca de versões dos sdks na pasta current. 
Para corrigi-lo é necessário fazer uma alteração no arquivo *.bashrc* que existe na sua pasta de usuário.

1. Abra o arquivo ´.bashrc´
2. Acrescente uma linha em branco no início do arquivo
3. Cole esta instrução ´export MSYS=winsymlinks:lnk´ na linha criada.
4. Salve o arquivo

### __Máquina Virtual Java__

O Eclipse 4.7, que é compatível com o Spring Tool Suite, precisa da JVM na versão 11

Para instalar o JDK utilizando o SDKMan siga os seguintes passos:

    1. Abra seu terminal de comando e instale o jdk utilizando o seguinte comando ´sdk install java 11.0.8.j9-adpt´
    2. Torne a versão instalada como padrão ´sdk use java 11.0.8.j9-adpt´
    3. Feche o seu terminal
    3. Crie a variável de ambiente JAVA_HOME apontando para o diretorio padrão de instalação do Java no SDKMan (C:\Users\SEU_USUARIO\.sdkman\candidates\java\current)
    4. Acrescente a variável JAVA_HOME\bin à sua variável PATH
    5. Abra um novo terminal e execute ´java -version´ para ter certeza que o jdk foi atualizado 

Para instalar o JDK manualmente siga os seguintes passos:
    1. Acesse o site da [Oracle](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) e realize o download da versão compativel com o seu sistema operacional
    2. Realize os passos de instalação padrão
    3. Crie a variável de ambiente JAVA_HOME apontando para a pasta em que instalou o JDK
    4. Adicione a variavel JAVA_HOME\bin à sua variável PATH
    5. Remova a referêcnia padrão que a instalação do JDK adiciona a sua variável PATH (nomalmente aponta para a pasta bin do JDK)

### __Maven__

Para instalar o Apache Maven utilizando o SDKMan siga os seguintes passos:

    1. Abra seu terminal de comando e instale o jdk utilizando o seguinte comando ´sdk install maven´
    2. Feche o seu terminal
    3. Crie a variável de ambiente %M2_HOME% apontando para o diretorio padrão do maven (C:\Users\SEU_USUARIO\.sdkman\candidates\maven\current)
    4. Abra o seu terminal e execute ´mvn -version´ no terminal de comando para ter certeza que o Maven foi instalado corretamente

### __GitHub da Disciplina__

Caso deseje você pode utilizar o cliente [GitKraken](https://www.gitkraken.com/git-client)

1. Faça o aceite do convide enviado.
2. Aceite o assignment
3. Realize o download da sua branch conforme as orientações apresentadas em sala de aula

- Lembre-se de ter configurado as variáveis de usuário no seu arquivo global do git

  - ´git config --global user.email "you@example.com"´
  - ´git config --global user.name "Your Name"

### __Eclipse__

1. Acesse o site do [Eclipse](https://www.eclipse.org/downloads/) e realize o download da versão compatível com o seu ambiente de desenvolvimento
2. Realize a instalação ou descompate no seu diretório de trabalho
3. Execute o eclipse e aponte/crie seu workspace de trabalho

### __Visual Studio Code__

1. Acesse o site do [Visual Studio Code](https://code.visualstudio.com/download) e realize o download da versão compatível com o seu ambiente de desenvolvimento
2. Realize a instalação ou descompate no seu diretório de trabalho
3. Execute o vscode e aponte/crie seu workspace de trabalho

### __Spring Tool Suite__

#### __>> No Eclipse__

1. No Eclipse acesse o menu ´Help > Eclipse Marketplace´ e procure por ´Spring Tools´
2. Clique em ´install´ e execute os passos de instalação
3. Seu Eclipse será reiniciado
4. Execute o Eclipse apontando para o workspace onde realizou o clone do projeto que está estudando

#### __>> No Visual Studio Code__

1. No VSCode acesse o menu View > Extensions´ e procure por ´Spring Tools´
2. Clique em ´install´ e execute os passos de instalação
3. Seu VSCode será reiniciado
4. Execute o VScode apontando para o diretorio onde realizou o clone do projeto que está estudando

---

## __Licença__

MIT License

Copyright (c) [2017] [James Q Quick]

---

## __Autor__

- Twitter - [@hbarreiros_](https://twitter.com/hbarreiros_)

[Voltar](#estrutura)
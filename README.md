<h1 style="text-align: center; font-weight: bold;">RabbitMQ com Spring AMQP</h1>

<p align="center">
  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
</p>

<h4 align="center"> 
	🚧  RabbitMQ com Spring AMQP ♻️ Concluído 🚀 🚧
</h4>

## Sobre o projeto

Criação de três microserviços que são: Pedido, notificação e Cash Back. 
Esses projetos com arquitetura de microserviços permitiu praticar a implementação de comunicação assícrona entre serviços através da mensageria RabbitMQ.

O serviço de Pedido dispara eventos produzindo mensagens para que os serviços de notificação e Cashback ouvem e consomem as mensagens.

As mensagens foram enviadas utilizando Exchange e também com comunicação direta entre filas.

O RabbitMQ e o MySQL foram instalados através de contâener Docker.

## Pré-requisitos

Para executar os projetos vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java](https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc) e [Docker](https://docs.docker.com/desktop/install/windows-install/). 
Além disto é bom ter um editor para trabalhar com o código como [Intellij](https://www.jetbrains.com/pt-br/idea/).

## 🎲 Executando o projeto

```bash
# Clone este repositório
$ git clone <https://github.com/leandro-barros/rabbitmq-springAMQP.git>

# Na classe principal execute o projeto.

# O servidor inciará na porta:
  $ 8080 para OrderService
  $ 8081 para o CashBachService
  $ 8082 para o NotificationService
```

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java 11]()
- [RabbitMQ]()
- [Spring Boot]()
- [Spring MVC]()
- [Spring Data JPA]()
- [Spring AMQP]()
- [MySQL]()
- [Maven]()
- [Docker]()
- [Docker Compose]()
- [Lombok]()

## Autor

<a href="https://www.linkedin.com/in/leandroebarros/">
   <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/13985064?v=4" width="100px;" alt=""/>
  <br />
  <sub><b>Leandro Barros</b></sub></a> <a href="https://www.linkedin.com/in/leandroebarros/" title="leandro">🚀
</a>

[![Linkedin Badge](https://img.shields.io/badge/-Leandro-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leandroebarros/)](https://www.linkedin.com/in/leandroebarros/) 
[![Gmail Badge](https://img.shields.io/badge/-leandroedbarros@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:leandroedbarros@gmail.com)](leandroedbarros@gmail.com)

## 📝 Licença

Projeto esta sobe a licença [MIT](./LICENSE).

By Leandro Barros ❤️  [Entre em contato!](https://www.linkedin.com/in/leandroebarros/)

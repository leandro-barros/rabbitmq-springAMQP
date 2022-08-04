<h1 style="text-align: center; font-weight: bold;">RabbitMQ com Spring AMQP</h1>

---

## Sobre o projeto

Criação de três microserviços que são: Pedido, notificação e Cash Back. 
Esses projetos com arquitetura de microserviços permitiu praticar a implementação de comunicação assícrona entre serviços através da mensageria RabbitMQ.

O serviço de Pedido dispara eventos produzindo mensagens para que os serviços de notificação e Cashback ouvem e consomem as mensagens.

As mensagens foram enviadas utilizando Exchange e também com comunicação direta entre filas.

O RabbitMQ e o MySQL foram instalados através de contâener Docker.

### Pré-requisitos

Para executar os projetos vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java](https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc) e [Docker](https://docs.docker.com/desktop/install/windows-install/). 
Além disto é bom ter um editor para trabalhar com o código como [Intellij](https://www.jetbrains.com/pt-br/idea/).

### 🎲 Executando as APIs Rest

```bash
# Clone este repositório
$ git clone <https://github.com/leandro-barros/rabbitmq-springAMQP.git>

# Na classe principal execute o projeto.

# O servidor inciará na porta:
  $ 8080 para OrderService
  $ 8081 para o CashBachService
  $ 8082 para o NotificationService
```

### 🛠 Tecnologias

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

---

<div> 
  <a href="https://www.linkedin.com/in/leandroebarros/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-   badge&logo=linkedin&logoColor=white" target="_blank"></a> 
</div>

  
LinkedIn: [Leandro Barros](https://www.linkedin.com/in/leandroebarros/)

<h1 style="text-align: center; font-weight: bold;">RabbitMQ com Spring AMQP</h1>

---

## Sobre o projeto

Criação de três microserviços que são: Pedido, notificação e Cash Back. Essa arquitetura permitiu a prática de implementação de comunicação assícrona entre serviços através da mensageria RabbitMq.

O serviço de Pedido dispara eventos produzindo mensagens para que os serviços de notificação e Cashback ouvem e consomem as mensagens.

As mensagens foram enviadas utilizando Exchange e também diretamente para uma fila específica.

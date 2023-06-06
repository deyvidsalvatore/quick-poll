# Quick Poll

Este é um projeto do Quick Poll, uma api de enquetes

## Tecnologias utilizadas

- Java
- Spring Framework

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- JDK (Java Development Kit)
- Maven
- Spring Boot

## Instalação e execução

1. Clone este repositório para o seu ambiente local.
2. Navegue até o diretório do projeto.
3. Execute o comando `mvn spring-boot:run` para iniciar o aplicativo.
4. Abra um navegador da web e acesse `http://localhost:8080` para interagir com o Quick Poll.

## Endpoints
### Poll Controller
* GET /polls
* POST /polls
* GET /polls/{pollId}
* PUT /polls/{pollId}
* DELETE /polls/{pollId}

### Computerresult Controller
* GET /computeresult?pollId={pollId}

### Vote Controller
* POST /polls/{pollId}/votes
* GET /polls/{pollId}/votes

## Contribuição

As contribuições são bem-vindas! Se você quiser contribuir para o Quick Poll, sinta-se à vontade para enviar um pull request com suas melhorias.

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).

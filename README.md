![image](https://user-images.githubusercontent.com/48770103/176053670-cd41d17f-fec5-4a8a-bcc4-c002e5d3aea9.png)

# Stone Challenge

O desafio consiste em criar uma **API REST para realizar transferências** bancárias entre duas contas de um banco digital.
O desafio foi proposto originalmente para ser desenvolvido utilizando a linguagem de programação Go, porém, por afinidade, **irei utilizar Java no backend**.
Embora não seja obrigatório, após a criação da API, **uma interface gráfica simples utilizando React** também será desenvolvida.

## Classes 
- Account
    - id: long
    - first_name: String
    - cpf: String
    - created_at: LocalDate
    - secret: String
    - balance: double
    
- Transfer_Log
    - id: long
    - created_at: LocalDate
    - origin_account_id: long
    - destination_account_id: long
    - value: double

## Endpoints
- Account
    - `GET /accounts` - obtém a lista de contas
    - `GET /accounts/{account_id}/balance` - obtém o saldo da conta
    - `POST /create` - cria uma `Account`
    
- Login
    - `POST /login` - autenticar o usuário
    
- Transfer_Log
    - `GET /{id}/transfers` - obtém a lista de transferencias do usuária autenticada.
    - `POST /{id}/operate` - faz transferencia de uma `Account` para outra.

## Requisitos
- O atributo `balance` pode iniciar com 0 ou algum valor para simplificar.
- O atributo `secret` deve ser armazenado como hash.
- Ao realizar o login, um token de segurança deverá ser criado. Esse token será único para aquela sessão e será utilizado para realizar as operações de consulta e transferência.
- Uma mensagem de erro deve aparecer na tela caso o saldo não seja suficiente para realizar a operação.
- Lembrar de atualizar o saldo de ambas as contas quando a transferência for bem sucedida.

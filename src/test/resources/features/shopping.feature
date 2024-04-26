# language: pt

Funcionalidade: Validar a compra de produtos

  Esquema do Cenario: Validar a compra de produtos
    Dado realizo o login com usuário "standard_user" e "secret_sauce"
    Quando adiciono os produtos ao carrinho
    E finalizo a compra informando meus dados <nome> com <sobrenome> e <cep>
    Então devo ver a mensagem de sucesso <msgSucesso>

    Exemplos:
      |  nome | sobrenome  |    cep   |         msgSucesso        |
      |"Teste"| "Testando" |"04419011"|"Thank you for your order!"|
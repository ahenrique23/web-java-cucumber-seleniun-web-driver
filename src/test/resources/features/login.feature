# language: pt

Funcionalidade: Realizar login

  Esquema do Cenario: Validar login com sucesso
    Dado que estou na página de login
    Quando realizo o login com usuário <usuario> e senha <senha>
    Então devo ser redirecionado para a página de produtos

    Exemplos:
      |   usuario        |       senha     |
      | "standard_user"  |  "secret_sauce" |

  Esquema do Cenario: Validar logins com senha e usuario incorretos
    Dado que estou na página de login
    Quando realizo o login com usuário <usuario> e senha <senha>
    Então devo validar a <msgErro> de erro no login

    Exemplos:
      |   usuario        |        senha        |                          msgErro                                           |
      | "standard_user"  |  "senha incorreta"  |"Epic sadface: Username and password do not match any user in this service" |
      | "usuario_errado" |"senha secret_sauce" |"Epic sadface: Username and password do not match any user in this service" |
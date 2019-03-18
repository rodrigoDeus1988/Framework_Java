#language: pt
Funcionalidade: Fluxo alteração de preços
  Acesso a aplicação do Salesforce,
  faço login como um dos consultores cadastrados
  e faço uma alteraçao no preço domiciliar

@LoginSalesForce
Cenario:
  Dado que eu acesse a página do SalesForce
  Quando efetuar o login com "luiz.pereira@inmetrics.com.br.full" e "19SalesL&Test"
  Então vai para pagina home.

@LoginConsultor
Cenario: Login consultor
  Dado que eu pesquise o 'consultor'
  E acesse o seu perfil
  Quando acesso os detalhes do usuário
  Então farei login como esse 'consultor'

@PesquisarConta
Cenario: Pesquisar Conta 
  Dado que eu esteja logado como 'consultor'
  E e pesquise os dados da conta
  E clique no nome da conta
  Quando clico em solicitação de preços
  Então acesso a alteração

@AlteracaoPreco
Cenario: Alteração de preço
  Dado que eu esteja na página de alterações
  E seleciono produto, filial e modal 
  E continuo para a proxima pagina
  Quando digito o novo valor de preço solicitado
  E clico no botão salvar
  #Então alguma coisa irá acontecer

@logout  
Cenario: Logout
  Dado que eu esteja na pagina de alteração de preços
  E volte para a página de conta
  Então seleciono o consultor e clico em fazer logout
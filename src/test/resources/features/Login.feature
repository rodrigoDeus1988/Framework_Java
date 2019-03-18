#language: en
Feature: Logar na aplicacao 

  Como um usu�rio 
  Gostaria de acessar aplicacao
  Com meu usu�rio e senha

@Login_Sucesso
Scenario: Deve inserir uma conta com sucesso 
	Given  que estou acessando a aplicacao 
	When informo o usuario "rdeus2@hotmail.com" 
	And a senha "2430" 
	And seleciono entrar 
	Then visualizo a pagina inicial
	
@Login_acesso_negado
Scenario: Deve apresentar mensagem de erro de acesso  
	Given  que estou acessando a aplicacao 
	When informo o usuario "rdeus2@hotmail.com" 
	And a senha "24301232" 
	And seleciono entrar 
	Then visualizo a pagina inicial mensagem de erro   
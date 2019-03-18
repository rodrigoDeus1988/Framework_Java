#language: en
Feature: Inserir Contas 

	Como um usu�rio 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Background:
	Given  que estou acessando a aplicacao 
	When informo o usuario "rdeus2@hotmail.com" 
	And a senha "2430" 
	And seleciono entrar 
	Then visualizo a pagina inicial


@Inclusao_de_contas 
Scenario Outline: Deve inserir uma conta com sucesso  

	And seleciono Contas 
	And seleciono Adicionar 
	And informo a conta "<conta>"   
	And seleciono Salvar 
	Then  a conta e inserida com sucesso
	
Examples:

| usuario   		        | senha     | conta            |
| fhf@hotmail.com       | 2430      | ASJL             |
| fss@hotmail.com       | 2430      | ladjsd           |
| dsaad@hotmail.com     | 2430      | a�sdm�kasj       |
| rewrfs@hotmail.com    | 2430      | pqwjew           |
| gdfdgf@hotmail.com    | 2430      | pakjpskkdjk�sa   |
| eowuie@hotmail.com    | 2430      | sakjdkjsakd      | 
| sandlskad@hotmail.com | 2430      | as�kdkas         |
| eiwiuhdn@hotmail.com  | 2430      | dlk�slkasd       |


@Inclusao_de_contas_Cadastradas_Negativo 
Scenario Outline: Deve inserir uma conta com sucesso 
	Given  que estou acessando a aplicacao 
	When informo o usuario "<usuario>" 
	And a senha "<senha>" 
	And seleciono entrar 
	And visualizo a pagina inicial 
	And seleciono Contas 
	And seleciono Adicionar 
	And informo a conta "<conta>"   
	And seleciono Salvar 
	Then  a conta e inserida com sucesso
	
Examples:

| usuario   		     | senha     | conta                 |
| rdeus2@hotmail.com | 2430      | Conta Corrente teste06|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste07|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste08|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste09|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste10|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste11|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste12|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste13|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste14|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste15|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste16|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste17|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste18|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste19|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste20|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste21|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste22|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste23|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste24|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste25|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste26|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste27|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste28|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste29|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste30|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste31|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste32|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste33|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste34|
| rdeus2@hotmail.com | 2430      | Conta Corrente teste35|
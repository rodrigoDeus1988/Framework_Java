package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeralPage {

	private WebDriver navegador;

	public GeralPage(WebDriver navegador) {
		this.navegador = navegador;
	} 
	
	

	// Login loginInmetrics
	public GeralPage loginInmetrics(String login) {

		navegador.findElement(By.id("txtUsuario")).sendKeys(login);

		return this;
	}

	// Senha senhaInmetrics
	public GeralPage senhaInmetrics(String senha) {

		navegador.findElement(By.id("txtSenha")).sendKeys(senha);

		return this;

	}

	// Botão clickBotaoInmetrics
	public GeralPage clickBotaoInmetrics() {
 
		navegador.findElement(By.id("btnLogin")).click();

		return new GeralPage (navegador); 

	}
 
}

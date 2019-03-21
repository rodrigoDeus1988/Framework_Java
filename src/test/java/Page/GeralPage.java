package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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

		return new GeralPage(navegador);

	}

	// Link Painel de Vagas Colaborador
	public GeralPage LinkPanielColaborador() {

		navegador.findElement(By.linkText("Painel de Vagas Colaborador")).click();

		return new GeralPage(navegador);

	}

	// Link Painel de Vagas Colaborador
	public GeralPage ComboPerfil() {

		navegador.findElement(By.id("cphBody_ddlPerfil")).click();
		navegador.findElement(By.xpath("//*[text()=' SOFTWARE DEVELOPMENT ENGINEER IN TEST']")).click();
		
		return new GeralPage(navegador);

	}

}

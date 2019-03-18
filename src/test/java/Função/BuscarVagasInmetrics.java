package Função;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Navegador.Web;
import Page.GeralPage;

public class BuscarVagasInmetrics {

	private WebDriver navegador;

	@Before
	public void setUp() {

		// Navegador
		navegador = Web.createChromeInmetrics();
	}

	@Test
	public void buscaVagas() {

		// Login Portal Inmetrics
		new GeralPage(navegador).loginInmetrics("");

		// Senha Portal Inmetrics
		new GeralPage(navegador).senhaInmetrics("");

	    // Botão Portao Inmetrics
		new GeralPage(navegador).clickBotaoInmetrics();
	}
	
	@After
	public void fecharNavegador() {
		
		navegador.quit();
	}

}

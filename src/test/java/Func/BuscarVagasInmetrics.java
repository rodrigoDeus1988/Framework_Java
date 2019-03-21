package Func;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Navegador.Web;
import Page.GeralPage;

public class BuscarVagasInmetrics {

	private WebDriver navegador; 
	WebDriver driver;
	

	@Before
	public void setUp() {

		// Navegador
		navegador = Web.createChromeInmetrics();
	}

	@Test
	public void buscaVagas() {

		// Login Portal Inmetrics
		new GeralPage(navegador).loginInmetrics("rodrigo.deus");

		// Senha Portal Inmetrics
		new GeralPage(navegador).senhaInmetrics("Ne6@rd2430");

		// Botão Portao Inmetrics
		new GeralPage(navegador).clickBotaoInmetrics();

		// Botão Portao Inmetrics
		new GeralPage(navegador).LinkPanielColaborador();

		// Combo Perfil
		//new GeralPage(navegador).ComboPerfil();

	}

	@After
	public void fecharNavegador() throws IOException {
		// Copiando dados para arquivo TXT
		WebElement copiar = navegador
				.findElement(By.xpath("//*[@id=\"ctl00\"]/div[4]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[2]"));

		String resultado = copiar.getText();

		BufferedWriter xls = new BufferedWriter(
				new FileWriter("C:\\Users\\Inmetrics\\Desktop\\Framework_Java\\data\\Vagas_Inmetrics.txt"));

		xls.write(resultado); 

		xls.close();
		
		navegador.quit();

		
	}

}

package Navegador;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static WebDriver createChromeInmetrics() {

		// Abrindo navegador driver chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		navegador.manage().window().maximize();

		navegador.get("https://aplic.inmetrics.com.br/pcweb/login.aspx");

		return navegador;

	}

	public static WebDriver createChromeJenkins() {

		// Abrindo navegador driver chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		navegador.manage().window().maximize();

		navegador.get("http://localhost:8080/login");

		return navegador;

	}

	public static WebDriver createChromeSrbarriga() {

		// Abrindo navegador driver chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		navegador.manage().window().maximize();

		navegador.get("https://srbarriga.herokuapp.com");

		return navegador;

	}

}

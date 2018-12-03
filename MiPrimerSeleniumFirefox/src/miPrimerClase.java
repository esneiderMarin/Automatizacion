//paso 1: Hacemos los imports necesarios
//importacion del webdriver de selenuim
import org.openqa.selenium.WebDriver;
//libreria para la busqueda
import org.openqa.selenium.By;
//libreria para abrir el navegador
import org.openqa.selenium.firefox.FirefoxDriver;

public class miPrimerClase {

	public static void main(String[] args) {
		//el marionette es es contrlolador de automatizacion de firefox, solo funciona para app que contienen gecko
		
		//Paso 2:Ubicamos en controlador
		// El controlador para chrome se encuentra en la ruta especificada
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		WebDriver skyNet = new FirefoxDriver(); //creacion del navegador 
		
		
		//En este punto ya abrimos el navegador de en firefox
		
		//Paso 3: se hace el get a la url y el navegador nos envia a la url direccionada
		skyNet.get("http://www.google.com");
		
		//Paso 4: voy a pedir que mi pagina busque algo
		skyNet.findElement(By.name("q")).sendKeys("new york");
		
		//PAso 5: hacer la busqueda
		skyNet.findElement(By.name("q")).submit();

	}

}

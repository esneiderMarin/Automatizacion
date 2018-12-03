//paso 1: Hacemos los imports necesarios
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class miPrimerClase {

	public static void main(String[] args) {
		//Paso 2:Ubicamos en controlador
		// El controlador para chrome se encuentra en la ruta especificada
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver skyNet = new ChromeDriver(); //creacion del navegador 
		
		
		
		//En este punto ya abrimos el navegador de en chrome
		
		//Paso 3: se hace el get a la url y el navegador nos envia a la url direccionada
		skyNet.get("http://www.google.com");
		
				
		//Paso 4: voy a pedir que mi pagina busque algo
		skyNet.findElement(By.name("q")).sendKeys("medellin");
		
		//PAso 5: hacer la busqueda
		skyNet.findElement(By.name("q")).submit();
		
	}
	
}

package desafioVeiculo;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class screenshootPage {

	public void screenshotest() throws IOException{
		
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt();
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("evidencia//screenshot" +valor+ ".png"));
	
	}
}

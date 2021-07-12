package desafioVeiculo;

import static org.junit.Assert.assertEquals;
import static desafioVeiculo.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	
	
	public void escrever(String id_campo, String texto) {
		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public void deveVerifcarValoresCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}
	
	public void deveVerifcarValoresComboValor(String id, int valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByIndex(valor);
	}
	
	public void clickbotao(String id_campo) {
		getDriver().findElement(By.id(id_campo)).click();
	}
	
	public void verificarMensagem(String mensag, String valor) {
		assertEquals(mensag, getDriver().findElement(By.tagName(valor)).getText());
	}
	
	public void radiobuttom(String valor) {
		WebElement radio = getDriver().findElement(By.xpath(valor));
		radio.click();	
	}
	
	public void tirarscreenshot() {
		
	}
}

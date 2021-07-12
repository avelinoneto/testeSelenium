package desafioVeiculo;

import static desafioVeiculo.DriverFactory.getDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class desafioveiculo {

		
	private desafioveiculoPage page;
	private screenshootPage pagescreenshot;
	
	@Given("Que estou acessando a aplicacao")
	public void que_estou_acessando_a_aplicacao() throws Throwable {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
		
		page = new desafioveiculoPage();
		pagescreenshot = new screenshootPage();
	}

	@When("Preencher formulario EnterVehicleData")
	public void preencher_formulario_enter_vehicle_data() throws Throwable {
		
		page.setmake("BMW");
		page.setmodel("Scooter");
		page.setcylindercapacity("434");
		page.setengineperformance("661");
		page.setdateofmanufacture("01/07/2021");
		page.setnumberofseats("4");
		page.setrighthanddrive("//section[1]/div[7]/p/label[1]/span");
		page.setnumberofseatsmotorcycle("2");
		page.setfuel("Diesel");
		page.setpayload("500");
		page.settotalweight("434");
		page.setlistprice("544");
		page.setlicenseplatenumber("5554");
		page.setannualmileage("332");
			
	}

	@When("Pressionar botao next do EnterVehicleData")
	public void pressionar_botao_next_do_enter_vehicle_data() throws Throwable{
		
		page.setbotaonextenterinsurantdata();
		Thread.sleep(200);
	}

	@When("Preencher formulario EnterInsurantData")
	public void preencher_formulario_enter_insurant_data() throws Throwable{
		
		page.setfirstname("Avelino");
		page.setlastname("Ramos");
		page.setbirthdate("06/21/1987");
		page.setgender("//section[2]/div[4]/p/label[1]/span");
		page.setstreetaddress("Rua Ipe Roxo, 520");
		page.setzipcode("13175658");
		page.setcountry("Brazil");
		page.setcity("Campinas");
		page.setoccupation("Employee");
		page.sethobbiesspeeding("//section[2]/div[10]/p/label[1]/span");
		page.sethobbiesbungeejumping("//section[2]/div[10]/p/label[2]/span");
		page.setwebsite("www.teste.com.br");
		
	}

	@When("Pressionar botao next do EnterInsurantData")
	public void pressionar_botao_next_do_enter_insurant_data() throws Throwable{
		
		page.setbotaonextenterproductdata();
		Thread.sleep(2000);
		
	}

	@When("Preencher formulario EnterProductData")
	public void preencher_formulario_enter_product_data() throws Throwable {
		
		page.setstartdate("08/27/2021");
		page.setinsurancesum(2);
		page.setmeritrating("Bonus 1");
		page.setdamageinsurance("Full Coverage");
		page.setproductseuroprotection("//section[3]/div[5]/p/label[1]/span");
		page.setcortesycar("Yes");
			
	
	}

	@When("Pressionar botao next do EnterProductData")
	public void pressionar_botao_next_do_enter_product_data() throws Throwable {
		
		page.setbotaonextselectpriceoption();
		Thread.sleep(1000);
		
	}

	@When("Preencher formulario SelectPriceOption")
	public void preencher_formulario_select_price_option() throws Throwable{
		
		page.setopcaogold("//table/tfoot/tr/th[2]/label[2]/span");
		Thread.sleep(1000);
		
	}

	@When("Pressionar botao next do SelectPriceOption")
	public void pressionar_botao_next_do_select_price_option() throws Throwable{
		
		page.setbotaonextsendquote();
		Thread.sleep(1000);
	}

	@When("Preencher formulario SendQuote")
	public void preencher_formulario_send_quote() {
		
		page.setemail("avelinorsilvaneto@gmail.com");
		page.setphone("19982113302");
		page.setusername("avelinor");
		page.setpassword("12avElino#1");
		page.setconfirmpassword("12avElino#1");
		page.setcomments("teste....teste.....");
   
	}

	@When("Pressionar botao next do SendQuote")
	public void pressionar_botao_next_do_send_quote() throws Throwable{
		
		page.setbotaosendemail();
		Thread.sleep(10000);
		
	}

	@Then("Verificar a mensagem Sending e-mail success! na tela")
	public void verificar_a_mensagem_sending_e_mail_success_na_tela() throws Throwable{
		
		page.setverificarmensagem("h2");
		
		pagescreenshot.screenshotest();
	
	}
}

package desafioVeiculo;


public class desafioveiculoPage {
	
	private DSL dsl;
	
	public desafioveiculoPage() {
		dsl = new DSL();
	}
	
	public void setmake(String valor) {
		dsl.deveVerifcarValoresCombo("make", valor);
	}
	
	public void setmodel(String valor) {
		dsl.deveVerifcarValoresCombo("model", valor);
	}
	
	public void setcylindercapacity(String valor) {
		dsl.escrever("cylindercapacity", valor);
	}
	
	public void setengineperformance(String valor) {
		dsl.escrever("engineperformance", valor);
	}
	
	public void setrighthanddrive(String valor) {
		dsl.radiobuttom("//section[1]/div[7]/p/label[1]/span");
	}
	
	public void setdateofmanufacture(String valor) {
		dsl.escrever("dateofmanufacture", valor);
	}
	
	public void setnumberofseats(String valor) {
		dsl.deveVerifcarValoresCombo("numberofseats", valor);	
	}
	
	public void setnumberofseatsmotorcycle(String valor) {
		dsl.deveVerifcarValoresCombo("numberofseatsmotorcycle", valor);	
	}
	
	public void setfuel(String valor) {
		dsl.deveVerifcarValoresCombo("fuel", valor);	
	}
	
	public void setpayload(String valor) {
		dsl.escrever("payload", valor);
	}
	
	public void settotalweight(String valor) {
		dsl.escrever("totalweight", valor);
	}
	
	public void setlistprice(String valor) {
		dsl.escrever("listprice", valor);		
	}
	
	public void setlicenseplatenumber(String valor) {
		dsl.escrever("licenseplatenumber", valor);		
	}
	
	public void setannualmileage(String valor) {
		dsl.escrever("annualmileage", valor);		
	}
	
	public void setbotaonextenterinsurantdata() {
		dsl.clickbotao("nextenterinsurantdata");
	}
	
	public void setstartdate(String valor) {
		dsl.escrever("startdate", valor);
	}
	
	public void setinsurancesum(int valor) {
		dsl.deveVerifcarValoresComboValor("insurancesum", valor);		
	}
	
	public void setmeritrating(String valor) {
		dsl.deveVerifcarValoresCombo("meritrating", "Bonus 1");		
	}
	
	public void setdamageinsurance(String valor) {
		dsl.deveVerifcarValoresCombo("damageinsurance", valor);	
	}
	
	public void setcortesycar(String valor) {
		dsl.deveVerifcarValoresCombo("courtesycar", valor);		
	}
	
	public void setfirstname(String valor) {
		dsl.escrever("firstname", valor);
	}
	
	public void setlastname(String valor) {
		dsl.escrever("lastname", valor);
	}
	
	public void setbirthdate(String valor) {
		dsl.escrever("birthdate", valor);
	}
	
	public void setgender(String valor) {
		dsl.radiobuttom("//section[2]/div[4]/p/label[1]/span");
	}
	
	public void setstreetaddress(String valor) {
		dsl.escrever("streetaddress", valor);
	}
	
	public void setcountry(String valor) {
		dsl.deveVerifcarValoresCombo("country", valor);		
	}
	
	public void setzipcode(String valor) {
		dsl.escrever("zipcode", valor);	
	}
	
	public void setcity(String valor) {
		dsl.escrever("city", valor);
	}
	
	public void setoccupation(String valor) {
		dsl.deveVerifcarValoresCombo("occupation", valor);	
	}
	
	public void sethobbiesspeeding(String valor) {
		dsl.radiobuttom("//section[2]/div[10]/p/label[1]/span");	
	}
	
	public void sethobbiesbungeejumping(String valor) {
		dsl.radiobuttom("//section[2]/div[10]/p/label[2]/span");
	}
	
	public void setwebsite(String valor) {
		dsl.escrever("website", valor);
	}
	
	public void setbotaonextenterproductdata() {
		dsl.clickbotao("nextenterproductdata");
	}
	
	public void setproductseuroprotection(String valor) {
		dsl.radiobuttom("//section[3]/div[5]/p/label[1]/span");
	}
	
	public void setbotaonextselectpriceoption() {
		dsl.clickbotao("nextselectpriceoption");
	}
	
	public void setopcaogold(String valor){
		dsl.radiobuttom("//table/tfoot/tr/th[2]/label[2]/span");
	}
	
	public void setbotaonextsendquote() {
		dsl.clickbotao("nextsendquote");
	}
	
	public void setemail(String valor) {
		dsl.escrever("email", valor);	
	}
	
	public void setphone(String valor) {
		dsl.escrever("phone", "19982113302");		
	}
	
	public void setusername(String valor) {
		dsl.escrever("username", "avelinor");	
	}
	
	public void setpassword(String valor) {
		dsl.escrever("password", "12avElino#1");	
	}
	
	public void setconfirmpassword(String valor) {
		dsl.escrever("confirmpassword", "12avElino#1");	
	}
	
	public void setcomments(String valor) {
		dsl.escrever("Comments", "teste....teste.....");	
	}
	
	public void setbotaosendemail() {
		dsl.clickbotao("sendemail");
	}
	
	public void setverificarmensagem(String valor) {
		dsl.verificarMensagem("Sending e-mail success!",valor);
	}
}

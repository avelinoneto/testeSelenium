Feature: Como um usuario
  Eu quero preencher os formularios
  Para que eu possa acessar todos as abas dos formularios
  
Scenario: Deve preencher o formulario com sucesso
   Given  Que estou acessando a aplicacao
   When   Preencher formulario EnterVehicleData
   And    Pressionar botao next do EnterVehicleData 
   When   Preencher formulario EnterInsurantData
   And 	  Pressionar botao next do EnterInsurantData
   When   Preencher formulario EnterProductData
   And    Pressionar botao next do EnterProductData
   When   Preencher formulario SelectPriceOption
   And    Pressionar botao next do SelectPriceOption
   When   Preencher formulario SendQuote
   And    Pressionar botao next do SendQuote
   Then   Verificar a mensagem Sending e-mail success! na tela
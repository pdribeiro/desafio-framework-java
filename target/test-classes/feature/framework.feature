#Author: pedro.r.franco90@gmail.com

Feature: Framework
 Usuario deseja realizar cadastro no portal para utilizar as funcoes
  
  Background: Acessar o serverest
  Given que eu esteja no "https://front.serverest.dev/login"


  
  Scenario: CN01 Realizar cadastro
 	  When Clicar em cadastre-se
    When Preencher o campo nome "Pedro2"
    When Preencher o campo email "Pedro2@teste.com.br"
    When Preencher o campo senha "1234" 
    And Clicar no botao cadastrar
    Then Cadastro realizado com sucesso
    

  Scenario: CN02 Logar no portal
    When Preencher o campo email "Pedro2@teste.com.br"  
    When Preencher o campo senha "1234" 
    And Clicar no botao entrar
    Then logar no portal
    Then Validar login "Logout"
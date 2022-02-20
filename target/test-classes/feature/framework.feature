#Author: pedro.r.franco90@gmail.com

Feature: Framework
 Usuario deseja realizar cadastro no portal para utilizar as funcoes
  
  Background: Acessar o serverest
  Given que eu esteja no "https://front.serverest.dev/login"


  
  Scenario: CN01 Realizar cadastro
 	  When Clicar em cadastre-se
    When Preencher o campo nome "Framework"
    When Preencher o campo email "framework1@teste.com.br"
    When Preencher o campo senha "1234" 
    And Clicar no botao cadastrar
    Then Cadastro realizado com sucesso "Login"
    

  Scenario: CN02 Logar no portal
    When Preencher o campo email "framework1@teste.com.br"  
    When Preencher o campo senha "1234" 
    And Clicar no botao entrar
    Then logar no portal
    Then Validar login "Logout"
    
  Scenario: CN03 Logar no portal e listar produtos
    When Preencher o campo email "framework1@teste.com.br"  
    When Preencher o campo senha "1234" 
    And Clicar no botao entrar
    Then logar no portal
    Then listar produtos "Produtos"
    
    
    
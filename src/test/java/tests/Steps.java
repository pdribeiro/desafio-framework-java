package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		
		metodos.abrirNavegador(site, site);


	}
	
	@When("Clicar em cadastre-se")
	public void clicar_em_cadastre_se() {
		metodos.clicar(el.getCadastrar());


	}

	@When("Preencher o campo nome {string}")
	public void preencher_o_campo_nome(String string) {
		metodos.escrever(string, el.getNome());

	}
	
	@When("Preencher o campo email {string}")
	public void preencher_o_campo_email(String string) {
		metodos.escrever(string, el.getEmail());


	}

	@When("Preencher o campo senha {string}")
	public void preencher_o_campo_senha(String string) {
		metodos.escrever(string, el.getSenha());


	}

	@When("Clicar no botao cadastrar")
	public void clicar_no_botao_cadastrar() {
		metodos.clicar(el.getAdm());
		metodos.clicar(el.getCadastrar2());

	}

	@Then("Cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {
		metodos.fecharNavegador();

	}
	
	@When("Clicar no botao entrar")
	public void clicar_no_botao_entrar() {
		metodos.submit(el.getEntrar());

	}

	@Then("logar no portal")
	public void logar_no_portal() {

	}
	
	@Then("Validar login {string}")
	public void validar_login(String textoEsperado) {
	metodos.validadeTexto(textoEsperado, el.getLogout());
	metodos.fecharNavegador();

	}


}

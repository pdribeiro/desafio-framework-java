package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By cadastrar = By.xpath("//*[@id=\"root\"]/div/div/form/small/a");
	private By nome = By.xpath("//*[@id=\"nome\"]");
	private By email = By.xpath("//*[@id=\"email\"]");
	private By senha = By.xpath("//*[@id=\"password\"]");
	private By adm = By.xpath("//*[@id=\"administrador\"]");
	private By cadastrar2 = By.xpath("//button[contains(text(),\"Cadastrar\")]");
	private By emailcadastrado = By.xpath("//span[contains(text(),'Cadastro realizado com sucesso')]");
	private By entrar = By.xpath("//button");
	private By logout = By.xpath("//*[text()=\"Logout\"]");





	public By getLogout() {
		return logout;
	}

	public By getEntrar() {
		return entrar;
	}

	public By getEmailcadastrado() {
		return emailcadastrado;
	}

	public By getCadastrar2() {
		return cadastrar2;
	}

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}


	public By getSenha() {
		return senha;
	}


	public By getAdm() {
		return adm;
	}

	public By getCadastrar() {
		return cadastrar;
	}

}

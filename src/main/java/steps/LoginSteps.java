package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.WebDriverUtils;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Dado("que estou na página de login")
    public void abrirPaginaLogin() {
        driver = WebDriverUtils.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.abrirPaginaLogin();
    }
    @Quando("realizo o login com usuário {string} e senha {string}")
    public void realizo_o_login_com_usuário_e_senha(String usuario, String senha) {
        loginPage.realizarLogin(usuario, senha);
    }
    @Entao("devo ser redirecionado para a página de produtos")
    public void validarHome() {
        loginPage.validarPageProdutos();
    }
    @Então("devo validar a {string} de erro no login")
    public void devo_validar_a_de_erro_no_login(String msgErro) {
        loginPage.validarErroLogin(msgErro);
    }
}

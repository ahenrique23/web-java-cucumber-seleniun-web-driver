package steps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ShoppinPage;
import utils.WebDriverUtils;

public class ShoppingSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private ShoppinPage shoppinPage;

    @Dado("realizo o login com usuário {string} e {string}")
    public void realizo_o_login_com_usuário_e(String usuario, String senha) {
        driver = WebDriverUtils.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.abrirPaginaLogin();
        loginPage.realizarLogin(usuario, senha);
    }
    @Quando("adiciono os produtos ao carrinho")
    public void adiciono_os_produtos_ao_carrinho() {
        driver = WebDriverUtils.getDriver();
        shoppinPage = new ShoppinPage(driver);
        shoppinPage.addProdutosCarrinho();
    }

    @Quando("finalizo a compra informando meus dados {string} com {string} e {string}")
    public void finalizo_a_compra_informando_meus_dados_com_e(String nome, String sobrenome, String cep) {
        shoppinPage.confirmarCompra();
        shoppinPage.minhasInformacoes(nome, sobrenome, cep);
    }

    @Então("devo ver a mensagem de sucesso {string}")
    public void devo_ver_a_mensagem_de_sucesso(String msgSucesso) {
        shoppinPage.validarCompra(msgSucesso);
    }
}

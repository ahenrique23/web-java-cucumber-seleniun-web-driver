package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void abrirPaginaLogin() {
        driver.get("https://www.saucedemo.com/");
    }
    @FindBy(id = "user-name")
    private WebElement user;
    @FindBy(id = "password")
    private WebElement pass;
    @FindBy(id = "login-button")
    private WebElement btn_login;
    @FindBy(className = "title")
    private WebElement textHome;
    @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement error;

    public void realizarLogin(String usuario, String senha) {
        user.sendKeys(usuario);
        pass.sendKeys(senha);
        btn_login.click();
    }
    public void validarPageProdutos() {
        assertTrue(textHome.getText().equals("Products"));
    }
    public void validarErroLogin(String msgErro) {
        //assertTrue(error.getText().equals("msgErro"));
        WebElement produtos = driver.findElement(By.cssSelector("div.error-message-container"));
        String txtErro = produtos.getText();
        assertTrue(txtErro.equals(msgErro));
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class ShoppinPage {
    private WebDriver driver;
    public ShoppinPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btn_add_cart_backpack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement btn_add_cart_bike_light;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement btn_add_cart_bolt_t_shirt;
    @FindBy(className = "shopping_cart_link")
    private WebElement btnCart;
    @FindBy(id = "checkout")
    private WebElement btnCheckout;
    @FindBy(className = "title")
    private WebElement txtCart;
    @FindBy(id = "first-name")
    private WebElement inpNome;
    @FindBy(id = "last-name")
    private WebElement inpSobrenome;
    @FindBy(id = "postal-code")
    private WebElement inpCep;
    @FindBy(id = "continue")
    private WebElement btnContinue;
    @FindBy(id = "finish")
    private WebElement btnFinish;
    @FindBy(className = "complete-header")
    private WebElement txtSucess;

    public void addProdutosCarrinho(){
        btn_add_cart_backpack.click();
        btn_add_cart_bike_light.click();
    }
    public void confirmarCompra(){
        btnCart.click();
        assertTrue(txtCart.getText().equals("Your Cart"));
        btnCheckout.click();
    }
    public void minhasInformacoes(String nome, String sobrenome, String cep){
        inpNome.click();
        inpNome.sendKeys(nome);
        inpSobrenome.sendKeys(sobrenome);
        inpCep.sendKeys(cep);
        btnContinue.click();
        btnFinish.click();
    }
    public void validarCompra(String msgSucesso){
        assertTrue(txtSucess.getText().equals(msgSucesso));
    }
}

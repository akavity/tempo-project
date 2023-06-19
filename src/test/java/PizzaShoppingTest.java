import io.qameta.allure.Issue;
import org.example.driver.DriverManager;
import org.example.steps.PizzaShoppingSteps;
import org.example.utils.AllureListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class PizzaShoppingTest extends BaseSoppingTest {
    protected WebDriver driver;
    private PizzaShoppingSteps pizzaShoppingSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        pizzaShoppingSteps = new PizzaShoppingSteps(driver);
    }

    @Test(description = "Check pizza price in cart: Bavaria")
    public void checkPizzaShoppingTest1() {
        pizzaShoppingSteps.enterBavariaPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();

        Assert.assertTrue(pizzaShoppingSteps.getPrice().contains("12.7"));
    }

    @Test(description = "Check pizza price in cart: Tempting")
    public void checkPizzaShoppingTest3() {
        pizzaShoppingSteps.isEmptyBasket();
        pizzaShoppingSteps.enterTemptingPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();

        Assert.assertTrue(pizzaShoppingSteps.getPrice().contains("12.5"));

    }

    @Test(description = "Check pizza price in cart: Sicily")
    public void checkPizzaShoppingTest2() {
        pizzaShoppingSteps.isEmptyBasket();
        pizzaShoppingSteps.enterSicilyPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();

        Assert.assertTrue(pizzaShoppingSteps.getPrice().contains("10.7"));
    }

    @Issue("Permanent error")
    @Test(description = "Check pizza price in cart: Sicily + Tempting")
    public void checkPizzaShoppingTest4() {
        pizzaShoppingSteps.isEmptyBasket();
        pizzaShoppingSteps.enterTemptingPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();
        pizzaShoppingSteps.enterSicilyPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();

        Assert.assertTrue(pizzaShoppingSteps.getPrice().contains("23.2"));
    }

    @Issue("Permanent error")
    @Test(description = "Check pizza price in cart: Sicily + Tempting + Bavaria")
    public void checkPizzaShoppingTest5() {
        pizzaShoppingSteps.isEmptyBasket();
        pizzaShoppingSteps.enterSicilyPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();
        pizzaShoppingSteps.enterTemptingPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();
        pizzaShoppingSteps.enterBavariaPizzaButton();
        pizzaShoppingSteps.enterSubmitButton();

        Assert.assertTrue(pizzaShoppingSteps.getPrice().contains("35.9"));
    }
}
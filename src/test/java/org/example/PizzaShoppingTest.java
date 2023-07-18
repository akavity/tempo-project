package org.example;

import org.example.driver.DriverManager;
import org.example.models.PizzaTestData;
import org.example.models.PizzaTypeData;
import org.example.steps.MoveToSteps;
import org.example.steps.ShoppingSteps;
import org.example.utils.AllureListener;
import org.example.utils.JsonReader;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners({AllureListener.class})
public class PizzaShoppingTest extends BaseTest {
    protected WebDriver driver;
    private ShoppingSteps shoppingSteps;
    private MoveToSteps moveToSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        shoppingSteps = new ShoppingSteps(driver);
        moveToSteps = new MoveToSteps(driver);
    }

    @Test(description = "Check the price of 'Bavaria' pizza in the cart",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfGoodInBasketTopTest1(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterBavariaPizzaButton();
        shoppingSteps.enterSubmitButton();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromBasketTop());
        double expected = pizzaData.getBavariaPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of 'Tempting' pizza in the basket top",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfGoodInBasketTopTest2(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterTemptingPizzaButton();
        shoppingSteps.enterSubmitButton();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromBasketTop());
        double expected = pizzaData.getTemptingPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of 'Sicily' pizza in the basket top",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfGoodInBasketTopTest3(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromBasketTop());
        double expected = pizzaData.getSicilyPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of two pizzas in the basket top",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfTwoGoodsInBasketTop(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterTemptingPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();
        Waiters.sleep();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromBasketTop());
        double expected = pizzaData.getTemptingPizzaPrice() + pizzaData.getSicilyPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of three pizzas in the basket top",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfTreeGoodsInBasketTop(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterTemptingPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterBavariaPizzaButton();
        shoppingSteps.enterSubmitButton();
        Waiters.sleep();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromBasketTop());
        double expected = pizzaData.getTemptingPizzaPrice() + pizzaData.getSicilyPizzaPrice()
                + pizzaData.getBavariaPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of 'Sicily' pizza in the cart",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfGoodInCart(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();
        moveToSteps.moveToBasket();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromCart());
        double expected = pizzaData.getSicilyPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of two pizzas in the cart",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfTwoGoodsInCart(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterTemptingPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();
        Waiters.sleep();
        moveToSteps.moveToBasket();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromCart());
        double expected = pizzaData.getTemptingPizzaPrice() + pizzaData.getSicilyPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check the price of three pizzas in the cart",
            dataProvider = "pizzaTestData", dataProviderClass = JsonReader.class)
    public void checkPriceOfTreeGoodsInCart(PizzaTestData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterSicilyPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterTemptingPizzaButton();
        shoppingSteps.enterSubmitButton();
        shoppingSteps.enterBavariaPizzaButton();
        shoppingSteps.enterSubmitButton();
        moveToSteps.moveToBasket();

        double actual = Double.parseDouble(shoppingSteps.getPriceFromCart());
        double expected = pizzaData.getTemptingPizzaPrice() + pizzaData.getSicilyPizzaPrice()
                + pizzaData.getBavariaPizzaPrice();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check pizza sorting by vegan type",
            dataProvider = "pizzaTypeData", dataProviderClass = JsonReader.class)
    public void checkSortingByVeganType(PizzaTypeData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterVeganButton();
        shoppingSteps.enterResultButton();

        List<String> actual = shoppingSteps.getArrayPizzaNames();
        List<String> expected = pizzaData.getVeganPizzaNames();

        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Check pizza sorting by chili type",
            dataProvider = "pizzaTypeData", dataProviderClass = JsonReader.class)
    public void checkSortingByChiliType(PizzaTypeData pizzaData) {
        moveToSteps.moveToPizzaShopping();
        shoppingSteps.isBasketEmpty();
        shoppingSteps.enterChiliButton();
        shoppingSteps.enterResultButton();

        List<String> actual = shoppingSteps.getArrayPizzaNames();
        List<String> expected = pizzaData.getChiliPizzaNames();

        Assert.assertEquals(actual, expected);
    }
}

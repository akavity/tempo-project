package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(), 'Баварская')]/../following-sibling::div//button")
    private WebElement bavariaPizzaButton;
    @FindBy(xpath = "//span[contains(text(), 'Аппетитная')]/../following-sibling::div//button")
    private WebElement temptingPizzaButton;
    @FindBy(xpath = "//span[contains(text(), 'Сицилийская')]/../following-sibling::div//button")
    private WebElement sicilyPizzaButton;
    @FindBy(xpath = "//*[@id='order_pizza_popup']//button[contains(text(), 'Заказ')]")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class='basketOuter']//span[@class='bs-price']//span[@class='price_byn']")
    private WebElement priceField;
    @FindBy(xpath = "//div[@class='bs-empty-col']")
    private WebElement emptyBasketField;
    @FindBy(xpath = "//a[@title='Удалить из заказа']")
    private WebElement removeOrderButton;
    @FindBy(xpath = "//div[@class='basket_placeholder']//div[@class='bs-toggler openClose']")
    private WebElement openCloseButton;
    @FindBy(xpath = "//div[@id='basket_sum_all']//span[@class='price_byn']")
    private WebElement priceCartField;
    @FindBy(xpath = "//h3//span")
    private List<WebElement> goodsNamesFields;
    @FindBy(xpath = "//div[@class='pizzaType']//label[@class='vegan']")
    private WebElement veganTypeButton;
    @FindBy(xpath = "//div[@class='pizzaType']//label[@class='chili']")
    private WebElement chiliTypeButton;
    @FindBy(id = "getResultPickup")
    private WebElement resultButton;

    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBavarianPizzaButton() {
        return bavariaPizzaButton;
    }

    public WebElement getTemptingPizzaButton() {
        return temptingPizzaButton;
    }

    public WebElement getSicilyPizzaButton() {
        return sicilyPizzaButton;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getPriceField() {
        return priceField;
    }

    public WebElement getEmptyBasketField() {
        return emptyBasketField;
    }

    public WebElement getRemoveOrderButton() {
        return removeOrderButton;
    }

    public WebElement getOpenCloseButton() {
        return openCloseButton;
    }

    public WebElement getPriceCartField() {
        return priceCartField;
    }

    public List<WebElement> getGoodsNames() {
        return goodsNamesFields;
    }

    public WebElement getVeganTypeButton() {
        return veganTypeButton;
    }

    public WebElement getChiliTypeButton() {
        return chiliTypeButton;
    }

    public WebElement getResultButton() {
        return resultButton;
    }
}

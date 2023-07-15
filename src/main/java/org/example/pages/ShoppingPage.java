package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}

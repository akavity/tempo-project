package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoveToPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(), 'Регистрация')]")
    private WebElement registrationButton;
    @FindBy(xpath = "//li[@class=\"other\"]//a[ contains(@href, 'menu/pizza')]")
    private WebElement pizzaButton;
    @FindBy(xpath = "//div[@class=\"basket\"]//div[@class=\"bs-price-col\"]")
    private WebElement basketButton;

    public MoveToPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRegistrationButton() {
        return registrationButton;
    }

    public WebElement getPizzaButton() {
        return pizzaButton;
    }

    public WebElement getBasketButton() {
        return basketButton;
    }
}

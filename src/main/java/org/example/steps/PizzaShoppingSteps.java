package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.PizzaShoppingPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;

@Log4j2
public class PizzaShoppingSteps {

    private final PizzaShoppingPage pizzaShoppingPage;

    public PizzaShoppingSteps(WebDriver driver) {
        pizzaShoppingPage = new PizzaShoppingPage(driver);
    }

    @Step("Enter Bavaria pizza")
    public void enterBavariaPizzaButton() {
        pizzaShoppingPage.getBavarianPizzaButton().click();
    }

    @Step("Enter Tempting pizza")
    public void enterTemptingPizzaButton() {
        pizzaShoppingPage.getTemptingPizzaButton().click();
    }

    @Step("Enter Sicily pizza")
    public void enterSicilyPizzaButton() {
        pizzaShoppingPage.getSicilyPizzaButton().click();
    }

    @Step
    public void isEmptyBasket() {
        int flag = 0;
        while (!pizzaShoppingPage.getEmptyBasketField().isDisplayed()) {
            if (flag == 0) {
                pizzaShoppingPage.getOpenCloseButton().click();
            }
            pizzaShoppingPage.getRemoveOrderButton().click();
            flag++;
        }
        flag = 0;
    }

    @Step("Enter submit pizza")
    public void enterSubmitButton() {
        Waiters.waitForVisibility(pizzaShoppingPage.getSubmitButton(), 20);
        pizzaShoppingPage.getSubmitButton().click();
    }

    @Step("Get pizza")
    public String getPrice() {
        Waiters.waitForVisibility(pizzaShoppingPage.getPriceField(), 30);
        return pizzaShoppingPage.getPriceField().getAttribute("data-price");
    }
}

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
        log.info("Enter Bavaria pizza");
        pizzaShoppingPage.getBavarianPizzaButton().click();
    }

    @Step("Enter Tempting pizza")
    public void enterTemptingPizzaButton() {
        log.info("Enter Tempting pizza");
        pizzaShoppingPage.getTemptingPizzaButton().click();
    }

    @Step("Enter Sicily pizza")
    public void enterSicilyPizzaButton() {
        log.info("Enter Sicily pizza");
        pizzaShoppingPage.getSicilyPizzaButton().click();
    }

    @Step("Remove pizza from cart")
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
        log.info("Enter submit pizza");
        Waiters.waitForVisibility(pizzaShoppingPage.getSubmitButton(), 20);
        pizzaShoppingPage.getSubmitButton().click();
    }

    @Step("Get pizza")
    public String getPrice() {
        log.info("Get pizza");
        Waiters.waitForVisibility(pizzaShoppingPage.getPriceField(), 30);
        return pizzaShoppingPage.getPriceField().getAttribute("data-price");
    }
}

package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.ShoppingPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ShoppingSteps {

    private final ShoppingPage shoppingPage;

    public ShoppingSteps(WebDriver driver) {
        shoppingPage = new ShoppingPage(driver);
    }

    @Step("Enter Bavaria pizza")
    public void enterBavariaPizzaButton() {
        log.info("Enter Bavaria pizza");
        shoppingPage.getBavarianPizzaButton().click();
    }

    @Step("Enter Tempting pizza")
    public void enterTemptingPizzaButton() {
        log.info("Enter Tempting pizza");
        shoppingPage.getTemptingPizzaButton().click();
    }

    @Step("Enter Sicily pizza")
    public void enterSicilyPizzaButton() {
        log.info("Enter Sicily pizza");
        Waiters.waitForVisibility(shoppingPage.getSicilyPizzaButton(), 20);
        shoppingPage.getSicilyPizzaButton().click();
    }

    @Step("Remove good from cart")
    public void isBasketEmpty() {
        int flag = 0;
        while (!shoppingPage.getEmptyBasketField().isDisplayed()) {
            if (flag == 0) {
                shoppingPage.getOpenCloseButton().click();
            }
            Waiters.waitForVisibility(shoppingPage.getRemoveOrderButton(), 20);
            shoppingPage.getRemoveOrderButton().click();
            flag++;
        }
        flag = 0;
    }

    @Step("Enter submit pizza")
    public void enterSubmitButton() {
        log.info("Enter submit pizza");
        Waiters.waitForVisibility(shoppingPage.getSubmitButton(), 20);
        shoppingPage.getSubmitButton().click();
    }

    @Step("Get price from basket top")
    public String getPriceFromBasketTop() {
        log.info("Get price basket top");
        Waiters.waitForVisibility(shoppingPage.getPriceField(), 20);
        return shoppingPage.getPriceField().getAttribute("data-price");
    }
}

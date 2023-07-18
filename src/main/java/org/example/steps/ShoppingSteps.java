package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.ShoppingPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @Step("Get price from cart")
    public String getPriceFromCart() {
        log.info("Get price from cart");
        return shoppingPage.getPriceCartField().getText()
                .replace("р", "").replace("к.", "");
    }

    @Step("Enter vegan button")
    public void enterVeganButton() {
        shoppingPage.getVeganTypeButton().click();
    }

    @Step("Enter chili button")
    public void enterChiliButton() {
        shoppingPage.getChiliTypeButton().click();
    }

    @Step("Enter result button")
    public void enterResultButton() {
        log.info("Enter result button");
        shoppingPage.getResultButton().click();
    }

    @Step("Get array pizza names by type")
    public List<String> getArrayPizzaNames() {
        log.info("Create array pizza names");
        List<String> arrayPizzaNames = new ArrayList<>();

        for (WebElement pizzaText : shoppingPage.getGoodsNames()) {
            log.info("fine pizza: " + pizzaText.getText());
            Pattern pattern = Pattern.compile("\"(.*)\"");
            Matcher matcher = pattern.matcher(pizzaText.getText());

            while (matcher.find()) {
                log.info("add pizza: " + matcher.group());
                arrayPizzaNames.add(matcher.group().replace("\"", ""));
            }
        }

        return arrayPizzaNames;
    }
}

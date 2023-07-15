package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.MoveToPage;
import org.openqa.selenium.WebDriver;

@Log4j2
public class MoveToSteps {
    private final MoveToPage moveToPage;

    public MoveToSteps(WebDriver driver) {
        moveToPage = new MoveToPage(driver);
    }

    @Step("Move to registration form")
    public void moveToRegistrationForm() {
        log.info("Move to registration form");
        moveToPage.getRegistrationButton().click();
    }

    @Step("Move to pizza shopping")
    public void moveToPizzaShopping() {
        log.info("Move to  pizza shopping");
        moveToPage.getPizzaButton().click();
    }
}

package org.example.steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.RegistrationPage;
import org.example.utils.Waiters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@Log4j2
public class RegistrationSteps {
    private final RegistrationPage registrationPage;

    public RegistrationSteps(WebDriver driver) {
        registrationPage = new RegistrationPage(driver);
    }

    @Step("Enter email")
    public void enterEmail(String email) {
        log.info("Enter email");
        Waiters.waitForVisibility(registrationPage.getEmailField(), 20);
        registrationPage.getEmailField().sendKeys(email);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        log.info("Enter password");
        registrationPage.getPasswordField().sendKeys(password);
    }

    @Step("Repeat password")
    public void repeatPassword(String password) {
        log.info("Repeat password");
        registrationPage.getPasswordRepeatField().sendKeys(password);
    }

    @Step("Get User Account Error")
    public boolean isThereAccountError() {
        log.info("Get User Account Error");
        return registrationPage.getUserAccountError().isDisplayed();
    }

    @Step("Enter first name, last name")
    public void enterUser(String userData) {
        log.info("Enter first name, last name");
        registrationPage.getUserField().sendKeys(userData);
    }

    @Step("Enter mobile phone")
    public void enterPhone(String phone) {
        log.info("Enter mobile phone");
        Waiters.waitForVisibility(registrationPage.getPhoneField(), 30);
        registrationPage.getPhoneField().sendKeys(phone);
    }

    @Step("Click gender button")
    public void clickGenderButton() {
        log.info("Click gender button");
        registrationPage.getGenderMaleButton().click();
    }

    @Step("Choose age")
    public void chooseAge(String age) {
        log.info("Choose age");
        registrationPage.getAgeDropDown().sendKeys(age);
        registrationPage.getAgeDropDown().sendKeys(Keys.RETURN);
    }

    @Step("Choose occupation")
    public void chooseOccupation(String occupation) {
        log.info("Choose occupation");
        registrationPage.getOccupationDropDown().sendKeys(occupation);
        registrationPage.getOccupationDropDown().sendKeys(Keys.RETURN);
    }

    @Step("Enter street")
    public void enterStreet(String street) {
        log.info("Enter street");
        registrationPage.getStreetField().sendKeys(street);
    }

    @Step("Enter hose")
    public void enterHouse(String house) {
        log.info("Enter hose");
        registrationPage.getHouseField().sendKeys(house);
    }

    @Step("Enter apartment")
    public void enterApartment(String apartment) {
        log.info("Enter apartment");
        registrationPage.getApartmentField().sendKeys(apartment);
    }

    @Step("Enter porch")
    public void enterPorch(String porch) {
        log.info("Enter porch");
        registrationPage.getPorchField().sendKeys(porch);
    }

    @Step("Enter floor")
    public void enterFloor(String floor) {
        log.info("Enter floor");
        registrationPage.getFloorField().sendKeys(floor);
    }

    @Step("Click submit button")
    public void clickSubmitButton() {
        log.info("Click submit button");
        registrationPage.getSubmitButton().click();
    }

    @Step("Get Error Phone")
    public boolean isThereErrorPhone() {
        log.info("Get Error Phone");
        return registrationPage.getErrorPhone().isDisplayed();
    }

    @Step("Enter user account email")
    public void enterUserAccountEmail(String email) {
        log.info("Enter user account email");
        registrationPage.getUserAccountEmail().sendKeys(email);
    }

    @Step("Enter user account password")
    public void enterUserAccountPassword(String password) {
        log.info("Enter user account password");
        registrationPage.getUserAccountPassword().sendKeys(password);
    }

    @Step("Click user account submit button")
    public void clickAccountSubmitButton() {
        log.info("Click user account submit button");
        registrationPage.getSubmitAccountButton().click();
    }
}

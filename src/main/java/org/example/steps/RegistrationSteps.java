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
        Waiters.waitForVisibility(registrationPage.getEmailField(), 20);
        registrationPage.getEmailField().sendKeys(email);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        registrationPage.getPasswordField().sendKeys(password);
    }

    @Step("Repeat password")
    public void repeatPassword(String password) {
        registrationPage.getPasswordRepeatField().sendKeys(password);
    }

    @Step("Get User Account Error")
    public boolean isThereAccountError() {
        return registrationPage.getUserAccountError().isDisplayed();
    }

    @Step("Enter first name, last name")
    public void enterUser(String userData) {
        registrationPage.getUserField().sendKeys(userData);
    }

    @Step("Enter mobile phone")
    public void enterPhone(String phone) {
        Waiters.waitForVisibility(registrationPage.getPhoneField(), 30);
        registrationPage.getPhoneField().sendKeys(phone);
    }

    @Step("Click gender button")
    public void clickGenderButton() {
        registrationPage.getGenderMaleButton().click();
    }

    @Step("Choose age")
    public void chooseAge(String age) {
        registrationPage.getAgeDropDown().sendKeys(age);
        registrationPage.getAgeDropDown().sendKeys(Keys.RETURN);
    }

    @Step("Choose occupation")
    public void chooseOccupation(String occupation) {
        registrationPage.getOccupationDropDown().sendKeys(occupation);
        registrationPage.getOccupationDropDown().sendKeys(Keys.RETURN);
    }

    @Step("Enter street")
    public void enterStreet(String street) {
        registrationPage.getStreetField().sendKeys(street);
    }

    @Step("Enter hose")
    public void enterHouse(String house) {
        registrationPage.getHouseField().sendKeys(house);
    }

    @Step("Enter apartment")
    public void enterApartment(String apartment) {
        registrationPage.getApartmentField().sendKeys(apartment);
    }

    @Step("Enter porch")
    public void enterPorch(String porch) {
        registrationPage.getPorchField().sendKeys(porch);
    }

    @Step("Enter floor")
    public void enterFloor(String floor) {
        registrationPage.getFloorField().sendKeys(floor);
    }

    @Step("Click submit button")
    public void clickSubmitButton() {
        registrationPage.getSubmitButton().click();
    }

    @Step("Get Error Phone")
    public boolean isThereErrorPhone() {
        return registrationPage.getErrorPhone().isDisplayed();
    }

    @Step("Enter user account email")
    public void enterUserAccountEmail(String email) {
        registrationPage.getUserAccountEmail().sendKeys(email);
    }

    @Step("Enter user account password")
    public void enterUserAccountPassword(String password) {
        registrationPage.getUserAccountPassword().sendKeys(password);
    }

    @Step("Click user account submit button")
    public void clickAccountSubmitButton() {
        registrationPage.getSubmitAccountButton().click();
    }
}

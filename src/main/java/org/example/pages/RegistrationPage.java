package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@name=\"astroauth_login\"]")
    private WebElement accountEmailField;
    @FindBy(xpath = "//input[@name=\"astroauth_pass\"]")
    private WebElement accountPasswordField;
    @FindBy(xpath = "//input[@name=\"astroauth_submit\"]")
    private WebElement submitAccountButton;
    @FindBy(xpath = "//div[@class=\"popupContent\"]")
    private WebElement accountNotificationError;
    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name=\"pass\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name=\"repass\"]")
    private WebElement passwordRepeatField;
    @FindBy(xpath = "//input[@name=\"fio\"]")
    private WebElement userField;
    @FindBy(xpath = "//input[@name=\"phone\"]")
    private WebElement phoneField;
    @FindBy(xpath = "//input[@ value=\"мужской\"]")
    private WebElement genderMaleButton;
    @FindBy(xpath = "//input[@ value=\"женский\"]")
    private WebElement genderFemaleButton;
    @FindBy(xpath = "//input[@name=\"subscribe\"]")
    private WebElement subscribeButton;
    @FindBy(xpath = "//select[@ name=\"age\"]")
    private WebElement ageDropDown;
    @FindBy(xpath = "//select[@name=\"occupation\"]")
    private WebElement occupationDropDown;
    @FindBy(xpath = "//input[@name=\"street\"]")
    private WebElement streetField;
    @FindBy(xpath = "//input[@name=\"house\"]")
    private WebElement houseField;
    @FindBy(xpath = "//input[@name=\"room\"]")
    private WebElement apartmentField;
    @FindBy(xpath = "//input[@name=\"porch\"]")
    private WebElement porchField;
    @FindBy(xpath = "//input[@name=\"floor\"]")
    private WebElement floorField;
    @FindBy(xpath = "//button[contains (@class,'btn button')]")
    private WebElement submitButton;
    @FindBy(xpath = "//div[contains (text(),'Контактный телефон')]")
    private WebElement errorPhone;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserAccountEmail() {
        return accountEmailField;
    }

    public WebElement getUserAccountPassword() {
        return accountPasswordField;
    }

    public WebElement getSubmitAccountButton() {
        return submitAccountButton;
    }

    public WebElement getUserAccountError() {
        return accountNotificationError;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getPasswordRepeatField() {
        return passwordRepeatField;
    }

    public WebElement getUserField() {
        return userField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getGenderMaleButton() {
        return genderMaleButton;
    }

    public WebElement getGenderFemaleButton() {
        return genderFemaleButton;
    }

    public WebElement getSubscribeButton() {
        return subscribeButton;
    }

    public WebElement getAgeDropDown() {
        return ageDropDown;
    }

    public WebElement getOccupationDropDown() {
        return occupationDropDown;
    }

    public WebElement getStreetField() {
        return streetField;
    }

    public WebElement getHouseField() {
        return houseField;
    }

    public WebElement getApartmentField() {
        return apartmentField;
    }

    public WebElement getPorchField() {
        return porchField;
    }

    public WebElement getFloorField() {
        return floorField;
    }

    public WebElement getErrorPhone() {
        return errorPhone;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}

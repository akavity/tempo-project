package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationPage extends BasePage {
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
    private WebElement genderButton;

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

    public RegistrationPage(WebDriver driver) {
        super(driver);
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

    public WebElement getGenderButton() {
        return genderButton;
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
}

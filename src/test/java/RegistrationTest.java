import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.steps.RegistrationSteps;
import org.example.waiters.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    protected WebDriver driver;
    private RegistrationSteps registrationSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        registrationSteps = new RegistrationSteps(driver);
    }

    @Test(description = "Check registration form data",
            dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkTempoPizzaRegistration(UserData userData) {
        registrationSteps.enterEmail(userData.getEmail());
        registrationSteps.enterPassword(userData.getPassword());
        registrationSteps.repeatPassword(userData.getPassword());
        registrationSteps.enterUser(userData.getUserData());
        registrationSteps.enterPhone(userData.getPhone());
        registrationSteps.clickGenderButton();
        registrationSteps.chooseAge(userData.getAge());
        registrationSteps.chooseOccupation(userData.getOccupation());
        registrationSteps.enterStreet(userData.getStreet());
        registrationSteps.enterHouse(userData.getHouse());
        registrationSteps.enterApartment(userData.getApartment());
        registrationSteps.enterPorch(userData.getPorch());
        registrationSteps.enterFloor(userData.getFloor());
    }
}

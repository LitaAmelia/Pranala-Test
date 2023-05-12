package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {
    WebDriver driver;
    @Given("User on Register page")
    public void userOnRegisterPage() throws InterruptedException{
        //Set Web Driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stage.mobipaid.com/en/register");
        Thread.sleep(500);
    }

    @When("User Click button Next Step")
    public void userClickButtonNextStep() throws InterruptedException{
        WebElement buttonNextStep = driver.findElement(By.xpath("//*[@id='btn-register']"));
        buttonNextStep.click();
        Thread.sleep(500);
    }

    @Then("User get Alert message")
    public void userGetAlertMessage() throws InterruptedException{
        WebElement alertMessage = driver.findElement(By.id("signatory_first_name"));
        Assert.assertEquals(alertMessage.getText(), "Please fill out this field");
        Thread.sleep(500);
        driver.quit();
    }

    @When("User input First Name")
    public void userInputFirstName() {
        WebElement inputFirstName = driver.findElement(By.id("signatory_first_name"));
        inputFirstName.sendKeys("Lita");
    }

    @And("User input Last Name")
    public void userInputLastName() {
        WebElement inputLastName = driver.findElement(By.id("signatory_last_name"));
        inputLastName.sendKeys("Amelia");
    }

    @And("User input Email")
    public void userInputEmail() {
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("litaameliaj@gmail.com");
    }

    @And("User input Password")
    public void userInputPassword() {
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("@Pranalatest12");
    }

    @And("User input Company Name")
    public void userInputCompanyName() {
        WebElement inputCompanyName = driver.findElement(By.xpath("//*[@id='name']"));
        inputCompanyName.sendKeys("Pranala");
    }

    @And("User click Code Phone")
    public void userClickCodePhone() {
        WebElement clickCodePhone = driver.findElement(By.className("iti__selected-flag"));
        clickCodePhone.click();
    }

    @Then("User Select Code Phone")
    public void userSelectCodePhone() {
        WebElement selectCodePhone = driver.findElement(By.id("iti-1__item-id"));
        selectCodePhone.click();
    }

    @And("User input Phone Number")
    public void userInputPhoneNumber() {
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//*[@id='formRegister']/div[5]/div[2]/div/input"));
        inputPhoneNumber.sendKeys("82279967635");
    }

    @And("User click Country")
    public void userClickCountry() {
        WebElement dropdownCountry = driver.findElement(By.id("country"));
        dropdownCountry.click();
    }

    @Then("User select Country")
    public void userSelectCountry() {
        WebElement selectCountry = driver.findElement(By.cssSelector("#country > option:nth-child(7)"));
        selectCountry.click();
    }

    @And("User input state")
    public void userInputState() {
        WebElement inputState = driver.findElement(By.name("state"));
        inputState.sendKeys("Lampung");
    }

    @And("User click checkbox")
    public void userClickCheckbox() {
        WebElement clickCheckbox = driver.findElement(By.xpath("//*[@id='formRegister']/div[6]/div/input"));
        clickCheckbox.click();
    }

    @Then("User directed to Dashboard")
    public void userDirectedToDashboard() {
        WebElement dashboard = driver.findElement(By.xpath("//*[@id='main-content']/section/div/div/div/section/header"));
        Assert.assertTrue(dashboard.isDisplayed());
    }
}

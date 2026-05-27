package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEmployeePage {

    WebDriver driver;

    // Constructor
    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator
    private By menuPIM = By.xpath("//span[text()='PIM']");

    private By btnaddEmployee = By.xpath("//a[text()='Add Employee']");

    private By txtFirstName = By.name("firstName");

    private By txtLastName = By.name("lastName");

    private By btnSave = By.xpath("//button[@type='submit']");

    private By txtPersonalDetails = By.xpath("//h6[text()='Personal Details']");

    // Methods
    // click on menuPIM Button
    public void clickPIM() {
        driver.findElement(menuPIM).click();
    }

    // click on add Employee
    public void clickAddEmployee() {
        driver.findElement(btnaddEmployee).click();
    }

    // enter name in first name
    public void setTxtFirstName(String fname) {
        driver.findElement(txtFirstName).sendKeys(fname);
    }

    // enter name in last name
    public void setTxtLastName(String lname) {
        driver.findElement(txtLastName).sendKeys(lname);
    }

    // click on the save button
    public void clickSave() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(btnSave));

        driver.findElement(btnSave).click();


    }

    public boolean isPersonalDetailsDisplayed()
    {
        return driver.findElement(txtPersonalDetails).isDisplayed();
    }
}


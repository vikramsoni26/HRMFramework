package testCases;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass {
                             // i used inheritance where login test extends baseclass to reuse browser setup and teardown
                             // methods
    @Test
    public void verifyLogin()
    {
        setup();

        LoginPage lP = new LoginPage(driver);

        lP.setUsername("admin");

        lP.setPassword("admin123");

        lP.clickLogin();

        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);

        System.out.println("Login Test Passed");
    }
}

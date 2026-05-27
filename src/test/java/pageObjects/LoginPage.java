package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

         WebDriver driver;

         // Constructor
         public LoginPage(WebDriver driver)
         {
             this.driver=driver;
         }                              // why constructor is used because Browser driver ko page class tak bhejne ke liye.

         // Locators
         private By txtUsername = By.name("username");  // why locators are private because encapsulation data hiding

         private By txtPassword = By.name("password");

         private By btnLogin = By.xpath("//button[@type='submit']");

         // Action Methods
         public void setUsername(String uname)   // setUsername methods
         {
             driver.findElement(txtUsername).sendKeys(uname);
         }

         public void setPassword(String pwd)  // set password methods
         {
             driver.findElement(txtPassword).sendKeys(pwd);
         }

         public void clickLogin()
         {
            driver.findElement(btnLogin).click();
         }
}

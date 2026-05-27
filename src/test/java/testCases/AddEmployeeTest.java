package testCases;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddEmployeePage;
import pageObjects.LoginPage;

public class AddEmployeeTest extends BaseClass {

    @Test
    public void verifyAddEmployee()
    {
        setup();

        // Login
        LoginPage lp = new LoginPage(driver);

        // Enter username in login
        lp.setUsername("admin");

        // Enter Password
        lp.setPassword("admin123");

        lp.clickLogin();

        // Add Employee
        AddEmployeePage addEmp =  new AddEmployeePage(driver);

        addEmp.clickPIM();

        addEmp.clickAddEmployee();

        addEmp.setTxtFirstName("Shobhit");

        addEmp.setTxtLastName("Gupta");

        addEmp.clickSave();

        // Validation
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(addEmp.isPersonalDetailsDisplayed());

        System.out.println("Employee Added Successfully");

    }
}

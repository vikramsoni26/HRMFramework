package testCases;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddEmployeePage;
import pageObjects.LoginPage;

public class SearchEmployeeTest extends BaseClass {

    @Test
    public void verifySearchEmployee()
    {

        setup();

        // Login
        LoginPage lp = new LoginPage(driver);

        lp.setUsername("admin");

        lp.setPassword("admin123");

        lp.clickLogin();

        // Search Employee
        AddEmployeePage emp = new AddEmployeePage(driver);

        emp.clickPIM();

        emp.clickEmployeeList();

        emp.searchEmployee("Shobhit");

        emp.clickSearch();

        // validation
        Assert.assertTrue(emp.isRecordFound());

        System.out.println("Employee Search Successful");
        
        teardown();

    }
}

package testCases;

import baseClass.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddEmployeePage;
import pageObjects.LoginPage;

public class AddEmployeeDDTTest extends BaseClass {

    @Test
    public void testAddEmployeeDDT() {

        setup();

        LoginPage lp = new LoginPage(driver);

        lp.setUsername("admin");
        lp.setPassword("admin123");
        lp.clickLogin();

        AddEmployeePage addEmp = new AddEmployeePage(driver);

        addEmp.clickPIM();
        addEmp.clickAddEmployee();
        addEmp.setTxtFirstName("Vikram");
        addEmp.setTxtLastName("Kumar");
        addEmp.clickSave();

        System.out.println("Employee Added Successfully");
    }

}

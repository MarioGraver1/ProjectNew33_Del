package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;
import pageObjects.LoginPageSteps;
import utilities.CommonTask;

import java.util.List;

public class TCc002 extends BaseClass {

    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage(driver);
        CommonTask ct = new CommonTask();
        LoginPageSteps lsp = new LoginPageSteps();

        ct.lounchApplication(baseURL);
        lsp.loginWithValidAccess(userName,password);


       Assert.assertEquals("Title doesn’t match with expected","Guru99 Bank Manager HomePage",driver.getTitle());

    }


}

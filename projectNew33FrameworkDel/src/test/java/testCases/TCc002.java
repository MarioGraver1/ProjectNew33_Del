package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pageObjects.LoginPage;

import java.util.List;

public class TCc002 extends BaseClass {

    @Test
    public void loginTest() {
        driver.get(baseURL);
        // driver.manage().window().setSize(new Dimension(750, 850));
        LoginPage lp = new LoginPage(driver);

        lp.setTxtUserName(userName);
        lp.setTxtPassword(password);
        lp.clickSubmit();


        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);

        }


    }
}

package testCases;

import org.junit.Test;
import pageObjects.LoginPage;

public class TCs001 extends BaseClass{

    @Test
    public void loginPageTest() {

        driver.get(baseURL);

        LoginPage lp = new LoginPage(driver);

        lp.demoSiteIspresent();


        lp.clickDropDownBankProject();


    }
}

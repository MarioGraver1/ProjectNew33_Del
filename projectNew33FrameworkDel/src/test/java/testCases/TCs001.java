package testCases;

import org.junit.Test;
import pageObjects.LoginPage;
import utilities.CommonTask;

public class TCs001 extends BaseClass{

    @Test
    public void loginPageTest() {

        LoginPage lp = new LoginPage(driver);
        CommonTask ct = new CommonTask();


        ct.lounchApplication(baseURL);

        lp.demoSiteIspresent();

        lp.clickDropDownBankProject();


    }
}

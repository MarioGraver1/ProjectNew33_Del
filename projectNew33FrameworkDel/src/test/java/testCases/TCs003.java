package testCases;

import org.junit.Test;
import pageObjects.LoginPage;
import pageObjects.LoginPageSteps;
import utilities.CommonTask;

public class TCs003 extends BaseClass {

    @Test
    public void bankPage() {

        LoginPage lp = new LoginPage(driver);
        CommonTask ct = new CommonTask();
        LoginPageSteps lsp = new LoginPageSteps();

        ct.lounchApplication(baseURL);
        lsp.loginWithValidAccess(userName,password);
        lp.clickLinkNewAccount();
    }
}

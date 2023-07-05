package testCases;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.LoginPage;
import pageObjects.LoginPageSteps;
import utilities.CommonTask;

public class TCs003_ResetBtn extends BaseClass {

    @Test
    public void bankPage() {

        LoginPage lp = new LoginPage(driver);
        CommonTask ct = new CommonTask();
        LoginPageSteps lsp = new LoginPageSteps();

        ct.lounchApplication(baseURL);
        lsp.loginWithValidAccess(userName,password);
        lp.clickLinkNewAccount();
        String nameAccText = lp.accountNameGetText();

        Assert.assertEquals("Account title is not correct","Add new account form",nameAccText);

        lp.setCustomerId(customerIdValue);
        lp.setSelectAccount();
        lp.setInitialDepId(initialDepositValue);
        lp.clickReset();

        customerIdValue.isEmpty();
        initialDepositValue.isEmpty();


    }
}

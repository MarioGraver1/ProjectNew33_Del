package testCases;

import org.junit.Test;
import pageObjects.LoginPage;

public class TCs003 extends BaseClass{

      @Test
              public void bankPage(){

    driver.get(baseURL);
    LoginPage lp = new LoginPage(driver);

        lp.setTxtUserName(userName);
        lp.setTxtPassword(password);
        lp.clickSubmit();
        lp.clickLinkNewAccount();

      }
}

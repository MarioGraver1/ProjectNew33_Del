package pageObjects;

import testCases.BaseClass;

public class LoginPageSteps extends BaseClass {

    public void loginWithValidAccess(String userName, String password){
        LoginPage lp = new LoginPage(driver);
        lp.setTxtUserName(userName);
        lp.setTxtPassword(password);
        lp.clickSubmit();
    }

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver =  rdriver;
        PageFactory.initElements(rdriver,this);
    }

        @FindBy(name = "uid")
        WebElement txtUserName;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    WebElement btnLogin;

    @FindBy(id = "site-name")
    WebElement demoSite;

    @FindBy(xpath = "(//a[contains(@class,'dropdown-toggle')])[2]")
    WebElement bankProject;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
    WebElement newAccountLink;

    //Actions
    public void setTxtUserName(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit() {
        btnLogin.click();
    }

    public void clickLinkNewAccount() {
        newAccountLink.click();
    }

    public void demoSiteIspresent() {
        demoSite.isDisplayed();
    }

    public void clickDropDownBankProject() {
        bankProject.click();
    }




}

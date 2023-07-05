package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static testCases.BaseClass.driver;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
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

    @FindBy(className = "heading3")
    WebElement nameAccountFormText;

    @FindBy(name = "cusid")
    WebElement customerId;

    @FindBy(name = "selaccount")
    WebElement selectAccount;
    @FindBy(name = "inideposit")
    WebElement initDeposit;

    @FindBy(name =  "reset")
    WebElement resetBtn;


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

    public String accountNameGetText() {
        return nameAccountFormText.getText();
    }

    public void setCustomerId(String cusId) {
        customerId.sendKeys(cusId);
    }

    public void setSelectAccount() {
        selectAccount.click();

        Select selectAccoutType = new Select(driver.findElement(By.name("selaccount")));
        selectAccoutType.selectByVisibleText("Current");
    }

    public void setInitialDepId(String initialDepId) {
    initDeposit.sendKeys(initialDepId);
    }
    public void clickReset() {
        resetBtn.click();
    }

}

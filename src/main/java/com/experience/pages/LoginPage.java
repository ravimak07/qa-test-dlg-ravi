package com.experience.pages;

import com.cucumber.listener.Reporter;
import com.experience.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Ravi's Creation
 * Date of Creation 30/07/2020
 */
public class LoginPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    // locators

    // locator for username field - real xpath
    @FindBy (xpath = "//input[@name='loginUsername']")
    WebElement _enterUsername;

    public void enterUsernameToTheField (String userName){
        Reporter.addStepLog("enter user name" + userName + "to the field" + _enterUsername.toString() + "<br>");
        sendTextToElement(_enterUsername,userName);
        log.info("enter user name" + userName + "to the field" + _enterUsername.toString());
    }
    // locator for password field - name
    @FindBy (name = "loginPassword")
    WebElement _enterPassword;

    public void enterPasswordToTheField (String passWord){
        Reporter.addStepLog("enter password" + passWord + "to the field" + _enterPassword.toString() + "<br>");
        sendTextToElement(_enterPassword,passWord);
        log.info("enter password" + passWord + "to the field" + _enterPassword.toString());
    }

    // locator for login button - tag name
    @FindBy (tagName = "button")
    WebElement _loginButton;

    public void clickOnLogInButton (){
        Reporter.addStepLog("click on log in button" + _loginButton.toString() );
        clickOnElement(_loginButton);
        log.info("click on log in button" + _loginButton.toString());
    }

    @FindBy(xpath = "//html//body//app-root")
    WebElement _popUp;



}

package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advencedButton;

    @FindBy(xpath = "//a[@id='proceed-link']")
    public WebElement unsafePressing;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement failedCredentials;

    public void logIn(){
        username.sendKeys("username");
        password.sendKeys("password");
        logInButton.click();
        advencedButton.click();
        BrowserUtils.waitForVisibility(unsafePressing,5);
        unsafePressing.click();
    }
}

package com.qlitelabs.pageobjects;

import com.qlitelabs.core.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;

public class LoginPage extends Page {
    @FindBy(id = "txtUsername")
    private WebElement txtUsername;
    @FindBy(id = "txtPassword")
    private WebElement txtPassword;
    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
        WebElement[] elements = {txtUsername, txtPassword, btnLogin};
        wait.until(ExpectedConditions.visibilityOfAllElements(Arrays.asList(elements)));
    }

    public HomePage enterValidCredentials(String userName, String password) {
        WebElementHelper.sendKeys(txtUsername, userName);
        WebElementHelper.sendKeys(txtPassword, password);
        WebElementHelper.click(btnLogin);
        return new HomePage(driver);
    }
}

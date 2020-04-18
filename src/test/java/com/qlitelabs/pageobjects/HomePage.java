package com.qlitelabs.pageobjects;

import com.qlitelabs.core.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

    @FindBy(id = "welcome")
    private WebElement lblWelcome;
    @FindBy(linkText = "Logout")
    private WebElement linkLogout;

    public HomePage(WebDriver driver) {
        super(driver);
        WebElement[] elements = {lblWelcome, linkLogout};
        wait.until(ExpectedConditions.visibilityOf(lblWelcome));
    }

    public LoginPage logOut() {
        WebElementHelper.click(lblWelcome);
        WebElementHelper.click(linkLogout);
        return new LoginPage(driver);
    }
}

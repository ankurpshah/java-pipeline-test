package com.qlitelabs.tests;

import com.qlitelabs.base.TestBase;
import com.qlitelabs.constants.Constants;
import com.qlitelabs.core.WebElementHelper;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import com.qlitelabs.pageobjects.HomePage;
import com.qlitelabs.pageobjects.LoginPage;

import static com.qlitelabs.core.DriverBase.getDriver;


public class LoginTests extends TestBase {
    @Test(groups = {"smoke"})
    @Flaky
    @Description("Validating Credentials")
    @Story("Check Credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Issues({
            @Issue("MYISSUE-1"),
            @Issue("MYISSUE-2")
    })
    @TmsLink("TMS-123")
    public void checkValidLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage detailsPage = loginPage.enterValidCredentials(Constants.USER_NAME, Constants.PASSWORD);
        WebElementHelper.takeScreenShot();
        detailsPage.logOut();
    }
}

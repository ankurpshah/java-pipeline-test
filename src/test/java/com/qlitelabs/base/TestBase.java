package com.qlitelabs.base;

import com.qlitelabs.core.DriverBase;
import com.qlitelabs.listeners.ScreenshotListener;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.qlitelabs.constants.Constants.APP_URL;
import static com.qlitelabs.core.DriverBase.getDriver;

@Listeners(ScreenshotListener.class)
public class TestBase {

    @BeforeMethod(alwaysRun = true)
    public void instantiateDriverObject() {
        DriverBase.instantiateDriverObject();
        String sessionId = ((RemoteWebDriver) getDriver()).getSessionId().toString();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().get(APP_URL);

    }

    @AfterMethod(alwaysRun = true)
    public void closeDriverObjects() {
        DriverBase.closeDriverObjects();
    }
}
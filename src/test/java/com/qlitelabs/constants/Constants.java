package com.qlitelabs.constants;

import com.qlitelabs.utils.ConfigReader;

public class Constants {
    public static final int WAIT_EXPLICIT_SEC = Integer.parseInt(!(System.getProperty("wait.explicit.seconds") == null) ? System.getProperty("wait.explicit.seconds") : ConfigReader.loadProperty("wait.explicit.seconds"));
    public static final String APP_URL = !(System.getProperty("app.url") == null) ? System.getProperty("app.url") : ConfigReader.loadProperty("app.url");
    public static final String USER_NAME = !(System.getProperty("username") == null) ? System.getProperty("username") : ConfigReader.loadProperty("username");
    public static final String PASSWORD = !(System.getProperty("password") == null) ? System.getProperty("password") : ConfigReader.loadProperty("password");
}
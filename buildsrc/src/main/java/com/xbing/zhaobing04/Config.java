package com.xbing.zhaobing04;

public class Config {

    private static Config sInstance = new Config();
    public AddTryCatchExtension extension;

    public static Config getInstance() {
        return sInstance;
    }
}

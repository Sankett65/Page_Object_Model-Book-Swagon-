package com.sw.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Base {

    public  static WebDriver driver;
    public  static Properties props;






    public Base() {
        try {
            props = new Properties();
            FileInputStream inputStream = new FileInputStream("D:\\Page Object Model Selenium\\Book_Swagon_POM\\src\\main\\java\\com\\sw\\config\\config.properties");
            props.load(inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void baseMethod(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
       // log.info("Chrome is opening");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(props.getProperty("url"));

       // log.info("url is opening");


    }
}

package com.experience.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation 30/07/2020
 */

public class BasePage {

    // web driver

    public static WebDriver driver;

    // constructor

    public BasePage(){
        PropertyConfigurator.configure(("user.dir")+"/src/test/java/com/bjss/resources/properties/log4j.properties");
        PageFactory.initElements(driver,this);
    }
}

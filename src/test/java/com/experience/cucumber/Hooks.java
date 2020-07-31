package com.experience.cucumber;


import com.cucumber.listener.Reporter;
import com.experience.basepage.BasePage;
import com.experience.browserselector.BrowserSelector;
import com.experience.loadproperty.LoadProperty;
import com.experience.utility.UtilityRM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation 30/07/2020
 */

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");

    String chrome = loadProperty.getProperty("browser1");
    String firefox = loadProperty.getProperty("browser2");
    String ie = loadProperty.getProperty("browser3");
    private String screenShotPath;

    // this will open browser before test starts

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(chrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        Reporter.assignAuthor("DLG", "Ravi Mak");
    }
    // this will close the browser

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenShotPath = UtilityRM.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }

}

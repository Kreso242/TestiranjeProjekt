import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AlarmSetTest{
    AndroidDriver driver;
    @BeforeClass()
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "D:\\Android\\AndroidStudioProjects\\Duhos\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
        capabilities.setCapability("VERSION", "9.0");
        capabilities.setCapability("deviceName","emulator");
        capabilities.setCapability("platformName","Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test() throws Exception {
        StartingPage startingPage = new StartingPage(driver);
        ChooseActivityPage chooseActivityPage = new ChooseActivityPage(driver);
        CalendarPage calendarPage = new CalendarPage(driver);
        DialogPage dialogPage = new DialogPage(driver);
        AlarmPage alarmPage = new AlarmPage(driver);

        startingPage.start();
        chooseActivityPage.start();
        Assert.assertEquals(calendarPage.isDisplayed(),true);
        calendarPage.clickOnEvent();
        Assert.assertEquals(dialogPage.isDisplayed(),true);
        dialogPage.setAlarm();
        Assert.assertEquals(alarmPage.isDisplayed(),true);
        alarmPage.setPartOfTheDay(true,false);
        alarmPage.setHours(11);
        alarmPage.setMinutes(5);
        alarmPage.saveAlarm();
        Assert.assertEquals(calendarPage.isDisplayed(),true);
        calendarPage.clickOnEvent();

        Assert.assertEquals(dialogPage.getReminder(),"⭐ Obavijest dolazi istoga dana u: 11:05h");

    }

    public void teardown(){
        //close the app
        driver.quit();
    }
}

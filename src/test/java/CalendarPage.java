import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CalendarPage {
    private AndroidDriver<AndroidElement> driver;

    public CalendarPage(){
    }

    public CalendarPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    private AndroidElement calendarPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView")
    private AndroidElement julyTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.FrameLayout[6]/android.widget.TextView")
    private AndroidElement event;

    public void clickOnEvent(){
        event.click();
    }

    public boolean isDisplayed(){
        return calendarPage.isDisplayed();
    }

    public boolean checkIfScrolled(){
        return julyTab.isDisplayed();
    }

    public void scroll(){
        MobileElement el = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"July 2020\"));");
        el.click();
    }

    public void scrollBack(){
        MobileElement el = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"January 2020\"));");
        el.click();
    }
    public void navigateBack(){
        driver.navigate().back();
    }

}

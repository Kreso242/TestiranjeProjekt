import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ChooseActivityPage {
    private AndroidDriver<AndroidElement> driver;

    public ChooseActivityPage(){
    }

    public ChooseActivityPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="com.example.duhos:id/circle_menu")
    private AndroidElement calendarButton;

    public boolean isDisplayed(){
        return calendarButton.isDisplayed();
    }

    public void clickOn(){
        (new TouchAction(driver)).tap(point(778, 1241)).perform();
        (new TouchAction(driver)).tap(point(778, 1241)).perform();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void start(){
        clickOn();
    }
}

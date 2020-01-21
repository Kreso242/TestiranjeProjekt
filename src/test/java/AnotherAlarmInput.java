import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AnotherAlarmInput {
    private AndroidDriver<AndroidElement> driver;

    public AnotherAlarmInput(){
    }

    public AnotherAlarmInput(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout")
    private AndroidElement anotherInputAlarmPage;

    @AndroidFindBy(id = "com.example.duhos:id/idAlarmButton")
    private AndroidElement saveAlarmButton;

    @AndroidFindBy(id = "android:id/input_hour")
    private AndroidElement inputHourEditor;

    @AndroidFindBy(id = "android:id/input_minute")
    private AndroidElement inputMinuteEditor;

    @AndroidFindBy(id = "android:id/toggle_mode")
    private AndroidElement changeInputTypeButton;

    @AndroidFindBy(id = "android:id/am_pm_spinner")
    private AndroidElement am_pm_spinner;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private AndroidElement amButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private AndroidElement pmButton;

    public void setPartOfTheDay(boolean am, boolean pm){
        am_pm_spinner.click();
        if(am && !pm)
            amButton.click();
        if(!am && pm)
            pmButton.click();
        if(am && pm)
            amButton.click();
        if(!am && !pm)
            pmButton.click();
    }

    public void setHours(int hour){
        inputHourEditor.setValue(Integer.toString(hour));
    }

    public void setMinutes(int minutes){
        inputMinuteEditor.setValue(Integer.toString(minutes));

    }

    public void changeInputType(){
        changeInputTypeButton.click();
    }

    public boolean isDisplayed(){
        return anotherInputAlarmPage.isDisplayed();
    }

    public void navigateBack(){
        driver.navigate().back();
    }
}

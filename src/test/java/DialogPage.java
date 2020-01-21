import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DialogPage {

    private AndroidDriver<AndroidElement> driver;

    public DialogPage(){
    }

    public DialogPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout")
    private AndroidElement dialog;

    @AndroidFindBy(id="android:id/button1")
    private AndroidElement ureduButton;

    @AndroidFindBy(id="android:id/button2")
    private AndroidElement izlazButton;

    @AndroidFindBy(id="com.example.duhos:id/idSwitch")
    private AndroidElement switchButton;

    @AndroidFindBy(id = "android:id/alertTitle")
    private AndroidElement title;

    @AndroidFindBy(id = "com.example.duhos:id/idTexDatum")
    private AndroidElement date;
    @AndroidFindBy(id = "com.example.duhos:id/idTextVrijeme")
    private AndroidElement time;
    @AndroidFindBy(id = "com.example.duhos:id/idTextLokacija")
    private AndroidElement location;

    @AndroidFindBy(id="com.example.duhos:id/idSat")
    private AndroidElement reminder;

    public boolean isSwitchChecked(){
        if(!switchButton.isSelected())
            return false;
        else
            return true;
    }

    public String getReminder(){
        if(reminder.isDisplayed())
            return reminder.getText();
        else
            return "";
    }

    public String getTime(){
        return time.getText();
    }

    public String getLocation(){
        return location.getText();
    }
    public String getDate(){
        return date.getText();
    }

    public String getTitle(){
        return title.getText();
    }

    public boolean isDisplayed(){
        return ureduButton.isDisplayed();
    }

    public void clickOnUredu(){
        ureduButton.click();
    }
    public void clickOnIzlaz(){
        izlazButton.click();
    }

    public void setAlarm(){
        if(!switchButton.isSelected()) {
            switchButton.click();
        }
        clickOnUredu();
    }

    public void cancelAlarm(){
        if(switchButton.isEnabled())
            switchButton.click();

        clickOnUredu();

    }

    public void navigateBack(){
        driver.navigate().back();
    }

}

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AlarmPage {
    private AndroidDriver<AndroidElement> driver;

    public AlarmPage(){
    }

    public AlarmPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout")
    private AndroidElement alarmpage;

    @AndroidFindBy(id = "com.example.duhos:id/idAlarmButton")
    private AndroidElement saveAlarmButton;

    @AndroidFindBy(id = "android:id/toggle_mode")
    private AndroidElement changeInputTypeButton;

    @AndroidFindBy(id = "android:id/am_label")
    private AndroidElement amButton;

    @AndroidFindBy(id = "android:id/am_label")
    private AndroidElement pmButton;



    @AndroidFindBy(accessibility = "12")
    private AndroidElement h12;
    @AndroidFindBy(accessibility = "11")
    private AndroidElement h11;
    @AndroidFindBy(accessibility = "10")
    private AndroidElement h10;
    @AndroidFindBy(accessibility = "9")
    private AndroidElement h9;
    @AndroidFindBy(accessibility = "8")
    private AndroidElement h8;
    @AndroidFindBy(accessibility = "7")
    private AndroidElement h7;
    @AndroidFindBy(accessibility = "6")
    private AndroidElement h6;
    @AndroidFindBy(accessibility = "5")
    private AndroidElement h5;
    @AndroidFindBy(accessibility = "4")
    private AndroidElement h4;
    @AndroidFindBy(accessibility = "3")
    private AndroidElement h3;
    @AndroidFindBy(accessibility = "2")
    private AndroidElement h2;
    @AndroidFindBy(accessibility = "1")
    private AndroidElement h1;

    @AndroidFindBy(accessibility = "5")
    private AndroidElement m5;
    @AndroidFindBy(accessibility = "10")
    private AndroidElement m10;
    @AndroidFindBy(accessibility = "15")
    private AndroidElement m15;
    @AndroidFindBy(accessibility = "20")
    private AndroidElement m20;
    @AndroidFindBy(accessibility = "25")
    private AndroidElement m25;
    @AndroidFindBy(accessibility = "30")
    private AndroidElement m30;
    @AndroidFindBy(accessibility = "35")
    private AndroidElement m35;
    @AndroidFindBy(accessibility = "40")
    private AndroidElement m40;
    @AndroidFindBy(accessibility = "45")
    private AndroidElement m45;
    @AndroidFindBy(accessibility = "50")
    private AndroidElement m50;
    @AndroidFindBy(accessibility = "55")
    private AndroidElement m55;
    @AndroidFindBy(accessibility = "60")
    private AndroidElement m60;


    public void setHours(int hour){
        switch (hour){
            case 12:
                h12.click();
                break;
            case 11:
                h11.click();
                break;
            case 10:
                h10.click();
                break;
            case 9:
                h9.click();
                break;
            case 8:
                h8.click();
                break;
            case 7:
                h7.click();
                break;
            case 6:
                h6.click();
                break;
            case 5:
                h5.click();
                break;
            case 4:
                h4.click();
                break;
            case 3:
                h3.click();
                break;
            case 2:
                h2.click();
                break;
            case 1:
                h1.click();
                break;
        }
    }

    public void setMinutes(int minutes){
        switch (minutes){
            case 5:
                m5.click();
                break;
            case 10:
                m10.click();
                break;
            case 15:
                m15.click();
                break;
            case 20:
                m20.click();
                break;
            case 25:
                m25.click();
                break;
            case 30:
                m30.click();
                break;
            case 35:
                m35.click();
                break;
            case 40:
                m40.click();
                break;
            case 45:
                m45.click();
                break;
            case 50:
                m50.click();
                break;
            case 55:
                m55.click();
                break;
            case 60:
                m60.click();
                break;
        }
    }

    public void setPartOfTheDay(boolean am, boolean pm){
        if(am && !pm)
            amButton.click();
        if(!am && pm)
            pmButton.click();
        if(am && pm)
            amButton.click();
        if(!am && !pm)
            amButton.click();
    }

    public void changeInputType(){
        changeInputTypeButton.click();
    }

    public void saveAlarm(){
        saveAlarmButton.click();
    }

    public boolean isDisplayed(){
        return saveAlarmButton.isDisplayed();
    }

    public void navigateBack(){
        driver.navigate().back();
    }



}

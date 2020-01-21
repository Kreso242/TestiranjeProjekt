import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class MobileHomeScreenPage {

    private AndroidDriver<AndroidElement> driver;

    public MobileHomeScreenPage(){
    }

    public MobileHomeScreenPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Duhos\"]")
    private AndroidElement appIcon;

    public void CloseApp() throws InterruptedException {
        driver.closeApp();
    }

    public void LockDevice(){
        driver.lockDevice();

    }
    public void UnLockDevice(){
        driver.unlockDevice();
    }

    public void OpenApp(){
        appIcon.click();
    }

}

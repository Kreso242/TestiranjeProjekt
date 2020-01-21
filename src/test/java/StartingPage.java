import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
    private AndroidDriver<AndroidElement> driver;

    public StartingPage(){
    }

    public StartingPage(AndroidDriver<AndroidElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="com.example.duhos:id/circle_menu")
    private AndroidElement duhosButton;

    public boolean isDisplayed(){
        return duhosButton.isDisplayed();
    }

    public void clickOn(){
        duhosButton.click();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void start(){
        clickOn();
    }
}


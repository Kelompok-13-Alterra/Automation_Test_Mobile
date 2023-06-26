package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class FrontScreen extends BasePageObject {

    private By skipButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    }

    @Step
    public boolean OnTheFrontPage() {
        return waitUntilVisible(skipButton()).isDisplayed();
    }

    @Step
    public void CLickSkipButton(){
        onClick(skipButton());
    }
}
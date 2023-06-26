package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class ProfileScreen extends BasePageObject {
    private By logoutButton() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]");
    }

    @Step
    public boolean OnTheProfilePage() {
        return waitUntilVisible(logoutButton()).isDisplayed();
    }
    @Step
    public void CLickLogoutButton() {
        onClick(logoutButton());
    }
}


package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject {

    private By searchField(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ketik lokasi saat ini\"]");
    }

    private By profileButton(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Profile Tab 3 of 3\"]");
    }

    private By officeButton(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Athena Office 3.4 Jakarta 07:00 AM - 21:00 PM IDR 150,000,140,000,140,000\"]");
    }


    @Step
    public boolean OnTheHomePage(){
        return waitUntilVisible(searchField()).isDisplayed();
    }

    @Step
    public void CLickProfileButton(){
        onClick(profileButton());
    }

    @Step
    public void CLickSearchField(){
        onClick(searchField());
    }

    @Step
    public void CLickOfficeButton(){
        onClick(officeButton());
    }
}

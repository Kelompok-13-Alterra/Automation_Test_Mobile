package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class ResultsearchScreen extends BasePageObject {
    private By ngalupOffice() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ngalup.co Open 4.6 office Malang 09:30:00 - 20:45:00 IDR 100000\"]");
    }

    @Step
    public boolean OnTheResultPage() {
        return waitUntilVisible(ngalupOffice()).isDisplayed();
    }

}

package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;
public class PaymentScreen extends BasePageObject{
    private By title(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]");
    }

    @Step
    public boolean OnThePaymentPage(){
        return waitUntilVisible(title()).isDisplayed();
    }
}

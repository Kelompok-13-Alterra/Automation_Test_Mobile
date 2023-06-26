package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;
public class OfficeScreen extends BasePageObject{
    private By title(){
        return MobileBy.xpath("");
    }
    private By bookingButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Booking\"]\n");
    }
    private By startDateButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"9, Sunday, July 9, 2023\"]");
    }
    private By endDateButton(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"10, Monday, July 10, 2023\"]");
    }
    private By saveButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"SAVE\"]");
    }
    private By nextButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Selanjutnya\"]");
    }
    private By choosePaymentButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih metode pembayaran\"]");
    }
    private By bniButton(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"BNI Gratis Biaya Pembayaran\"]/android.widget.RadioButton");
    }
    private By paymentButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]");
    }

    @Step
    public boolean OnTheOfficePage(){
        return waitUntilVisible(title()).isDisplayed();
    }
    @Step
    public void CLickBookingButton(){
        onClick(bookingButton());
    }
    @Step
    public void CLickStartDateButton(){
        onClick(startDateButton());
    }
    @Step
    public void CLickEndDateButton(){
        onClick(endDateButton());
    }
    @Step
    public void CLickSaveButton(){
        onClick(saveButton());
    }
    @Step
    public void CLickNextButton(){
        onClick(nextButton());
    }
    @Step
    public void CLickChoosePaymentButton(){
        onClick(choosePaymentButton());
    }
    @Step
    public void CLickBniButton(){
        onClick(bniButton());
    }
    @Step
    public void CLickPaymentButton(){
        onClick(paymentButton());
    }

}

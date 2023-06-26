package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    private By registerLink(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register here\"]");
    }



    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By remembermeCheckBox() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    }


    @Step
    public void CLickRegisterLink(){
        onClick(registerLink());
    }


    @Step
    public boolean OnTheLoginPage(){
        return waitUntilVisible(loginButton()).isDisplayed();
    }


    @Step
    public void InputEmail(String email){
        onType(emailField(), email);
    }
    @Step
    public void InputPassword(String password){
        onType(passwordField(), password);
    }
    @Step
    public void CLickRememberMeCheckBox(){
        onClick(remembermeCheckBox());
    }
    @Step
    public void CLickLoginButton(){
        onClick(loginButton());
    }
}

package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    private By nameField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By passwordConfirmField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");
    }
    private By termCheckBox(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
    }
    private By registerButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]");
    }


    @Step
    public void InputValidName(String name){
        onType(nameField(), name);
    }
    @Step
    public void InputValidEmail(String email){
        onType(emailField(), email);
    }
    @Step
    public void InputValidPassword(String password){
        onType(passwordField(), password);
    }
    @Step
    public void ConfirmPassword(String pass){
        onType(passwordConfirmField(), pass);
    }
    @Step
    public void CLickTermCheckBox(){
        onClick(termCheckBox());
    }
    @Step
    public void CLickRegisterButton(){
        onClick(registerButton());
    }

}

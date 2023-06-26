package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class SearchScreen extends BasePageObject {
    private By searchField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }

    @Step
    public boolean OnTheSearchPage() {
        return waitUntilVisible(searchField()).isDisplayed();
    }
    @Step
    public void InputSearch(String search){
        onType(searchField(), search);
    }

}

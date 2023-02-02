package tech.beget.u920152e.age;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tech.beget.u920152e.core.BasePage;

public class AgePage extends BasePage {
    @FindBy(xpath = "//input[@type='radio'][@value='18']")
    private WebElement lessEighteen;

    public WebElement getLessEighteen() {
        return lessEighteen;
    }

    public AgePage() {
        PageFactory.initElements(driver, this);
    }
}

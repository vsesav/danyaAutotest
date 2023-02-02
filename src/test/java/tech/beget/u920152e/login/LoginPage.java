package tech.beget.u920152e.login;

import com.typesafe.config.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tech.beget.u920152e.age.AgePage;
import tech.beget.u920152e.configurations.ConfigProvider;
import tech.beget.u920152e.core.BasePage;

public class LoginPage extends BasePage {
    @FindBy(id = "timer-counter")
    private WebElement timer;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public AgePage auth(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
        return new AgePage();
    }
}

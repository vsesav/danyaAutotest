package tech.beget.u920152e.login;

import org.junit.Assert;
import org.junit.Test;
import tech.beget.u920152e.age.AgePage;
import tech.beget.u920152e.configurations.ConfigProvider;
import tech.beget.u920152e.core.BaseTest;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        AgePage agePage = new LoginPage().auth(ConfigProvider.EMAIL, ConfigProvider.PASSWORD);
        Assert.assertTrue(agePage.getLessEighteen().isSelected());
    }
}
package testUI;

import config.EnvironmentConfig;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;

public class LoginTest extends TestBase{

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();

    @DisplayName("Verify the login successfully")
    @Owner("JBGroup")
    @Epic("Authentication")
    @Feature("Login")
    @Description("this test is to verify the login successfully using valid credentials")
    @Link("JIRA00001")
    @Issue("BUG00001")
    @Story("55555")
    @Order(1)
    @Test
    public void verifyLoginTest(){
        mainPage.loginButton.click();
        loginModal.emailTxtBox.setText(EnvironmentConfig.user);
        loginModal.pwdTxtBox.setText(EnvironmentConfig.pwd);
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.iconButton.checkControlIsDisplayed(),
                "ERROR! login failed" );
        menuSection.iconButton.click();
        menuSection.logoutButton.click();
    }
}

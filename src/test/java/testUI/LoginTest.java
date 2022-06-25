package testUI;

import config.EnvironmentConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;

public class LoginTest extends TestBase{

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();

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

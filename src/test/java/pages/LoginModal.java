package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

    //public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    //public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    //public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));


    public TextBox emailTxtBox = new TextBox(By.cssSelector("#labeled-input-1"));
    public TextBox pwdTxtBox = new TextBox(By.cssSelector("#labeled-input-3"));
    public Button loginButton = new Button(By.cssSelector("button.nFxHGeI"));


}//end LoginModal

package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

    public TextBox emailTxtBox = new TextBox(By.cssSelector("#labeled-input-1"),"[email] textbox in LoginModal");
    public TextBox pwdTxtBox = new TextBox(By.cssSelector("#labeled-input-3"),"[password] textbox in LoginModal");
    public Button loginButton = new Button(By.cssSelector("button.nFxHGeI"),"[login] button in LoginModal");


}//end LoginModal

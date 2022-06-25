package pages;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {

    public Button iconButton= new Button(By.cssSelector("div.user_avatar > img"));
    public Button logoutButton= new Button(By.xpath("/html/body/div[4]/div/div/div/button[2]/span"));

}//end MenuSection

package control;

import org.openqa.selenium.By;

public class TextBox extends Control{

    public TextBox(By locator, String nameControl) {
        super(locator, nameControl);
    }

    public void setText(String value){
        this.findControl();
        this.step("set text in "+nameControl+" with the value: "+value);
        this.control.clear();
        this.control.sendKeys(value);
    }

}//ene


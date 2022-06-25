package control;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class Control {

    protected WebElement control;
    protected By locator;
    //reflection (option)
    protected String nameControl;

    public Control (By locator,String nameControl){
        this.locator=locator;
        this.nameControl=nameControl;
    }

    protected void findControl(){
        control= Session.getInstance().getDriver().findElement(locator);
    }

    public void click(){
        this.step("click on "+nameControl);
        this.findControl();
        control.click();
    }

    public boolean checkControlIsDisplayed(){
        try {
            this.findControl();
            this.step("is displayed the control: "+nameControl+" ? true");
            return control.isDisplayed();
        } catch (Exception e){
            this.step("is displayed the control: "+nameControl+" ? false");
            return false;
        }
    }

    @Step("{0}")
    public void step(String action){
    }


}

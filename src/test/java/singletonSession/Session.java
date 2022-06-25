package singletonSession;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {

    // atributo del mismo tipo
    private static Session session=null;
    private WebDriver driver;

    // constructor privado
    private Session(){
        driver= FactoryBrowser.make("proxy").create();
    }

    // metodo estatico publico para retornar la sesion unica
    public static Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }

    public void closeBrowser(){
        driver.quit();
        session=null;
    }

    public WebDriver getDriver() {
        return driver;
    }



}//end Session

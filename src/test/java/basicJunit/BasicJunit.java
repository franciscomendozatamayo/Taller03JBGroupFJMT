package basicJunit;

import factoryBrowser.FactoryBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit{

    @BeforeEach
    public void setup(){
        System.out.println("setup");
        FactoryBrowser.make("proxy").create().get("http://todo.ly/");
    }
    @AfterEach
    public void cleanUp(){
        System.out.println("cleanup");
    }

    @Test
    public void itIsATest() throws InterruptedException {

        Thread.sleep(3000);
        System.out.println("este es un test");
    }


}//end BasicJunit

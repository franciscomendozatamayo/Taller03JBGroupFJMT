package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singletonSession.Session;
import static config.EnvironmentConfig.host;

public class TestBase {

    @BeforeEach
    public void openBrowser(){Session.getInstance().getDriver().get(host);}

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeBrowser();
    }
}

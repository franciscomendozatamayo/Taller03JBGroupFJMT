package factoryBrowser;

import config.OwaspConfig;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ChromeProxy implements IBrowser{

    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy(OwaspConfig.host+":"+OwaspConfig.port);
        proxy.setSslProxy(OwaspConfig.host+":"+OwaspConfig.port);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("proxy", proxy);

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.setExperimentalOption("prefs", prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}

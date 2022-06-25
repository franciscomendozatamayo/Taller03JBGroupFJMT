package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

    private static ReadConfig instance = null;

    private String host;
    private String user;
    private String pwd;
    private String owaspHost;
    private String owaspPort;
    private String owaspProtocol;
    private String browser;

    private ReadConfig() {
        Properties properties = new Properties();
        String nameFile = "qa.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if (inputStream != null) {
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}

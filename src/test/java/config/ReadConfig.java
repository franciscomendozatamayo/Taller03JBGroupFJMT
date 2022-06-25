package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {

    private static ReadConfig instance=null;
    private String host;
    private String user;
    private String pwd;
    private String owaspHost;
    private String owaspPort;
    private String owaspProtocol;
    private String browser;

    private ReadConfig(){
        Properties properties = new Properties();
        String nameFile="qa.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if (inputStream!= null ){
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        host=properties.getProperty("host");
        user=properties.getProperty("user");
        pwd=properties.getProperty("pwd");
        owaspHost=properties.getProperty("owasp_host");
        owaspPort=properties.getProperty("owasp_port");
        owaspProtocol=properties.getProperty("owasp_protocol");
        browser=properties.getProperty("browser");
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ReadConfig getInstance(){
        if(instance == null)
            instance= new ReadConfig();
        return instance;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    public String getOwaspHost() {
        return owaspHost;
    }

    public String getOwaspPort() {
        return owaspPort;
    }

    public String getOwaspProtocol() {
        return owaspProtocol;
    }

    public String getBrowser() {
        return browser;
    }




}

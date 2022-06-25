package config;

public class EnvironmentConfig {

    public static String host= ReadConfig.getInstance().getHost();
    public static String user=ReadConfig.getInstance().getUser();
    public static String pwd=ReadConfig.getInstance().getPwd();

}//end EnviromentConfig

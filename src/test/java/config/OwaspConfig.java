package config;

public class OwaspConfig {

    // host/port
    public static String protocol=ReadConfig.getInstance().getOwaspProtocol();
    public static String host=ReadConfig.getInstance().getHost();
    public static String port=ReadConfig.getInstance().getOwaspPort();

    // api
    public static final String START_SCANNING=protocol+host+":"+port+"/JSON/ascan/action/scan/?url=";
    public static final String CHECK_STATUS=protocol+host+":"+port+"/JSON/ascan/view/status/?scanId=";
    public static final String READ_ALERTS=protocol+host+":"+port+"/JSON/alert/view/alerts/?baseurl=";
    public static final String READ_LIST_ATTACK=protocol+host+":"+port+"/JSON/ascan/view/scanProgress/?scanId=";
    public static final String GENERATE_REPORT=protocol+host+":"+port+"/OTHER/core/other/htmlreport/?";
    public static final String GENERATE_REPORT2=protocol+host+":"+port+"/JSON/reports/action/generate/?title=report&template=traditional-html";

}

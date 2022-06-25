package factoryBrowser;

public class FactoryBrowser {

    /*
     *  multiples opciones usar un Map
     *  opciones contables switch case
     *  pocas opciones if else
     * */
    public static IBrowser make (String typeBrowser){
        IBrowser browser;
        switch (typeBrowser.toLowerCase()){
            case "chrome":
                browser= new Chrome();
                break;
            case "proxy":
                browser= new ChromeProxy();
                break;

            default:
                browser= new Chrome();
                break;
        }
        return browser;
    }

}

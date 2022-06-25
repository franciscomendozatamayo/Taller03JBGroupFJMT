package factoryRequest;

public class FactoryRequest {

    public static Request make(String typeRequest){

        Request request;

        switch (typeRequest.toLowerCase()){
            case "get":
                request = new RequestGET();
                break;
            case "post":
                request= new RequestPOST();
                break;
            case "put":
                request= new RequestPUT();
                break;
            default:
                request = new RequestDELETE();
                break;
        }

        return request;

    }

}

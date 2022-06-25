package factoryRequest;



import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends Request{

    @Override
    public ResponseInformation send(String url, String body) {
        System.out.println("GET request: "+url);
        System.out.println("request body: "+body);

        Response response= this.client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get();
        ResponseInformation responseInformation= new ResponseInformation();
        responseInformation.setBody(response.readEntity(String.class));
        responseInformation.setResponseCode(response.getStatus());

        System.out.println("response code: "+responseInformation.getResponseCode());
        System.out.println("response body: "+responseInformation.getBody());

        return responseInformation;
    }


}

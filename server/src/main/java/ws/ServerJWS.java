package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8989/",new BanqueService());
        System.out.println("Web service déployé");
    }
}
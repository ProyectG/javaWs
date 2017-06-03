package proyectg;


import javax.xml.ws.Endpoint;
import proyectg.WsImplementacion;

//Endpoint publisher
public class WsPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/ws/test", new WsImplementacion());
    }

}

package proyectg;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "proyectg.WService")
public class WsImplementacion implements WService{

	@Override
	public int sumarDigitos(int a,int b) {
		int c = a+b;
		return c;
	}

}


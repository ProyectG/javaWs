package proyectg;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//End Point salida
@WebService
@SOAPBinding(style = Style.RPC)
public interface WService{

	@WebMethod int sumarDigitos(int a,int b);

}



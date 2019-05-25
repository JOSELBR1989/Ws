
package org.josebaten.ws.core.bean;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServicioSumarWC {
    @WebMethod
    public int sumar(int x, int y);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.josebaten.ws.core.bean;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface="org.josebaten.ws.core.bean.ServicioSumarWC")
public class ServicioSumarImpl implements ServicioSumarWC {

    @Override
    public int sumar(int x, int y) {
        return x + y;
    }
    
}

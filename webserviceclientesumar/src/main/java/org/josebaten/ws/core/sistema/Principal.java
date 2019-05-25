package org.josebaten.ws.core.sistema;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWC;
import javax.swing.JOptionPane;
public class Principal {
    
    public static void main(String args[]){
            ServicioSumarWC servicioSumar = new ServicioSumarImplService()
                    .getServicioSumarImplPort();
            
            String x = JOptionPane.showInputDialog("Ingrese un valor de X");
            String y = JOptionPane.showInputDialog("Ingrese un valor de Y");
            
            JOptionPane.showMessageDialog(null, "Resultado> " + servicioSumar.sumar(Integer.parseInt(x), Integer.parseInt(y)));
    }
}

package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pagos;

public class BilleteraPagos {
    private Persona persona;
    private double gastoPagos;
    private  String mes;
    private ArrayList<Pagos> pagos;

    public BilleteraPagos(Persona per, String m, ArrayList<Pagos> pags) {
        persona = per;
        mes = m;
        pagos = pags;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona n) {
        persona = n;
    }

    public double getGastoPagos() {
        return gastoPagos;
    }

    public void calcularGastoPagos() {
        gastoPagos = 0;
        for (Pagos pago : pagos) {
            gastoPagos += pago.getPago();
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String n) {
        mes = n;
    }

    public ArrayList<Pagos> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pagos> n) {
        pagos = n;
    }
    
    
    
    @Override
    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        String m = String.format("""
                                 ---------------Reporte Pagos------------
                                 Cliente: %s %s
                                 Edad: %d
                                 Cedula: %s
                                 Ciudad: %s
                                 Mes: %s
                                 
                                 """, 
                persona.getNombre(),
                persona.getApellido(),
                persona.getEdad(),
                persona.getCedula(),
                persona.getCiudad(),
                mes);
        
        for (Pagos p : pagos) {
            m = String.format("%s%s", m, p);
        }
        
        m = String.format("""
                          
                          %sGasto de pagos: $%.2f
                          """, m, gastoPagos);
        
        return m;
    }
    
}

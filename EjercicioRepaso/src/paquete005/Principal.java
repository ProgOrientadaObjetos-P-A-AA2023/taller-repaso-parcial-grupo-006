package paquete005;

import java.util.ArrayList;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.Pagos;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Pagos> lista = new ArrayList<>();
      
        PagoAguaPotable agua01 = new PagoAguaPotable(25.3, 3.2, 
                12, "comercial");
        agua01.calcularPago();
        lista.add(agua01);
        
        PagoAguaPotable agua02 = new PagoAguaPotable(55.3, 77.2, 
                4.5, "casa");
        agua02.calcularPago();
        lista.add(agua02);
        
        PagoLuzElectrica luz01 = new PagoLuzElectrica(23, 2.2, 
                "Loja", 2.2);
        
        
        BilleteraPagos pago = new BilleteraPagos();
        System.out.println(pago);
    }
}

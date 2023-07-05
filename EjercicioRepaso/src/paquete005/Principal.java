package paquete005;

import java.util.ArrayList;
import paquete001.Persona;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;
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
        luz01.calcularPago();
        lista.add(luz01);

        PagoLuzElectrica luz02 = new PagoLuzElectrica(45, 5.6,
                "Quito", 2.2);
        luz02.calcularPago();
        lista.add(luz02);

        PagoPredial casa01 = new PagoPredial(52.3, 10);
        casa01.calcularPago();
        lista.add(casa01);

        PagoPredial casa02 = new PagoPredial(66.3, 25);
        casa02.calcularPago();
        lista.add(casa02);

        PagoTelefonoConvencional telf01
                = new PagoTelefonoConvencional(33.2, 5.56,
                        7.7);
        telf01.calcularPago();
        lista.add(telf01);

        PagoTelefonoConvencional telf02
                = new PagoTelefonoConvencional(45.2, 7.56,
                        7.7);
        telf02.calcularPago();
        lista.add(telf02);

        Persona persona = new Persona("Luis", "Mora", 19, "5156465",
                "Quito");

        BilleteraPagos pago = new BilleteraPagos(persona, "Enero", lista);
        pago.calcularGastoPagos();

        System.out.println(pago);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import paquete003.BilleteraPagos;
import java.util.ArrayList;
import paquete001.Persona;
import paquete004.*;
import static paquete006.DatosAgua.*;
import static paquete006.DatosLuz.*;
import static paquete006.DatosPropiedades.datosP;
import static paquete006.DatosTelefono.datosT;;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pagos> lista = new ArrayList();

        // DatosAgua
        double[][] datosComerciales = datosComerciales();

        for (int i = 0; i < datosComerciales.length; i++) {
            double tarifa = datosComerciales[i][0];
            double metrosConsumo = datosComerciales[i][1];
            double costoConsumo = datosComerciales[i][2];
            String tipo = "comercial";

            Pagos p = new PagoAguaPotable(tarifa, metrosConsumo, costoConsumo, 
                    tipo);
            lista.add(p);
        }

        // DatosAgua
        double[][] datosCasas = datosCasas();

        for (int i = 0; i < datosCasas.length; i++) {
            double tarifa = datosCasas[i][0];
            double metrosConsumo = datosCasas[i][1];
            double costoConsumo = datosCasas[i][2];
            String tipo = "casa";

            Pagos p = new PagoAguaPotable(tarifa, metrosConsumo, costoConsumo, 
                    tipo);
            lista.add(p);
        }

        // DatosLuz
        double[][] datosLoja = datosLoja();

        for (int i = 0; i < datosLoja.length; i++) {
            double tarifa = datosLoja[i][0];
            double consumo = datosLoja[i][1];
            double costo = datosLoja[i][2];
            String ciudad = "Loja";

            Pagos p = new PagoLuzElectrica(tarifa, consumo, costo, ciudad);
            lista.add(p);

        }

        // DatosLuz
        double[][] datosGeneral = datosGeneral();

        for (int i = 0; i < datosGeneral.length; i++) {
            double tarifa = datosGeneral[i][0];
            double consumo = datosGeneral[i][1];
            double costo = datosGeneral[i][2];
            String ciudad = "Cuenca";

            Pagos p = new PagoLuzElectrica(tarifa, consumo, costo, ciudad);
            lista.add(p);

        }

        // DatosPropiedades
        double[][] datosPropiedades = datosP();

        for (int i = 0; i < datosPropiedades.length; i++) {
            double costo = datosPropiedades[i][0];
            double porcentaje = datosPropiedades[i][1];

            Pagos p = new PagoPredial(costo, porcentaje);
            lista.add(p);

        }

        // DatosTelefono
        double[][] datosTelefono = datosT();

        for (int i = 0; i < datosTelefono.length; i++) {
            double tarifa = datosTelefono[i][0];
            double consumoMin = datosTelefono[i][1];
            double costoMin = datosTelefono[i][2];

            Pagos p = new PagoTelefonoConvencional(tarifa, consumoMin, costoMin);
            lista.add(p);
        }
        
        Persona persona = new Persona("Adriana", "Guaman", 35, "1503058413", 
                "Loja");
        
        for (Pagos lista1 : lista) {
            lista1.calcularPago();
        }
 
        BilleteraPagos pago = new BilleteraPagos(persona, "Febrero", lista);
        pago.calcularGastoPagos();
        System.out.println(pago);
    }
}

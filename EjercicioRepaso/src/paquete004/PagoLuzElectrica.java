package paquete004;

import paquete002.Ciudad;

public class PagoLuzElectrica extends Pagos {

    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;
    private double tarifaBase;

    public PagoLuzElectrica(double kilConsm, double costKil, String ciu,
            double tafBase) {
        tarifaBase = tafBase;
        kilovatiosConsumidos = kilConsm;
        costoKilovatio = costKil;
        ciudad = ciu;
    }

    public double getKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public void setKilovatiosConsumidos(double n) {
        kilovatiosConsumidos = n;
    }

    public double getCostoKilovatio() {
        return costoKilovatio;
    }

    public void setCostoKilovatio(double n) {
        costoKilovatio = n;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String n) {
        ciudad = n;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double n) {
        tarifaBase = n;
    }

    @Override
    public void calcularPago() {
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 ****Pago Luz Electrica****
                                    Ciudad: %s
                                    Consumo Kilovatios: $%.2f
                                    Costo Consumo Kilovatios: $%.2f
                                    Tarifa Base: $%.2f
                                 %s
                                 
                                 """,
                ciudad,
                kilovatiosConsumidos,
                costoKilovatio,
                tarifaBase,
                super.toString());
        return m;
    }
}

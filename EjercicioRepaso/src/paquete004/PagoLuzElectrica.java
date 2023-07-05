package paquete004;

public class PagoLuzElectrica {
    private double kilovatiosConsumidos;
    private double costoKilovatio;

    public double calcularPago() {
        double pago = 0;
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

        return pago;
    }
}

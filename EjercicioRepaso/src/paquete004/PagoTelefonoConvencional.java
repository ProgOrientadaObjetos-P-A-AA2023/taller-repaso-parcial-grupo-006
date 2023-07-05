package paquete004;

public class PagoTelefonoConvencional extends Pagos {

    private double minutosConsumidos;
    private double costoMinuto;
    private double tarifaBase;

    public PagoTelefonoConvencional(double minCons, double costMin,
            double tafBase) {
        tarifaBase = tafBase;
        minutosConsumidos = minCons;
        costoMinuto = costMin;
    }

    public double getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void setMinutosConsumidos(double n) {
        minutosConsumidos = n;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double n) {
        costoMinuto = n;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double n) {
        tarifaBase = n;
    }
    

    @Override
    public void calcularPago() {
        pago = tarifaBase + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 ****Pago Telefono Convecional****
                                    Costo Minuto: $%.2f
                                    Minutos Consumidos: $%.2f
                                    Tarifa Base: $%.2f
                                 %s
                                 
                                 """,
                costoMinuto,
                minutosConsumidos,
                tarifaBase,
                super.toString());
        return m;
    }
}

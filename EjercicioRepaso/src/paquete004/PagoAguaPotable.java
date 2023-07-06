package paquete004;

public class PagoAguaPotable extends Pagos {

    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;
    private double tarifaBase;

    public PagoAguaPotable(double tafBase, double metroCub, double costo,
            String tip) {
        tarifaBase = tafBase;
        metrosCubicosConsumo = metroCub;
        costoConsumoCubicos = costo;
        tipo = tip;
    }

    public double getMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void setMetrosCubicosConsumo(double n) {
        metrosCubicosConsumo = n;
    }

    public double getCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void setCostoConsumoCubicos(double n) {
        costoConsumoCubicos = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String n) {
        tipo = n;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double n) {
        tarifaBase = n;
    }

    @Override
    public void calcularPago() {
        if (tipo.equals("comercial")) {
            pago = tarifaBase + (metrosCubicosConsumo * costoConsumoCubicos) + 15;

        } else if (tipo.equals("casa")) {
            pago = tarifaBase + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 **** Pago Agua Potable ****
                                    Tipo: %s
                                    Consumo Metros Cubicos: $%.2f
                                    Costo Consumo Metros Cubicos: $%.2f
                                    Tatifa Base: $%.2f
                                 %s
                                 
                                 """,
                tipo,
                metrosCubicosConsumo,
                costoConsumoCubicos,
                tarifaBase,
                super.toString());
        return m;
    }
    
    
}

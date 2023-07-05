package paquete004;

public class PagoAguaPotable extends Pagos {

    private double metrosCubicosConsumo;
    private  double costoConsumoCubicos;

    public PagoAguaPotable(double tafBase, double metroCub, double costo) {
        super(tafBase);
        metrosCubicosConsumo = metroCub;
        costoConsumoCubicos = costo;
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
    
    @Override
    public void calcularPago(String tipo) {
        if (tipo.equals("comercial")) {
            pago = tarifaBase + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
            
        } else if(tipo.equals("casa")){
            pago = tarifaBase + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }
}

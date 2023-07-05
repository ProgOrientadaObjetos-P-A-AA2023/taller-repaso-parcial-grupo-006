package paquete004;

public class PagoPredial extends Pagos {

    private double costoPropiedad;
    private double porcentaje;

    public PagoPredial(double costP, double porc) {
        costoPropiedad = costP;
        porcentaje = porc;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    public void setCostoPropiedad(double n) {
        costoPropiedad = n;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double n) {
        porcentaje = n;
    }

    @Override
    public void calcularPago() {
        pago = costoPropiedad - ((costoPropiedad * porcentaje) / 100);
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 ****Pago Predial****
                                    Costo Propiedad: $%.2f
                                    Porcentaje: $%.2f
                                 %s
                                 
                                 """,
                costoPropiedad,
                porcentaje,
                super.toString());
        return m;
    }
}

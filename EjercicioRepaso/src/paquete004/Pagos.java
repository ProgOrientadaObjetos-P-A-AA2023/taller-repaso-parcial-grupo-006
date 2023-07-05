
package paquete004;

public abstract class Pagos {
    protected double pago;
    protected double tarifaBase;

    public Pagos(double tafBase) {
       tarifaBase = tafBase;
    }

    public double getPago() {
        return pago;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double n) {
        tarifaBase = n;
    }
    
    public abstract void calcularPago(String n);
    
}

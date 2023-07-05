
package paquete004;

public abstract class Pagos {
    protected double pago;

    public double getPago() {
        return pago;
    }
    
    public abstract void calcularPago();

    @Override
    public String toString() {
        String m = String.format("Pago: $%.2f\n",
                pago);
        
        return m;
    }
    
    
}

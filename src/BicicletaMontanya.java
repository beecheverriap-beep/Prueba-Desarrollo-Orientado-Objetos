public class BicicletaMontanya extends Bicicleta {
    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta, int añoFabricacion, double peso, int supensiones) {
        super(codigoBicicleta, añoFabricacion, peso);
        setCantidadSuspensiones(supensiones);
    }


    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }



    @Override
    public double costoMantencion() {
        double costoBase = 30.000;
        if (cantidadSuspensiones > 1) {
            costoBase = costoBase * 0.15;
        }
        return costoBase;
    }
}

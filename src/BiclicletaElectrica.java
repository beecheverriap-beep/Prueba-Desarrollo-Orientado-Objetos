public class BiclicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
private double kilometrosBicicleta;
private boolean bateriaCertificada;
private boolean garantiaExtendida;


    public BiclicletaElectrica(String codigoBicicleta, int añoFabricacion, double peso, double kilometrosBicicleta, boolean bateriaCertificada) {
        super(codigoBicicleta, añoFabricacion, peso);
        this.kilometrosBicicleta = kilometrosBicicleta;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }



    public double getKilometrosBicicleta() {
        return kilometrosBicicleta;
    }

    public void setKilometrosBicicleta(double kilometrosBicicleta) {
        this.kilometrosBicicleta = kilometrosBicicleta;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }



    @Override
    public double costoMantencion() {
        double costoBase = 45.000;
                if (!bateriaCertificada) {
                    costoBase += costoBase * 0.25;
                }
                return costoBase;
    }

    @Override
    public boolean garantiaExtendidaActiva() {
        return false;
    }

    @Override
    public void garantiaExtendida() {

    }

    public void activarGarantiaExtendida() {
        this.garantiaExtendida = true;
    }
}

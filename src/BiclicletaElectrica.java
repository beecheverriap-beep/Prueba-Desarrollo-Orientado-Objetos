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


// Calcula el costo base dependiendo si este cuanto con certificado o no en la bateria
    @Override
    public double costoMantencion() {
        double costoBase = 45.000;
                if (!bateriaCertificada) {
                    costoBase += costoBase * 0.25;
                }
                return costoBase;
    }

    // Implementacion de los metodos de la interfaz ConGarantiaExtendida

    @Override
    public boolean garantiaExtendidaActiva() {
        return false;
    }

    @Override
    public boolean garantiaExtendida() {
    return garantiaExtendidaActiva();
    }

    public void activarGarantiaExtendida() {
        this.garantiaExtendida = true;
    }
}

public abstract class Bicicleta {
    private String codigoBicicleta;
    private int añoFabricacion;
    private double peso;

    public Bicicleta(String codigoBicicleta, int añoFabricacion, double  peso) {
        this.codigoBicicleta = codigoBicicleta;
        this.añoFabricacion = añoFabricacion;
        this.peso = peso;
    }



    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null) {
            throw new IllegalArgumentException("El codigo del Bicicleta no puede ser nulo");
        }
        this.codigoBicicleta = codigoBicicleta;

    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        if (añoFabricacion < 2000 || añoFabricacion > 2026){
            throw new IllegalArgumentException("El año debe estar entre el rango de 2000 y 2026");
        }
        this.añoFabricacion = añoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a cero");
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "codigoBicicleta='" + codigoBicicleta + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                '}';
    }

    public abstract double costoMantencion();
}

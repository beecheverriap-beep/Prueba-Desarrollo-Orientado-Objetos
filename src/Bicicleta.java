/**
 * Muestra una clase Bicicleta la cual va a ser usada como abstracta para poder usarla como superclase
 *  y que las demas la hereden como son la clase bicicleta electrica y de montaña
 */



public abstract class Bicicleta {
    private String codigoBicicleta;
    private int añoFabricacion;
    private double peso;


    // Inicializa el constructor permitiendo inicializar los atributos
    public Bicicleta(String codigoBicicleta, int añoFabricacion, double  peso) {
        this.codigoBicicleta = codigoBicicleta;
        this.añoFabricacion = añoFabricacion;
        this.peso = peso;
    }



    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }
   // Validamos el codigo de bicicleta en caso de que un usuario ingrese un dato nulo
    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null) {
            throw new IllegalArgumentException("El codigo del Bicicleta no puede ser nulo");
        }
        this.codigoBicicleta = codigoBicicleta;

    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
 // Valida el codigo de año de fabricacion en caso de que ponga un rango fuera de los que estan permitidos
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
        return "Código: " + codigoBicicleta + " | Año: " + añoFabricacion;
    }

    // Metodo que calcula el costo de mantencion de las distintas bicicletas
    public abstract double costoMantencion();
}


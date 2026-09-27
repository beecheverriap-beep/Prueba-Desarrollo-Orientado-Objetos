import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class GestorTallerBicicletas  {
    private List<Bicicleta> bicicletas;
    public GestorTallerBicicletas() {

        this.bicicletas = new ArrayList<>();
    }
    public void registrarBicicleta(Bicicleta bicicleta) {
        try {
        if (bicicleta != null) {
            bicicletas.add(bicicleta);
            System.out.println(bicicleta.getCodigoBicicleta() + " (" + bicicleta.getClass().getSimpleName() + ") registro correcto.");
        }
    } catch (InputMismatchException e) {
            System.out.println("Error al registrar la bicicleta: ");
        }
    }
    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : bicicletas) {
            if (b.getCodigoBicicleta().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }
    public void listarBicicletas() {
        System.out.println(" Listado bicicletas");
        for (Bicicleta b : bicicletas) {
            System.out.println(b.toString());
        }
}
}


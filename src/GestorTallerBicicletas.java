import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class GestorTallerBicicletas  {
    private List<Bicicleta> bicicletas;
    public GestorTallerBicicletas() {

        this.bicicletas = new ArrayList<>();
    }
    // Registra una bicicleta en la coleccion informandole a la consola del registro recien ingresado
    public void registrarBicicleta(Bicicleta bicicleta) {
        try {
        if (bicicleta != null) {
            bicicletas.add(bicicleta);
            System.out.println(bicicleta.getCodigoBicicleta() + " (" + bicicleta.getClass().getSimpleName() + ") registro correcto.");
        }
    } catch (InputMismatchException e) {
            System.out.println("Error al registrar la bicicleta: ");
        }

        // Busca las bicicletas cuyo codigo coincida
    }
    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : bicicletas) {
            if (b.getCodigoBicicleta().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }

    // Muestra el listado completo mediante toString()

    public void listarBicicletas() {
        System.out.println(" Listado bicicletas");
        for (Bicicleta b : bicicletas) {
            System.out.println(b.toString());
        }
}
}


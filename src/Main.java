import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GestorTallerBicicletas gestor = new GestorTallerBicicletas();

        try {

        BiclicletaElectrica e01 = new BiclicletaElectrica ("BIC-E01", 2023, 22.5, 60, false);
        BiclicletaElectrica e02 = new BiclicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontanya m01 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontanya m02 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);


        e01.activarGarantiaExtendida();

        gestor.registrarBicicleta(e01);
        gestor.registrarBicicleta(e02);
        gestor.registrarBicicleta(m01);
        gestor.registrarBicicleta(m02);

        System.out.println("Busqueda por codigo:   BIC-E01");
        Bicicleta encontrada = gestor.buscarPorCodigo("BIC-E01");

        if (encontrada != null) {
            // Se proyecta la información del tipo específico y costo de mantención polimórfico[cite: 2]
            if (encontrada instanceof BiclicletaElectrica) {
                BiclicletaElectrica elec = (BiclicletaElectrica) encontrada;
                System.out.println("Tipo: Bicicleta Eléctrica | Código: " + elec.getCodigoBicicleta() +
                        " | Año: " + elec.getAñoFabricacion() + " | Peso: " + elec.getPeso() + " kg" +
                        " | Autonomía: " + elec.getKilometrosBicicleta() + " km" +
                        " | Batería certificada: " + (elec.isBateriaCertificada() ? "Si" : "No") +
                        "\nGarantía extendida: " + (elec.garantiaExtendidaActiva() ? "Si" : "No") +
                        " | Costo mantención: $" + (int) elec.costoMantencion());
            }

    }
} catch (IllegalArgumentException e) {
            System.out.println("Error al ingresar los datos");
        }
}
    }
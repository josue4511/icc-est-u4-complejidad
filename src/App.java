import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int cantidadEstudiantes = 30000000;
        int cantidad = 1_000_000; 

        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);

        String nombreBuscar = "Estudiante_2900011";
        int intentos = 0;

        for (Estudiante est : estudiantes) {
            if (est.nombre.equals(nombreBuscar)) {
                System.out.println("Existe");
                break;
            } else {
                intentos++;
            }
        }

        System.out.println("Intentos: " + intentos);
        System.out.println("Fin"); 
    }
}
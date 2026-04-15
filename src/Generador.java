import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static List<Estudiante> generarListado(int cantidadEstudiantes){
        List<Estudiante> estudiantes = new ArrayList<>();
        for(int i = 0; i < cantidadEstudiantes; i++ ) {
            String nombre = "Estudiante_" +i;
            int edad = i;
            Estudiante nuevo = new Estudiante (nombre, edad);
            estudiantes.add(nuevo);
        }
        return estudiantes;
    }
    
}
import java.util.ArrayList;
import java.util.List;

public class GestorRecursos {
    private List<RecursoDigital> recursos;

    public GestorRecursos() {
        // Inicializamos la lista de recursos sin inyección de dependencias
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(RecursoDigital recurso) {
        recursos.add(recurso);
    }

    public List<RecursoDigital> listarRecursos() {
        return recursos;
    }

    // Otros métodos (por ejemplo, de búsqueda) se pueden agregar posteriormente.
}

public class ListaEnlazada {
    Nodo principal; // Nodo principal de la lista

    // Constructor
    ListaEnlazada() {
        this.principal = null; // Inicialmente, la lista está vacía
    }

    // Método para agregar un nuevo estudiante al final de la lista
    void agregarEstudiante(String nombreEstudiante, String materia, double promedio) {
        Nodo nuevoNodo = new Nodo(nombreEstudiante, materia, promedio);
        
        // Si la lista está vacía, el nuevo nodo es la cabeza
        if (principal == null) {
            principal = nuevoNodo;
        } else {
            Nodo actual = principal;
            // Recorrer la lista hasta el último nodo
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // Establecer el siguiente nodo del último nodo como el nuevo nodo
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir la lista de estudiantes
    void imprimirLista() {
        Nodo actual = principal;
        if (actual == null) {
            System.out.println("La lista está vacía.");
        } else {
            while (actual != null) {
                System.out.println("Estudiante: " + actual.nombreEstudiante + ", Materia: " + actual.materia + ", Promedio: " + actual.promedio);
                actual = actual.siguiente;
            }
        }
    }

    // Método para buscar un estudiante por su nombre
    Nodo buscarEstudiante(String nombreEstudiante) {
        Nodo actual = principal;
        while (actual != null) {
            if (actual.nombreEstudiante.equals(nombreEstudiante)) {
                return actual; // Estudiante encontrado
            }
            actual = actual.siguiente;
        }
        return null; // Estudiante no encontrado
    }
}



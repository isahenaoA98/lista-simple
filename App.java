public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar estudiantes a la lista
        lista.agregarEstudiante("Juan Pérez", "Matemáticas", 8.5);
        lista.agregarEstudiante("María López", "Física", 9.2);
        lista.agregarEstudiante("Carlos García", "Química", 7.8);
        lista.agregarEstudiante("Ana Rodríguez", "Biología", 9.5);

        // Imprimir la lista de estudiantes
        System.out.println("Lista de estudiantes:");
        lista.imprimirLista();

        // Buscar un estudiante por su nombre
        System.out.println("\nBuscar estudiante 'Carlos García':");
        Nodo estudianteBuscado = lista.buscarEstudiante("Carlos García");
        if (estudianteBuscado != null) {
            System.out.println("Estudiante encontrado: " + estudianteBuscado.nombreEstudiante + ", Materia: " + estudianteBuscado.materia + ", Promedio: " + estudianteBuscado.promedio);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
    

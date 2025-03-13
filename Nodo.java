public class Nodo {

    String nombreEstudiante; // Nombre del estudiante
    String materia;          // Materia que cursa
    double promedio;         // Promedio del estudiante
Nodo siguiente;          // Referencia al siguiente nodo (estudiante)
Nodo(String nombreEstudiante, String materia, double promedio) {
    this.nombreEstudiante = nombreEstudiante;
    this.materia = materia;
    this.promedio = promedio;
    this.siguiente = null;
    }
}
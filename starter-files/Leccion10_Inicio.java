// ── Clase Estudiante (encapsulación + constructor + método) ──
class Estudiante {
    private String nombre;
    private int    edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    public String getNombre()   { return nombre; }
    public double getPromedio() { return promedio; }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                           " | Edad: " + edad +
                           " | Promedio: " + promedio);
    }
}

// ── Clase principal ──
public class Main {
    public static void main(String[] args) {

        // 1. Array de estudiantes

        // 2. Mostrar todos

        // 3. Encontrar el mejor promedio
    }
}
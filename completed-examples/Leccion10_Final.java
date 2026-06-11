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
        Estudiante[] registro = new Estudiante[3];
        registro[0] = new Estudiante("Ana",   20, 16.5);
        registro[1] = new Estudiante("Luis",  22, 14.0);
        registro[2] = new Estudiante("María", 19, 18.0);

        // 2. Mostrar todos
        System.out.println("=== REGISTRO DE ESTUDIANTES ===");
        for (int i = 0; i < registro.length; i++) {
            registro[i].mostrarInfo();
        }

        // 3. Encontrar el mejor promedio
        Estudiante mejor = registro[0];
        for (int i = 1; i < registro.length; i++) {
            if (registro[i].getPromedio() > mejor.getPromedio()) {
                mejor = registro[i];
            }
        }
        System.out.println("\n★ Mejor promedio: " + mejor.getNombre());
    }
}
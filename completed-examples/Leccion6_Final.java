// Importamos la herramienta Scanner para leer el teclado
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Activamos nuestro lector
        Scanner teclado = new Scanner(System.in);

        // Hacemos una pregunta al usuario
        System.out.println("Hola, ¿cuál es tu nombre?");

        // Atrapamos la respuesta y la guardamos
        String nombreUsuario = teclado.nextLine();

        // Usamos la respuesta en pantalla
        System.out.println("¡Es un gusto conocerte, " + nombreUsuario + "!");
        
    }
}
public class Main {

    // Este es nuestro método. Le enseñamos a la computadora a saludar.
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + ", bienvenido al nivel 1!");
    }

    public static void main(String[] args) {
        
        // Usamos nuestro método varias veces sin copiar y pegar código
        saludar("Jugador 1");
        saludar("Ana");
        saludar("Max");
        
    }
}
public class Main {
    public static void main(String[] args) {
        
        int edad = 14;

        if (edad > 12) {
           
            System.out.println("Tienes acceso al juego.");
            
        } else {
            
            System.out.println("Eres muy joven para jugar.");
            
        }

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Cargando jugador " + (i + 1));
            
        }
        
        int energia = 0;

        do {
            
            energia++;
            System.out.println("Energia: " + energia);
            
        } while (energia < 3);

        int vidas = 3;
        
        while (vidas > 0) {
            
            System.out.println("Vidas restantes: " + vidas);
            vidas--;
            
        }
        
    }
}

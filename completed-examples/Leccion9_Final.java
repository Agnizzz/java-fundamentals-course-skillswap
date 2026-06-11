class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrar() {
        System.out.println("Producto: " + nombre + " | Precio: S/." + precio);
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Crear el array con capacidad para 3 objetos
        Producto[] tienda = new Producto[3];

        // 2. Guardar objetos en cada posición
        tienda[0] = new Producto("Cable USB", 15.0);
        tienda[1] = new Producto("Cargador", 35.0);
        tienda[2] = new Producto("Audífonos", 60.0);

        // 3. Recorrer e imprimir cada producto
        for (int i = 0; i < tienda.length; i++) {
            tienda[i].mostrar();
        }
    }
}
# Guion: Lección 9 - Arrays integrados con Objetos

**[0:00 - 0:20] Introducción:** "En la lección anterior aprendiste a crear objetos. Pero, ¿qué pasa cuando necesitas guardar no uno, sino muchos a la vez? Para eso existen los **arrays de objetos**. Vamos a verlo con un ejemplo."

**[0:20 - 0:40] La Clase:** "Tenemos una clase `Producto` con dos atributos: nombre y precio. Un constructor que los recibe, y un método `mostrar()` que imprime la información. Hasta aquí nada nuevo."

**[0:40 - 1:20] Crear el Array:** "Para guardar varios productos usamos un array. La sintaxis es: el tipo de la clase, corchetes, el nombre, y con `new` le decimos cuántos objetos va a contener. Importante: esto solo **reserva el espacio**. Todavía no hay ningún objeto adentro. Ahora sí llenamos cada posición con `new Producto(...)`. Cada posición es como una caja, y en cada caja metemos un objeto."

**[1:20 - 2:10] Recorrer con For:** "Para mostrarlos todos usamos un `for`. Fíjate en la sintaxis: `tienda[i].mostrar()`. Primero accedemos al array con el índice, y luego usamos el punto para llamar al método. Igual que con cualquier objeto, solo que ahora viene de un array." *(Ejecutas y muestras el output en consola)* "El for recorrió las tres posiciones y llamó a `mostrar()` en cada una."

**[2:10 - 2:40] Cierre:** "Para resumir: un array de objetos te permite guardar múltiples instancias en una sola variable. Lo declaras con `TipoClase[]`, reservas el espacio, asignas objetos en cada posición y los recorres con un `for`. Esto es la base de estructuras más complejas que verás más adelante."
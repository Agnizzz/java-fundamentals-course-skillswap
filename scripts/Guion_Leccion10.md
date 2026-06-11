# Guion: Lección 10 - Proyecto Final: Registro de Estudiantes

**[0:00 - 0:25] Introducción:** "Llegamos a la lección final. Hoy vas a construir tu primera aplicación orientada a objetos completa: un **registro de estudiantes**. Vamos a unir todo lo que aprendiste — clases, encapsulación, constructores, arrays — y al final te muestro los tres errores más comunes para que sepas cómo evitarlos."

**[0:25 - 1:20] La Clase Estudiante:** "Empezamos con la clase `Estudiante`. Tiene tres atributos **privados**: nombre, edad y promedio. Privados porque aplicamos encapsulación. El constructor los recibe y los asigna con `this`. Luego tenemos dos getters: `getNombre()` y `getPromedio()`, solo exponemos lo que necesitamos. Y el método `mostrarInfo()` imprime todo en una línea."

**[1:20 - 2:20] Array y Recorrido:** "En el `main` creamos el array para 3 estudiantes y llenamos cada posición con `new Estudiante(...)`. Con el primer `for` recorremos el array y llamamos a `mostrarInfo()` en cada posición. Siempre usa `.length` en lugar de escribir el número a mano." *(Ejecutas y muestras el output)* "Tres líneas, tres objetos."

**[2:20 - 2:55] Mejor Promedio:** "Ahora le damos inteligencia: buscamos al estudiante con el mejor promedio. Guardamos el primero como candidato en `mejor`, luego comparamos con el resto. Si alguno supera el promedio actual, actualizamos `mejor`. Al salir del for, tenemos al ganador."

**[2:55 - 3:45] Errores Comunes:** "Tres errores que todos cometemos. Primero: **NullPointerException** — usar un objeto antes de asignarlo al array. Segundo: **ArrayIndexOutOfBoundsException** — intentar acceder a un índice que no existe, como el índice 3 en un array de tamaño 3. Tercero: declarar una variable de objeto sin usar `new` — si no llamas a `new`, la variable está vacía y Java no te deja usarla."

**[3:45 - 4:00] Cierre:** "¡Y eso es todo! Terminaste el curso con una app POO funcional. Usaste clases, encapsulación, constructores, métodos, arrays y lógica de búsqueda. Desde aquí puedes explorar colecciones, herencia y mucho más. ¡Buen trabajo!"
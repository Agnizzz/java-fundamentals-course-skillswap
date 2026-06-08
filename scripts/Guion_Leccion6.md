# Guion: Lección 6 - Entrada/Salida básica (Scanner)

Buenas tardes, en la lección de hoy vamos a aprender a cómo hacer que tu programa te escuche y podamos interactuar con él usando la consola.

Hasta este momento, nuestros programas han sido como un monólogo. Nosotros escribimos el código, lo ejecutamos, nos muestra un texto y ahí termina. Pero los mejores programas son los que te hacen preguntas y reaccionan a tus respuestas. Para lograr esto en Java, necesitamos usar una herramienta especial llamada `Scanner`.

Miremos la primera línea de nuestro código, arriba de todo *(señalando la línea 1)*. Dice `import java.util.Scanner;`. Java tiene una caja de herramientas gigante guardada. Con esta línea, le estamos pidiendo permiso para sacar la herramienta Scanner y usarla. Si olvidas esto, Java no sabrá de qué le hablas.

Ahora vamos dentro de nuestro bloque `main`. Aquí tenemos la línea `Scanner teclado = new Scanner(System.in);` *(señalándola)*. Suena un poco complejo, pero solo significa que estamos activando nuestro teclado. Fíjense en ese `System.in`. Antes usábamos `System.out` para enviar texto hacia afuera; bueno, `System.in` sirve para meter información hacia adentro.

Una vez que el teclado está activado, usamos un `println` normal para preguntarle al usuario: 'Hola, ¿cuál es tu nombre?'. 

Y aquí viene la magia *(señalando la variable nombreUsuario)*. En la siguiente línea creamos una variable de texto y le decimos que es igual a `teclado.nextLine();`. Ese comando, `nextLine()`, funciona como un botón de pausa. Detiene todo el programa y se queda esperando hasta que tú escribas algo y presiones la tecla Enter.

Una vez que presionas Enter, el programa atrapa lo que escribiste, lo guarda en la variable, y continúa para darte un saludo personalizado.

¡Vamos a probarlo! Le damos al botón de Run *(haciendo clic)*. Fíjense en la consola. Me hace la pregunta y no ha terminado de ejecutarse. El cursor está esperando por mí. Voy a hacer clic abajo, escribo mi nombre... y ahora presiono Enter. ¡Ahí está! El programa atrapó mi texto y me respondió de inmediato.

Un consejo final: un error que a todos nos pasa al principio es olvidar poner la 'S' mayúscula en la palabra `Scanner` o en `String`. Java es muy estricto con esto, así que si las pones en minúscula, verás toda la pantalla con errores rojos. Revisen siempre sus mayúsculas.
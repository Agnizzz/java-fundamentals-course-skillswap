# Guion: Lección 5 - Métodos y parámetros

Buenas tardes, hoy vamos a aprender sobre los métodos y los parámetros, que son herramientas increíbles para no tener que escribir lo mismo una y otra vez. 

Imagina que estás creando un videojuego. Necesitas darle la bienvenida a cada jugador que se conecta. Si tienes diez jugadores y usas un `System.out.println` normal, tendrías que escribir o copiar la misma línea diez veces. ¡Eso haría que tu código sea gigante y muy aburrido de leer! Para solucionar esto, los programadores usamos los métodos.

Si miran la pantalla *(señalando el bloque del método)*, verán que fuera de nuestro bloque principal `main`, hemos creado un bloque nuevo llamado `public static void saludar`. Un método es, básicamente, enseñarle un truco nuevo a tu computadora. Le pones un nombre, en este caso `saludar`, y le dices qué hacer. Esa palabra `void` simplemente significa que este método ejecuta una acción directa y termina.

Ahora, fíjense en los paréntesis. Adentro dice `String nombre`. A esto lo llamamos "parámetro". Un parámetro es como un buzón o una caja vacía que el método necesita que llenes para poder funcionar. Le estamos diciendo a Java: 'Ejecuta el truco de saludar, pero usa este texto que te estoy enviando'. Dentro de las llaves del método, usamos ese parámetro. Imprimimos el saludo, le sumamos el nombre que llegó al buzón, y listo.

Vamos a la parte de arriba, a nuestro `main`, para ver cómo se usa *(señalando el main)*. Simplemente llamamos a la acción escribiendo `saludar` y, entre paréntesis, le enviamos el nombre. Aquí saludamos a 'Jugador 1', luego a 'Ana', y luego a 'Max'. 

¿Saben qué es lo mejor de esto? Si mañana quieres cambiar el mensaje a 'Bienvenido al nivel 2', solo tienes que cambiarlo una vez dentro del método, y automáticamente cambiará para todos. No tienes que editar a cada jugador.

¡Vamos a darle al botón de Run para probarlo! *(Haciendo clic y esperando que cargue la consola)*. Como pueden ver abajo, la computadora saludó a las tres personas de forma totalmente personalizada usando una sola línea base.

Antes de irnos, veamos un error súper común. ¿Qué pasa si yo escribo `saludar();` en el código pero dejo los paréntesis vacíos? Si hacemos eso, el programa se pone en rojo y lanza un error. Esto ocurre porque Java te dice: '¡Oye! Me prometiste que me enviarías un nombre para el buzón y lo dejaste vacío'. Así que recuerden siempre llenar los parámetros. ¡Nos vemos en la siguiente lección!
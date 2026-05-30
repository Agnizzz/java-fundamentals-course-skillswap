# Guion: Lección 8 - Encapsulación e Instanciación (Integrante 4)

**[0:00 - 0:40] El Problema:** "¡Hola de nuevo! En el video anterior creamos a nuestra mascota. Pero hay un problema: ¿qué pasa si algún chistoso intenta borrarle el nombre a tu perro directamente en el código? En la programación real, dejar tus datos expuestos es peligrosísimo."

**[0:40 - 1:20] La Solución (Private):** "Para eso existe la **Encapsulación**. Es como meter tus datos en una caja fuerte. Le ponemos la palabra `private` a nuestro nombre. Ahora, nadie desde afuera puede tocarlo directamente."

**[1:20 - 2:00] Getters y Setters:** "Entonces, ¿cómo lo leemos o lo cambiamos? Usamos dos ventanillas seguras. El **Getter** solo sirve para *obtener* o leer el nombre. El **Setter** sirve para *modificarlo*, ¡pero la ventaja es que aquí le podemos poner reglas! Mira el `if`: si intentan dejar el nombre en blanco, el programa los detiene y lanza un error."

**[2:00 - 2:30] La Prueba:** *(Vas al `main` y le das 'Run')* "Ahora, cuando instanciamos o creamos a nuestra mascota, usamos `setNombre` para cambiarlo a Max de forma segura, y `getNombre` para imprimirlo. ¡Tus objetos ahora son a prueba de balas!"

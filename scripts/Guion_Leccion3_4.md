# Guion 3 y 4: Sentencias if-else, bucles (for, while)

Buenas tardes, en la clase de hoy vamos a ver lo que son los bucles y las estructuras de control. Bueno.

En primer lugar, vamos a poner una variable *int* llamada edad, por ejemplo. Vamos a empezar con lo que son los *if* y los *else*.

El *if* es un si se cumple esta condición, entonces se va a ejecutar la acción dentro de este bloque de código, que en este caso es decir que se tiene acceso al juego.

Y el *else*... esto se puede dejar fácilmente así... en solitario, pero si se le añade un *else*, podemos ver que... se ejecuta una condición si es que esto no se cumple. Por ejemplo, si esto fuese 10 años, entonces no podría entrar a jugar el jugador.

Y también se puede añadir otro tipo de condicionales en caso de que lo requiera el código que se programa. Se puede añadir más *if* y más *else*, se puede extender de forma masiva. Muchos códigos se realizan... muchas veces el código depende bastante de los *if* y de los *else*.

En segundo lugar, tenemos lo que son los bucles *for*, que constan de estas tres condiciones: un *int* inicial, un límite y una nueva... una última condición en el caso de que aumenta cada... cada ciclo.

Y... bueno, aquí se ve cómo va subiendo cada jugador. Esto, digamos, que sería para añadir jugadores de forma brusca, por así decirlo.

Luego existen dos bucles relacionados a *while*. Uno llamado directamente *while*, que es 'mientras se cumpla esta condición se va a repetir constantemente el bloque de código de su interior'.

Y el otro que es bastante parecido, que es que mientras... que es 'realizar este bloque de código mientras se cumpla esta condición'. Son parecidos pero dependen... y la diferencia es... bueno... la condición para usarlo es bastante específica. Generalmente puedes usar uno en lugar de otro y sería muy raras las situaciones en las que necesites específicamente uno, pero en caso de que se necesite, ahí está.

Ahora si corremos el código y lo subimos... aquí está. Veremos que 14 años... e... ¡oh!, bueno, ahí cometí un error de espacio... es mayor a 12, tiene acceso al juego. Se carga... cinco jugadores en este bucle de cinco con el límite cinco. Y, bueno, aquí "i" es "i + 1" porque no pueden haber cero jugadores, no puedes cargar cero jugadores. Se carga la energía... y se cargan las vidas... en bucles repetitivos.

En caso de que estas condiciones no se... cumplieran, se haría un bucle infinito. Bueno, este no fue el mejor ejemplo, pero digamos que... ahí está. Como no tiene un límite que se puede cumplir, el sistema lo sigue haciendo... y eso puede consumir recursos.

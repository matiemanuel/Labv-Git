# Labv-Git

### Respuestas:
##### - Se necesitan mas hilos de consumidores que de productores para que el stock llegue a 0. En el codigo tenemos 1 productor (Matias) y 2 consumidores (Cintia y Nicolas)
##### - Deben ser synchronized para tratar los problemas de concurrencia, es decir, tratar de forma eficiente el proceso multihilo, evitando que mas de uno pase por un area crítica de la ejecución al mismo tiempo que otro y que los datos que se modifiquen u obtengan de esta sección sean validos.
##### - El recurso compartido en este caso es el stock de la beerhouse. Un recurso al cual ambos hilos van a modificar, por lo que necesitamos que lo hagan de a uno, asi ninguno maneja un dato incorrecto.
##### - Las 3 formas de instanciar un hilo son:
###### - Clase que extienda de Thread
###### - Clase que implemente Runnable y en su llamada, crear un hilo al cual le pasemos por parámetro un objeto de esta clase
###### - Clase anónima creada a partir de Runnable, que al crear un hilo lo pasemos por parámetro
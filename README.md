# INTRODUCCION

El siguiente trabajo práctico pertenece a la materia Programación Orientada a Objetos, de la Carrera Licenciatura en Sistemas Informáticos, dictado en la Universidad Nacional del Oeste. A continuación mostraremos la descripción de la problemática a resolver y la respuesta a la misma, no solo con su código en lenguaje java, también en diagrama de clases y test Junit.

## Problemática a resolver
###### Implementar la class PlayList tal que:

•	Se construye a partir de la cantidad máxima de Canciones que puede tener. Como máximo supondremos que una lista no supera las 10000 canciones, pero puede ser construida con una cantidad menor. 
•	Cada Canción está compuesta de su  título, álbum, artista y duración. Proveer todos los constructores de Canción que crea convenientes, pero se debe tener en cuenta que una canción por lo menos se debe crear a partir de su título y duración.
•	Se puede agregar canciones hasta el máximo admitido. 
•	Se puede consultar la duración de una canción pasándole el título. Si varias canciones tienen el mismo título, devuelve la duración de todas. Si la canción no existe, devuelve (-1). Las búsquedas no deben ser "case sensitive”. 
•	Se puede quitar una canción buscándola previamente por alguno de los datos que la compone.  

•	Se puede consultar la duración completa de la playlist. 
•	Se puede consultar la cantidad de canciones. 
•	Se puede consultar la canción de mayor duración y también la de menor duración.
•	Se puede mostrar la lista ordenada por título de la canción.
•	Se puede mostrar la lista ordenada por artista y dentro de las canciones que pertenecen a un artista, ordenadas por título.
•	Simular la reproducción de la playlist eligiendo alguno de los criterios anteriores y además en orden aleatorio. 
•	Implementar todas las pruebas unitarias (JUnit) que se consideren necesarias para demostrar el correcto funcionamiento de todas las capacidades de la playlist. 


## Observaciones e Interpretación (DISEÑO).
En el punto de cómo esta compuesta cada canción observamos los atributos que pide y la aclaración de que un objeto puede ser construido a partir del ingreso del nombre y la duración, si bien el ejercicio responde a este pedido creemos que vale mencionar que un buen ingreso de datos que sea correlativo con los demás punto tendría que permitir la creación de  objeto cuando todos sus atributos esten ingresados. El hecho de generar una canción si su artista puede generar un bug en la ejecucion cuando decida ordenarlo por dicho atributo, y contiene una inconsistencia conceptual en los requisitos del diseño; para que vamos a ordenar por un atributo que no esta.  Priorizamos el pedido textual del punto, pero sin dejar de mencionar esta observacion de inconsistencia.

Quitar canción debería ser más específico ya que un mismo nombre puede darse a una canción, álbum o autor. El permitir borrar en cualquier vector indiscriminadamente teniendo en cuenta el nombre a borrar, puede traer el problema de querer eliminar una canción y terminar borrando un álbum entero. En cuanto a la eliminación por duración creemos que debe plantearse como una liberación de espacio de almacenamiento, no como una búsqueda puntual de una canción ya que las canciones difícilmente se identifican por su duración.

Las pruebas de Junit pudieron hacerse correctamente salvo la de la elección de la canción aleatoria, esto se debió a una cuestión de imposibilidad de saber de ante mano la canción elegida de forma aleatoria por eso mismo no se puede cargar la variable  “esperado” con un valor Coherente, por consecuente no se puede realizar el assertEquals

###### Estas Observaciones creemos que son los puntos a mejorar en una futura versión tp1.2 

## Herramientas Software.
Lenguaje de Programación, Java. Editor / Compilador, Eclipse. Documentación, Github.

## Itegrantes. 
Artese Ariel. Barrozo Ariel. Lopez Joaquin. Julian Medina.

## Diagrama de Clases.
Esta en el Directorio de github.
## Conclusión
Un trabajo práctico muy útil para poder aprender la carga de vectores con objetos, y las distintas acciones que se pueden realizar cuando se lo recorre con un objetivo particular ejemplo ordenándolo, buscando datos, eliminar y demás. También queremos remarcar la importancia de la utilización del Junit para realizar los Test y la manera de como el grupo termino de pulir el código a través del Test. Creemos que el ejercicio favorece mucho en cuanto a fortalecer los conceptos teóricos mediante la práctica codificada en un lenguaje en el cual a la mayoría no resultaba ajeno. Creemos que complementa bien el difícil proceso de maduración que afrontamos cuando pasamos de una lógica estructurada a una logia de objetos, este ejercicio creemos que no ayudo mucho para empezar a transitar este dificultoso pero gustoso cambio.

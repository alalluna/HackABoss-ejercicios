Escenario N 1: Sistema de control de versiones

Estás diseñando un sistema de control de versiones para un equipo de desarrollo de software. El sistema debe gestionar la colaboración en el código fuente, rastrear cambios, y permitir la fusión de ramas. Además, debe notificar a los desarrolladores cuando hay conflictos y facilitar la revisión de código.
¿Qué patrón/es de diseño elegirías? ¿Por qué?

Singleton, Factory o abstractFactory . Observer y Facade

- En los patrones de creación sería singleton para tener una instancia global que controle todo el sistema, así se evita errores y la duplicidad de instancias Y  esto debería acompañarse de otro patrón para fabricar muchos objetos que podría ser factory o abstract factory. La diferencia es que factory se basa en una interfaz que sirve de modelo para ir añadiendo nuevos objetos de forma fácil, y también podría ser abstract factory, quizas sería mejor, porque en el caso de un equipo de software se podría decir que van a trabajar con distintas familias de objetos(la colaboración en el código fuente, rastrear cambios, y permitir la fusión de ramas). 

- Se realizaría con el patron de comportamiento Observer, porque así el equipo puede recibir notificaciones de los cambios importantes en el programa en el que trabajen y en sistema que utilizan. Sin que eso cambie el sistema.

- En el caso de la estructura sería Facade. Facade porque permite que tengan una interfaz unificada de la cual pueden ir obteniendo pequeñas partes, para su proposito. Sería como una gran biblioteca de la que puedan sacr el libro que necesitan.




Escenario Nº 2: Sistema de construcción de casas

Estás trabajando en un sistema para una empresa constructora que construye casas personalizadas. Cada cliente puede elegir entre diferentes diseños, materiales de construcción y opciones de personalización. El sistema debe ser capaz de manejar la construcción de múltiples casas simultáneamente, con diferentes equipos de construcción trabajando en diferentes proyectos.
¿Qué patrón/es de diseño elegirías? ¿Por qué?

Builder, composite y mediator.


Justificación: 

- Como bien dice su nombre es para construir, y nunca mejor dicho. Builder permitiria realizar los diferentes diseño de casas simultaneamente sin que se rompa el programa, separando el diseño de la creación, ya que sirve para ir construyendo objetos poco a poco. Ejemplo: diseño, materiales, maquinaria, personal... Supongo que tambien se podría combinar singleton y builder, de este modo habria una mayor seguridad porque se evitarian errores criticos en el sistema.

- En el caso de la estructura, como necesitaremos ir de lo individual a lo colectivo haría falta composite ya que permite a los clientes tratar tanto a objetos individuales como diseño, materiales... a composiciones de objetos de manera uniforme como la casa 1. Ayudaría a estructurar el sistema de forma jeraquica

- En el caso del comportamiento  podria ser mediator para que no se mezclen los objetos y sus dependencias. Este patrón restringe las comunicaciones directas entre los objetos. Como por ejemplo equipos de construcción, recursos y clientes se comunicarian a través de un mediador y esto mejoraría la escalabilidad y el mantenimiento del sistema.



Escenario Nº 3: Sistema de gestión de tareas en un Proyecto de desarrollo de software

Estás diseñando un sistema de gestión de tareas para un equipo de desarrollo de software. Cada tarea puede tener diferentes estados (por ejemplo, pendiente, en progreso, completada) y asignaciones a miembros del equipo. Además, algunas tareas pueden depender de otras, y el sistema debe permitir la asignación de prioridades.
¿Qué patrón/es de diseño elegirías? ¿Por qué?

Builder, Observer y Command


Justificación:

- Como patron de creación tendría builder porque permitiría construir multitud de objetos como tareas.

- Se realizaría con el patron de comportamiento Observer porque se podría notificar los cambios en el estado de las tareas y en las dependencias. Se podría complementar con el patrón Command para implementar operaciones como asignar, cambiar estado o reasignar tareas pudiendo desahacerlas o repetirlas.

- Como patrón estructural sería command para implementar operaciones como asignar, cambiar estado o reasignar tareas, encapsulándolas en comandos que pueden deshacerse o repetirse.
Esto añade soporte para funcionalidad como "deshacer" o "repetir".

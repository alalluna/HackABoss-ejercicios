package dia5OrganizadorDeTareas;

import dia5OrganizadorDeTareas.entities.Tarea;

    public class Main {
        public static void main(String[] args) {
            // Tareas principales
            Tarea proyecto = new Tarea("Proyecto: Desarrollo de Software");
            Tarea diseno = new Tarea("Tarea Principal: Diseño de la Aplicación");
            Tarea implementacion = new Tarea("Tarea Principal: Implementación del Código");
            Tarea pruebas = new Tarea("Tarea Principal: Pruebas y Depuración");

            // Para construir la jerarquía de tareas
            proyecto.introducirSubtarea(diseno);
            proyecto.introducirSubtarea(implementacion);
            proyecto.introducirSubtarea(pruebas);

            // Subtareas Diseño
            Tarea prototipo = new Tarea("Subtarea: Crear Prototipo");
            Tarea interfaz = new Tarea("Subtarea: Diseñar Interfaz");
            Tarea requisitos = new Tarea("Subtarea: Documentar Requisitos");

            diseno.introducirSubtarea(prototipo);
            diseno.introducirSubtarea(interfaz);
            diseno.introducirSubtarea(requisitos);

            // Subtareas de Interfaz
            Tarea colores = new Tarea("Sub-subtarea: Definir Esquema de Colores");
            Tarea responsivo = new Tarea("Sub-subtarea: Diseñar Diseño Responsivo");

            interfaz.introducirSubtarea(colores);
            interfaz.introducirSubtarea(responsivo);

            // Subtareas para Implementación
            Tarea backend = new Tarea("Subtarea: Desarrollar Backend");
            Tarea frontend = new Tarea("Subtarea: Desarrollar Frontend");

            implementacion.introducirSubtarea(backend);
            implementacion.introducirSubtarea(frontend);

            // Subtareas de Backend
            Tarea baseDatos = new Tarea("Sub-subtarea: Configurar Base de Datos");
            Tarea logicaNegocios = new Tarea("Sub-subtarea: Crear Lógica de Negocios");

            backend.introducirSubtarea(baseDatos);
            backend.introducirSubtarea(logicaNegocios);

            // Subtareas de Frontend
            Tarea interfazUsuario = new Tarea("Sub-subtarea: Codificar Interfaz de Usuario");
            Tarea integrarBackend = new Tarea("Sub-subtarea: Integrar con Backend");

            frontend.introducirSubtarea(interfazUsuario);
            frontend.introducirSubtarea(integrarBackend);

            // Subtareas para Pruebas
            Tarea pruebasIntegracion = new Tarea("Subtarea: Ejecutar Pruebas de Integración");
            Tarea errores = new Tarea("Subtarea: Solucionar Errores");

            pruebas.introducirSubtarea(pruebasIntegracion);
            pruebas.introducirSubtarea(errores);

            // Imprimir las tareas
            proyecto.imprimirTareas(0);
        }
    }

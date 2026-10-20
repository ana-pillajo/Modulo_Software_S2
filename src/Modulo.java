public class Modulo {

    // Atributos públicos, caracteristicas de la clase
    public String nombre;
    public String lenguaje;

    // Atributos con acceso por defecto
    String version;
    boolean terminado;

    //  Métodos públicos = acciones
    public void mostrarInformacion() {
        System.out.println(" Información del Módulo");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado?: " + terminado);
    }
    //acion de marcar si finalizo o no
    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido marcado como terminado.");
    }

    //  Métodos con acceso por defecto
    void mostrarEstado() {
        System.out.println("Estado de " + nombre + " -> ¿Terminado?: " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}
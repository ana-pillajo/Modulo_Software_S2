public class MainModulo {
        public static void main(String[] args) {

            // Creamos el primer objeto:
            Modulo login = new Modulo();
            login.nombre = "Login";
            login.lenguaje = "Java";
            login.version = "1.0";
            login.terminado = true;

            // Creamos el segundo objeto: Inventario
            Modulo inventario = new Modulo();
            inventario.nombre = "Inventario";
            inventario.lenguaje = "Python";
            inventario.version = "1.2";
            inventario.terminado = false;

            // Creamos el tercer objeto: Reportes
            Modulo reportes = new Modulo();
            reportes.nombre = "Reportes";
            reportes.lenguaje = "JavaScript";
            reportes.version = "0.9";
            reportes.terminado = false;

            // Mostramos la información
            login.mostrarInformacion();
            inventario.mostrarInformacion();
            reportes.mostrarInformacion();

            System.out.println("\n Probando métodos");
            login.mostrarVersion();
            inventario.marcarTerminado();
            reportes.mostrarEstado();
        }
    }


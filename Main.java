public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "juan";
        cliente.edad = 31;
        cliente.telefono = 452145996;
        cliente.credito = "Select";

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Pedro";
        trabajador.edad = 40;
        trabajador.telefono = 4431351;
        trabajador.salario = "$15000";

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}


class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona {
    String salario;
}

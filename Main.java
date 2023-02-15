public class Main {
    
    public static void main(String[] args) {
        Persona nombre = new Persona();
        nombre.setNombre("Juan");  

        Persona edad = new Persona();
        edad.setEdad(30);   

        Persona telefono = new Persona();
        telefono.setTelefono("3804965874");

        System.out.println(nombre.getNombre());
        System.out.println(edad.getEdad());
        System.out.println(telefono.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return  this.edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}

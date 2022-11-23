public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(28);
        persona.setNombre("Pepis");
        persona.setTelefono(566769809);

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}

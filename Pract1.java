public class Pract1 {
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        int edad = 20;
        double altura = 1.75;

        System.out.println(cadena);
        System.out.println("La edad es " + edad);
        System.out.println("La altura es " + altura + " metros");
        System.out.println("Creando tipo de datos abstracto");

        Datos persona = new Datos("Juan", 25, "juanito@gmail.com");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo: " + persona.getCorreo());

        Datos persona2 = new Datos();
        persona2.setNombre("Maria Lopez");
        persona2.setEdad(30);
        persona2.setCorreo("maria@gmail.com");

        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Correo: " + persona2.getCorreo());
    }
}

package Practica5;

public class Practica5 {
    public static void saludo (String mensaje, int numero) {
        if (numero <= 10  ) {
            System.out.println(numero +" "+ mensaje);
            saludo (mensaje, numero + 1);
        } else {
            System.out.println("Fin de la recurisividad");
        }
    }
    
    public static void main(String[] args) {
        saludo("Hola", 1);
    }
}

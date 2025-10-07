package Practica51;

public class Practica51 {
    public static void guionn (int numero, String guion){
        if (numero <= 10) {
            System.out.println(numero  + " " + guion);
            guionn (numero + 1, guion + "-");   
        } else {
            System.out.println("Fin de la recurisividad");
        }
    }
    public static void main(String[] args) {
        guionn (1, "-");
    }
}

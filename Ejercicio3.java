/*Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
 */

public class Ejercicio3 {
    public static void main (String[] args){
    // Para poner dos columnas se añade System.out.printf("%-10s %s\n")
    System.out.printf("%-10s %s\n", "laptop", "portátil");
    System.out.printf("%-10s %s\n", "ball", "pelota");
    System.out.printf("%-10s %s\n", "daemon", "demonio");
    System.out.printf("%-10s %s\n", "mouse", "ratón");
    System.out.printf("%-10s %s\n", "keyboard", "teclado" );
    System.out.printf("%-10s %s\n", "water", "agua" );
    System.out.printf("%-10s %s\n", "fire", "fuego" );
    System.out.printf("%-10s %s\n", "whiteboard", "pizarra blanca" );
    System.out.printf("%-10s %s\n", "hoodie", "sudadera" );
    System.out.printf("%-10s %s\n", "neightbor", "vecino" );

    }
}

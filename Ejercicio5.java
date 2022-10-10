// Ejercicio 5) Escribe un programa que muestre tu horario de clase.
public class Ejercicio5 {
    public static void main(String[] args){
    String blue = "\033[34m";
    String  orange = "\033[33m";
    String purple = "\033[35m";
    String red = "033[31m";

    System.out.println("               ┌──────────┬───────────────────────────────────────────────┐");
    System.out.println("               │   LUNES  │  MARTES  │  MIÉRCOLES  │  JUEVES  │  VIERNES  │");
    System.out.println("┌──────────────┼──────────┼──────────┼─────────────┼──────────┼───────────┤");
    System.out.println(red+"├ 8.15-9.15    ┼          ┼          ┼             ┼          ┼           ┤");
    System.out.println("├──────────────┼ Program  ┼ Sistemas ┼  Entor.Desa ┼  Program ┼   F.O.L   ┤");
    System.out.println(purple+"├ 9.15-10.15   ┼          ┼          ┼             ┼          ┼           ┤");
    System.out.println("├──────────────┼──────────┼ Sistemas ┼─────────────┼──────────┼   F.O.L   ┤");
    System.out.println(orange+"├ 10.15-11.15  ┼ Lenguaje ┼          ┼   Program   ┼  Program ┼           ┤");
    System.out.println("├──────────────┼──────────┼──────────┼─────────────┼──────────┼───────────┤");
    System.out.println(blue+"├         RECREO     RECREO      RECREO   RECREO     RECREO               ┤");
    System.out.println("├──────────────┼──────────┼──────────┼─────────────┼──────────┼───────────┤");
    }
}
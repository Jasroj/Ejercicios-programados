import java.util.Scanner;

public class Cuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca un número: ");
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Los numeros negativos no se encuentran contemplados dentro del parametro del programa. Chais.");
                break;
            }
            System.out.println("El numero " +number+ " al cuadrado es: " + (number * number));
        }
    }
}
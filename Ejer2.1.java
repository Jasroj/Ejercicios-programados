import java.util.Scanner;

public class PosiNega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese un número: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("El numero " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("El numero " + num + " es negativo");
        } else {
            System.out.println("El numero " + num + " no es ni positivo ni negativo");
        }
    }
}
import java.util.Scanner;
public class EjercicioCuatro  {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input_numeros
    
        System.out.print("Ingrese el primer numero : ");
       int num1 = scanner.nextInt();
        while (num1 <= 0) {
            System.out.print("Ingrese un primer numero positivo: ");
         num1 = scanner.nextInt();
        }
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        while (num2 <= 0) {
            System.out.print("Ingrese un primer numero positivo: ");
         num2 = scanner.nextInt();
        }


        //declarativas
        int suma = sumar(num1, num2);
        int resta = restar(num1, num2);
        int multiplicacion = multiplicar(num1, num2);
        int division = dividir(num1, num2);
        //resultados_al_usuario
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        scanner.close();
    }
//f(suma)
    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
//f(resta)
    public static int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
//f(multiplicacion)
    public static int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
//f(division)
    public static int dividir(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }
}

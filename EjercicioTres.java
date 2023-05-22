import java.util.Scanner;

public class EjercicioTres  {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double r = sn.nextDouble();
        
        // Declarativa perímetro
        double perimeter = peri.calculatePerimeter(r);
        System.out.println("El perímetro del círculo es: " + perimeter);
        
        // Declarativa Area
        double area = A.calculateArea(r);
        System.out.println("El área del círculo es: " + area);
    }
}
//Imperativa perimetro de circulo
public class peri {
    public static double calculatePerimeter(double radius) {
        double perimeter = 2 * 3.1415 * radius;
        return perimeter;
    }
}
//Imperativa area de circulo
public class A {
    public static double calculateArea(double radius) {
        double area = 3.1415 * radius * radius;
        return area;
    }
} 
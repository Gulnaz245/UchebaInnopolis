import java.util.Scanner;


public class Zad4 {
    //Даны три вещественных числа a,b,c.
    // Проверить:
    // 1.выполняется ли неравенство a<b<c;
    // 2.выполняется ли неравенство b>a>c.
public static void main(String[] args) {
        System.out.println("Введите три числа:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        System.out.println("c");
        double c = sc.nextDouble();
        sc.close();

        if ((a<b) & (b<c)) {
            System.out.println("Выполняется неравенство a<b<c");
        }
        else {
            System.out.println("Hеравенство a<b<c не выполняется");
        }
        if ((a<b) & (a>c)) {
            System.out.println("Выполняется неравенство b>a>c");
        }
        else {
            System.out.println("Hеравенство b>a>c не выполняется");
        }
    }
}

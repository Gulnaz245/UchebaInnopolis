import java.util.Scanner;

public class Zad5 {
    //Даны два числа.Если квадратный корень из второго числа меньше первого числа,то увеличить второе число в пять раз.
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число А");
        double a = sc.nextDouble();
        System.out.println("Второе число В");
        double b = sc.nextDouble();
        sc.close();
        //double sqrt2chisla=Math.sqrt(b)
                if (Math.sqrt(b)<a) {
                    System.out.println("Условие выполняется.\nВ*5=" +b*5);
                }
                else {
                    System.out.println("Квадратный корень из второго числа больше первого числа.");
                }
    }
}


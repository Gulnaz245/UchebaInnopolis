import java.util.Scanner;

public class Zad3 {
    //Дано двузначное число.
    // Определить:
    // -остаток от деления десятков на единицы,
    // -результат деления единиц на десятки.
    public static void main(String[] args) {
        System.out.println("Введите двузначное число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        double edinicu = number % 10;
        double desatki = (number / 10) % 10;
        //System.out.println("Единицы=" + edinicu);
       // System.out.println("Десятки=" + desatki);
        double number1= desatki % edinicu;
        double number2= edinicu / desatki;

        System.out.println("Остаток деления десятков на единицы=" +number1);
        System.out.println("Результат деления единиц на десятки=" +number2);

    }
}




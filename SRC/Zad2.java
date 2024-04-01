import java.util.Scanner;

public class Zad2 {
    //Даны радиус круга и сторона квадрата.У какой фигуры площадь больше?
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите радиус круга");
        short r=sc.nextShort();
        System.out.println("Введите сторону квадрата");
        short storona= sc.nextShort();
    double SKruga=Math.PI*Math.pow(r,2);
       // System.out.println("Площадь круга ="+SKruga);
    double SKvadrat=Math.pow(storona,2);
       // System.out.println("Площадь квадрата="+SKvadrat);
        if (SKruga>SKvadrat) {
            System.out.println("Площадь круга больше площади квадрата");
        }
        else if (SKruga<SKvadrat) {
            System.out.println("Площадь квадрата больше площади круга");
        }
        else
        {
            System.out.println("Площади квадрата и круга равны");
        }
}}

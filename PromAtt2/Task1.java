import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        System.out.println("Число 1=");
        int a = sc.nextInt();
        System.out.println("Число 2=");
        int b = sc.nextInt();
        int Sum=a+b;
        System.out.println("Сумма="+Sum);
        int Max;
        int Min;
        int Dif;
        Max=max(a,b);
       // System.out.println("Максимум="+ Max);
        Min=min(a,b);
        //System.out.println("Минимум="+ Min);
        Dif=Max-Min;
        System.out.println("Разница между числами="+Dif);
        for (int i=Min; i< (Max+1); i++){
           System.out.print(i+" ");
        }
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}



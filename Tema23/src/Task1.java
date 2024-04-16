import java.util.Scanner;

public class Task1 {
   // 1.Составить программу вывода любого числа любое заданное число раз.
    public static void main(String[] arqs){
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите число для вывода - ");
        int a=sc.nextInt();

        for (int i=0; i<5; i++){
            System.out.print(a+" ");
        }
    }

}

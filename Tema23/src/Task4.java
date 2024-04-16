import java.util.Scanner;

public class Task4 {
    //4.Вычислить сумму 1+1/2+1/3+...+1/n.
    public static void main(String[] arqs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число n=");
        int n=sc.nextInt();
        double Sum=0.0;
        for (double i=1; i<=n; i++){
            Sum +=1/n;
            if (i==n) {
                System.out.printf("1/"+i+"="+Sum);
            }
            else {
                System.out.printf("1/"+i+"+");
            }
            }
    }

}



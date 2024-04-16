import java.util.Scanner;

public class Task4 {
    //4.Вычислить сумму 1+1/2+1/3+...+1/n.
    public static void main(String[] arqs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число n=");
        int n=sc.nextInt();
        double Sum=0;
        for (int i=1; i<=n; i++){
            if (i==n) {
                Sum +=Drobi(n);
                System.out.printf("1/"+i+"="+Sum);
            }
            else {
                Sum +=Drobi(i);
                System.out.printf("1/"+i+"+");
            }
        }
    }
    public static double Drobi (int a){
        return (double) 1 /a;
    }
}


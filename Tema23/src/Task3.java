public class Task3 {
    // 3. Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1,2,...,10 фунтов (1фунт=453г).
    public static void main( String[] abqs){
    for (int i=1; i<11; i++){
        double k;
        k=i;
        double a=k*453/1000;
        System.out.println(i+" фунт = "+a+" кг");
    }
    }
}
public class Task1  {
    //1.Заполнить массив из двенадцати элементов 1,2,...12.

    public static void main(String[] args) {
        int[] elem = new int[12];
        int a=1;

        for (int i = 0; i < elem.length; i++) {
            elem[i]=a;
            System.out.print(elem[i] + " ");
            a++;
        }
    }
}
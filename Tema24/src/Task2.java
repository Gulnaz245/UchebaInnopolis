public class Task2 {
    //Вывести элементы массива на экран в обратном порядке.
    public static void main(String[] args) {
        int[] elem = new int[12];
        int a=12;
        for (int i = 0; i < elem.length; i++) {
            elem[i]=a;
            System.out.print(elem[i] + " ");
            a--;
        }
    }
}

import java.util.Random;
public class Task5 {
    //Дан массив.Определить
    // 1. Количество максимальных элементов в массиве
    //2. Количество минимальных элементов в массиве
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(19, 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 10);
            System.out.print(array[i] + " ");
        }
        int max = 0;
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }}
        int Nmax=0;
        int Nmin=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                Nmax = Nmax + 1;
            }
            if (array[i] == min) {
                Nmin = Nmin + 1;
            }
        }
        System.out.println("\nМаксимум=" + max);
        System.out.println("Количество максимальных элементов=" + Nmax);
        System.out.println("Минимум=" + min);
        System.out.println("Количество минимальных элементов=" + Nmin);
    }
}

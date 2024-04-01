import java.util.Random;

public class Task6 {
//Составить программу.
//1. Нахождение минимального значения среди элементов  любой строки двухмерного массива;
//2. Нахождение максимального значения среди элементов  любого столбца двухмерного массива
public static void main(String[] args) {
    Random r = new Random();
    int[][] array = new int[r.nextInt(5, 6)][r.nextInt(5, 6)];
    int Max1 = 0;
    int Min1 = 9;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            array[i][j] = r.nextInt(10);
            System.out.print(array[i][j] + " ");
            Min1 = min(Min1, array[0][j]);
        }
        Max1 = max(Max1, array[i][0]);
        System.out.println();
    }
    System.out.println("Минимальный элемент в строке=" + Min1);
    System.out.println("Максимальный элемент в столбце=" + Max1);
}
public static int max(int max, int a) {
    return Math.max(a, max);
}
public static int min(int min, int b) {
    return Math.min(b, min);
}
}








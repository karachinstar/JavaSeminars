/**
 * Заполнить список десятью случайными числами. Отсортировать список 
 * методом sort() 
 * и вывести его на экран.
 */
import java.util.ArrayList;
import java.util.Random;
public class razbor {

    public static void main(String[] args) {
        final int n = 10;
        Random item = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(item.nextInt(0,8));
        }
        System.out.println(arr);
        arr.sort(null);
        System.out.println(arr);
    }
}
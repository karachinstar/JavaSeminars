/**
 * Дан массив nums = [3,2,2,3] и число val = 3
 * Если в массиве есть числа, равные заданному, нужно перенести эти
 * элементы в конец массива
 * 
 */
import java.util.Random;
public class raztask2 {

    public static void main(String[] args) {
        Random item = new Random();
        int[] arr = new int[item.nextInt(10, 15)];
        System.out.print("изначальный arr = [");
        for (int i = 0; i < arr.length; i++){
            arr[i] = item.nextInt(2, 5);
            System.out.printf("%d \s", arr[i]);
        }
        System.out.print("]");
        int val = 3;
        int count = 0;
        //int arrVal = arr.length;
        for (int i = 0; i < arr.length - count; i++){
            if (arr[i] == val){
                for (int j = i; j < arr.length - 1 - count; j++){                   
                    arr[j] = arr[j + 1];
                }
                count++;
                arr[arr.length - count] = val;
                if(arr[i] == val){
                    i--;
                }
            }
        }
        System.out.print("\nотсортированный arr = [");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d \s", arr[i]);
        }
        System.out.print("]");

    }
}

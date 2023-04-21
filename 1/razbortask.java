import java.util.Random;

/**
 * Дна массив двоичных чисел, например [1,1,0,1,1,1]
 * вывести максимальное количество подряд идущих 1
 */
public class razbortask {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random item = new Random();
        System.out.print("arr = [");
        for (int i = 0; i < arr.length; i++){
            arr[i] = item.nextInt(0, 2);
            System.out.printf("%d \s", arr[i]);
        }
        System.out.print("]");
        int curr_count = 0;
        int max_count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                curr_count ++;
            }
            else {
                if (max_count <= curr_count){
                    max_count = curr_count;
                }
                curr_count = 0;
            }
        }
        if (max_count <= curr_count){
            max_count = curr_count;
        }
        System.out.printf("\nмаксимальное число единичек в массиве - %d",max_count);
    }

}
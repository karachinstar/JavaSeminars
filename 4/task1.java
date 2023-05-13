import java.util.ArrayList;
import java.util.LinkedList;

//import javax.swing.event.SwingPropertyChangeSupport;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        ArrayList <Integer> arr = new ArrayList<>();
        Integer arrSize = 100000;
        for (int i = 0; i < arrSize; i++){
            //arr.add(i);
            arr.add(0, i);
        }
        long endTime1 = System.currentTimeMillis() - startTime1;
        long startTime2 = System.currentTimeMillis();
        LinkedList <Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < arrSize; i++){
            //arr2.add(i);
            arr2.add(0, i);
        }
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения через ArraList = " + endTime1);
        System.out.println("Время выполнения через LinkedList = " + endTime2);
    }
    
}
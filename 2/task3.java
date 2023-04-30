/**
 * напишите метод, который принимает на вход строку (String) и опреде-
 * ляет, является ли строка палиндромом (возвращает boolean значение)
 */
import java.util.Scanner;
public class task3 {


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String a = iScanner.nextLine();
        iScanner.close();
        if(main1(a) == true){
            System.out.println("Строка является полиндромом");
        }
        else{
            System.out.println("Строка не является полиндромом");
        }
        
    }
    public static boolean main1(String word) {
        int i = 0;
        while (i < word.length() / 2){
            if(word.charAt(i) != word.charAt(word.length() - 1- i)){
                return false;
            }
            i++;  
        }
        return true;       
    }
}
/**
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, 
 * который вернет строку длины N,которая состоит из чередующихся 
 * символов c1 и c2, начиная с c1.
6
a b
ababab
 */
import java.util.Scanner;
public class rask1 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        String c1= "a", c2 = "b";
        StringBuilder resault = new StringBuilder("");
        for (int i = 1; i <= n; i ++){
            if (i % 2 != 0)
            resault.append(c1);
            else resault.append(c2);
        }
        System.out.println(resault);
    }
}
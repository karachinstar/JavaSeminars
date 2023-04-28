/**
 * написать метод который сжимает строку
 * вход aaaaaabbbbcddaaa
 * a6b4cd2a3
 */
public class task2 {

    public static void main(String[] args) {
        StringBuilder start = new StringBuilder("aaaaaabbbbcddaaaccc");
        StringBuilder resault = new StringBuilder(" ");
        Integer counter = 1;
        int j = 1;
        int l = 1;
        // char letter =
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != resault.charAt(resault.length() - l)) {
                while (start.charAt(i) == start.charAt(i + j) && i+j < start.length() - 1) {
                    counter++;
                    j++;
                }
                i = i + counter - 1;
                if (counter > 1) {
                    resault.append(start.charAt(i) + counter.toString());
                    l = 2;
                    counter = 1;
                    j = 1;
                } else {
                    resault.append(start.charAt(i));
                    l = 1;
                    counter = 1;
                    j = 1;
                }
            }
            
        }
        System.out.println(resault.toString());
    }
}

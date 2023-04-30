/**
 * написать метод который сжимает строку
 * вход aaaaaabbbbcddaaa
 * a6b4cd2a3
 */
public class task2 {

    public static void main(String[] args) {
        StringBuilder start = new StringBuilder("aaabbdsdfsdfxcvxcvvxvxccca");
        StringBuilder resault = new StringBuilder("");
        Integer counter = 1;
        for (int i = 0; i < start.length(); i = i + counter) {
            resault.append(start.charAt(i));
            counter = 1;
            while (i + counter < start.length() && start.charAt(i) == start.charAt(i + counter)) {
                counter++;
            }
            if (counter > 1) {
                resault.append(counter.toString());
            }
        }
        System.out.println(resault.toString());
    }

}

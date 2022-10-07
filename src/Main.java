import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to jumble: ");
        String word =sc.nextLine();

        Long numberOfTimes = 1L;
        jumbledString( word,numberOfTimes);

    }
        public static String jumbledString(String s, Long n) {
            StringBuilder sbEven = new StringBuilder();
            StringBuilder sbOdd = new StringBuilder();
            char[] word = s.toCharArray();
            if (n > 0) {
                for (int x = 0; x < n; x++) {
                    word = newJumble(word, sbEven, sbOdd);
                }
            }
            System.out.println(word);
            return word.toString();
        }
        private static char[] newJumble(char[] s, StringBuilder sbEven, StringBuilder sbOdd) {
            sbEven.setLength(0);
            sbOdd.setLength(0);
            StringBuilder result;
            for (int i = 0; i < s.length; i++) {
                if (i % 2 == 0) {
                    sbEven.append(s[i]);
                } else {
                    sbOdd.append(s[i]);
                }
            }
            result = sbEven.append(sbOdd);
            return result.toString().toCharArray();
        }
    }

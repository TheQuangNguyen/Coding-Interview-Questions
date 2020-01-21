import static CrackingTheCodingInterview.ArraysAndStrings.URLify.*;

public class Test {

    public static void main(String[] args) {
        char[] test = new char[]{'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        char[] result = urlify(test, 13);

        System.out.println(result);
    }
}

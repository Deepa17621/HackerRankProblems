import java.io.*;
import java.util.*;

public class String_LexicographyComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Word: ");
        String A = sc.next();
        System.out.println();
        System.out.print("Enter second Word: ");
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(process(A, B));
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));

    }

    public static String process(String a, String b) {
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (a.charAt(i) == b.charAt(j)) {
                continue;
            } else if (a.charAt(i) > b.charAt(j)) {
                return "Yes";
            } else return "No";
        }
        return "No";

    }

}


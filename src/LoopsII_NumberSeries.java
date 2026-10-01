import java.util.*;
import java.io.*;

class LoopsII_NumberSeries {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Queries Count: ");
        int q = in.nextInt();
        System.out.println();
        LinkedHashMap<Integer, int[]> queries = new LinkedHashMap<>();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter a for query-" + i + ": ");
            int a = in.nextInt();
            System.out.println();
            System.out.print("Enter b for query-" + i + ": ");
            int b = in.nextInt();
            System.out.println();
            System.out.print("Enter n for query-" + i + ": ");
            int n = in.nextInt();
            System.out.println();
            if ((q >= 0 && q <= 500) && (a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n > 0 && n <= 15)) {
                queries.put(i, new int[]{a, b, n});
            } else {
                System.out.print("enter a valid count of queries, a, b and n to process the result");
            }
        }
        buildSeries(queries, q);

        in.close();
    }

    public static void buildSeries(LinkedHashMap<Integer, int[]> m, int query) {
        if (m.size() == query) {
            for (int i = 0; i < query; i++) {
                calculateAndPrintSeries(m.get(i)[0], m.get(i)[1], m.get(i)[2]);
                System.out.println();
            }
        }
    }

    public static void calculateAndPrintSeries(int a, int b, int n) {
        int[] p = new int[n];
        p[0] = 1;
        int[] series = new int[n];
        System.out.print(a + b + " ");
        series[0] = a + b;
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] * 2;
            series[i] = series[i - 1] + (p[i] * b);
            System.out.print(series[i] + " ");
        }
    }
}


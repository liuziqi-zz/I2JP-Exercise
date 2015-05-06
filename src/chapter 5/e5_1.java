/**
 * Created by liu on 2015/5/6 0006.
 */
public class e5_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int pengtagonalNumber = getPengtagonalNumber(i);
            if (i % 10 == 0) {
                System.out.printf("%5d\t", pengtagonalNumber);
                System.out.println();
            } else System.out.printf("%5d\t", pengtagonalNumber);
        }
    }

    public static int getPengtagonalNumber(int n) {
        int number = n * (3 * n - 1) / 2;
        return number;
    }
}

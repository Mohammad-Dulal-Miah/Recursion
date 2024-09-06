/* 
 * print n sum natural number sum
 */

public class Problem_03 {

    public static int naturalNumberSum(int n) {
        if (n == 1)
            return 1;

        return n + naturalNumberSum(n - 1);
    }

    public static void main(String[] args) {

        int res = naturalNumberSum(5);
        System.out.print("Sum: " + res);
    }
}

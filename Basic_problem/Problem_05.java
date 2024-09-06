public class Problem_05 {

    public static int calcFactorial(int n) {

        if (n == 0)
            return 1;

        return n * calcFactorial(n - 1);
    }

    public static void main(String[] args) {

        int res = calcFactorial(5);
        System.out.println("Factorial: " + res);
    }
}
 
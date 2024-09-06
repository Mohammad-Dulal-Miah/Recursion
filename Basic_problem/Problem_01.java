
public class Problem_01 {

    public static int printValue(int x) {
        if (x == 1) {

            return 1;
        }

        return x * printValue(x - 1);
    }

    public static void main(String[] args) {

        int res = printValue(5);
        System.out.print("Factorial: " + res);

    }
}
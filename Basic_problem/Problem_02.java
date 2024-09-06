public class Problem_02 {
    public static void printNumber(int x) {

        // base condition

        if (x == 6) {
            return;
        }
        System.out.print(x + " ");
        printNumber(x + 1);
    }

    public static void main(String[] args) {
        int x = 1;
        printNumber(x);
    }
}

/*
 * print n natural number sum
 */

public class Problem_04 {
    public static void printNaturalNumberSum(int i, int n, int sum) {

        if(i == n){
            sum += i;
            System.out.println("Sum: "+sum);
            return;
        }

        sum += i;
        printNaturalNumberSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printNaturalNumberSum(1, 5, 0);
    }
}

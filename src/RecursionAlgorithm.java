public class RecursionAlgorithm {
    public static void main(String[] args) {
        System.out.println("The factorial of 3 is: " + findFactorial(3));
        System.out.println("The factorial of 6 is: " + findFactorial(6));
        System.out.println("The factorial of 10 is: " + findFactorial(10));
        System.out.println("The factorial of 20 is: " + findFactorial(20));
    }

    public static long findFactorial(long n){
        if (n <= 1)
            return 1;
        else
            return n * findFactorial(n - 1);
    }
}


import java.util.Arrays;

public class Primenumber {
    public static void printPrimes(int n) {
            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i * i <= n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            System.out.println("Prime numbers in range 0 to " + n + ":");
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            int n = 1000;
            printPrimes(n);
        }
}
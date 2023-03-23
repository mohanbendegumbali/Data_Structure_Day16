public class Palindrome {

    static void palindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("is a palindrome ");
        else
            System.out.println("is not a palindrome");
    }
}

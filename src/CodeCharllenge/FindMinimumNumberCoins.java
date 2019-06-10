package CodeCharllenge;

/**
 * This problem was asked by Google.
 * Find the minimum number of coins required to make n cents.
 * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
 * For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
 */

public class FindMinimumNumberCoins {

    public static void main(String[] args) {

        //input are 16 cents
        int n = 37;

        if (n >= 25) {
            int m = calCoinNum(n, 25);
            System.out.println("25 cents : " + m);
        }

        if((n%25) > 10){
            int m = calCoinNum(n%25, 10);
            System.out.println("10 cents : " + m);
        }

        if((n%25%10) > 5){
            int m = calCoinNum(n%25%10, 5);
            System.out.println("5 cents : " + m);
        }

        if((n%25%10%5) > 1){
            int m = calCoinNum(n%25%10%5, 1);
            System.out.println("1 cents : " + m);
        }

    }

    private static int calCoinNum(int n, int denomination) {
        return n / denomination;
    }


}

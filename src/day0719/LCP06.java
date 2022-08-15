package day0719;

public class LCP06 {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            sum += (coins[i]+1)/2;
        }
        return sum;
    }

    public int game(int[] guess, int[] answer) {
        return (guess[0]^answer[0])+(guess[1]^answer[1])+(guess[2]^answer[2]);
    }

    public static void main(String[] args) {
        System.out.println((2^3)+(2^2)+(1^3));
        System.out.println(2^3);
        System.out.println(2^2);
        System.out.println(1^3);
    }
}

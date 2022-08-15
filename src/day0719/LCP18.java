package day0719;

import java.util.Arrays;

public class LCP18 {
    static final int MOD = (int) (1e9 + 7);

    public static int breakfastNumber(int[] staple, int[] drinks, int x) {
        int ans = 0;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int j = drinks.length - 1;
        for (int i = 0; i < staple.length; i++) {
            while (j >= 0 && staple[i] + drinks[j] > x) {
                j--;
            }
            if (j == -1) {
                break;
            }
            ans += j + 1;
            ans %= MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(breakfastNumber(new int[]{10, 20, 5}, new int[]{5, 5, 2}, 15));
    }
}

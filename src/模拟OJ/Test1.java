package 模拟OJ;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    // 待实现函数，在此函数中填入答题代码

    /**
     * 3
     * 4 1 3
     * 4
     * 3 2 50 3
     * @param packs
     * @param goods
     * @return
     */
    private static int findMaxDeliveryExpress(int[] packs, int[] goods) {
//        5 5 3 1
//        2 5 5
        int j = 0;
        int sum = 0;
        int index = goods.length-1;
        Arrays.sort(goods);
//        ArrayList<Integer> arrayList = new ArrayList<>(goods);
        Arrays.sort(packs);

//        System.out.println(Arrays.binarySearch(goods, 4));
        for (int i = packs.length-1; i >= 0; i--) {

            while (index >= 0 && packs[i] < goods[index]) {
                index--;
            }

            if (index < 0) {
                break;
            }

            sum += goods[index--];
        }
        return sum;
    }

    // main入口由OJ平台调用
    public static void main(String[] args) {
        System.out.println(findMaxDeliveryExpress(new int[]{4, 1, 3}, new int[]{3, 2, 50, 3}));
//        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
//        int packsCnt = cin.nextInt();
//        int[] packs = new int[packsCnt];
//        for (int i = 0; i < packsCnt; i++) {
//            packs[i] = cin.nextInt();
//        }
//        int goodsCnt = cin.nextInt();
//        int[] goods = new int[goodsCnt];
//        for (int i = 0; i < goodsCnt; i++) {
//            goods[i] = cin.nextInt();
//        }
//        cin.close();
//
//        System.out.println(findMaxDeliveryExpress(packs, goods));
    }
}

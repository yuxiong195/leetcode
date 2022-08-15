package 双指针滑动窗口;

import java.util.HashSet;

public class OJ1794 {

    public static void main(String[] args) {
        System.out.println(getLongestFlawedVowelSubstrLen(5, "qiiiiqqqqiqi"));
    }

//    aeiouAEIOU
// 待实现函数，在此函数中填入答题代码
    private static int getLongestFlawedVowelSubstrLen(int flaw, String input) {
        HashSet<Character> hashSet = new HashSet<>();
        char[] sData = "aeiouAEIOU".toCharArray();
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < sData.length; i++) {
            hashSet.add(sData[i]);
        }

        int left = 0;
        int right = 0;
        int flawNum = 0;
        int res = 0;
        int inputLength = input.length();
        while (right<inputLength) {
            char ch = inputArray[right++];

            if (!hashSet.contains(ch)) {
                flawNum++;
            }

            if (flawNum == flaw && hashSet.contains(inputArray[left]) && hashSet.contains(ch)) {
                res = Math.max(res, right-left);
            }
            while (flawNum > flaw) {
                char c1 = inputArray[left++];
                if (!hashSet.contains(c1)) {
                    flawNum--;
                }
            }
        }

        return res;
    }
}

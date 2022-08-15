package 单调栈;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        Stack<Integer> d = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = m - 1; i >= 0; i--) {
            int x = nums2[i];
            while (!d.isEmpty() && d.peek() <= x) {
                d.pop();
            }
            map.put(x, d.isEmpty() ? -1 : d.peek());
            d.add(x);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }


}

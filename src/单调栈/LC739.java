package 单调栈;

import java.util.Stack;

public class LC739 {
    public static void main(String[] args) {

    }

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < len; i++) {
//            int temperature = temperatures[i];
//            while (!stack.empty() && temperatures[stack.peek()]<temperature) {
//                Integer pop = stack.pop();
//                res[pop] = i - pop;
//            }
//            stack.push(i);
//        }
        for (int i = len-1; i >=0 ; i--) {
            int temperature = temperatures[i];
            while (!stack.empty() && temperature >= temperatures[stack.peek()]) {
                stack.pop();
            }
            res[i] = stack.empty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}

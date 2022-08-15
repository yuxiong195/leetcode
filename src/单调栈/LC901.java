package 单调栈;

import java.util.Stack;

public class LC901 {
//100, 80, 60, 70, 60, 75, 85
    private final Stack<Integer> priceStack;
    private final Stack<Integer> widthStack;

    public LC901() {
        this.priceStack = new Stack<>();
        this.widthStack = new Stack<>();
    }

    public int next(int price) {
        int width = 1;
        while (!priceStack.isEmpty() && price>=priceStack.peek()) {
            priceStack.pop();
            width += widthStack.pop();
        }
        priceStack.push(price);
        widthStack.push(width);
        return width;
    }
}

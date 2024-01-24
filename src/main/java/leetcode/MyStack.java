package leetcode;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> stack = new ArrayList<>();

    public MyStack() {

    }

    public void push(int x) {
        stack.add(x);

    }

    public int pop() {
        return stack.removeLast();
    }

    public int top() {
        return stack.getLast();

    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
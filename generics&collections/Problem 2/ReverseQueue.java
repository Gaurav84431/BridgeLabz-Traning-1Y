import java.util.*;

class ReverseQueue {
    public static <T> void reverse(Queue<T> q) {
        Stack<T> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.poll());
        while (!stack.isEmpty()) q.add(stack.pop());
    }
}
import java.util.*;

class StackUsingQueue<T> {
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();

    public void push(T x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.poll());
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public T pop() {
        return q1.poll();
    }

    public T top() {
        return q1.peek();
    }
}
package implement_queue_from_stack;

import java.util.Deque;
import java.util.LinkedList;

public class Queue<T> {

    Deque<T> stack1 = new LinkedList<>();
    Deque<T> stack2 = new LinkedList<>();


    public void add(T o) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(o);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public T remove() {
        if(stack1.isEmpty()) {
            return null;
        }
        return stack1.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    public T peek() {
        return stack1.peek();
    }
}

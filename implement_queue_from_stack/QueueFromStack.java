package implement_queue_from_stack;

import java.util.Deque;
import java.util.LinkedList;

public class QueueFromStack {

    // implement a queue from stack

    /*
    Queue follow FIFO
    Stack follows LIFO
     */

    public static void main(String args[]) {

        Deque<Integer> actualQueue = new LinkedList<>();
        actualQueue.add(1);
        actualQueue.add(2);
        actualQueue.add(3);
        System.out.println(actualQueue.remove());
        System.out.println(actualQueue.remove());
        actualQueue.add(6);
        System.out.println(actualQueue.remove());
        System.out.println(actualQueue.remove());

        System.out.println("-----------------------------------------Queue from Stacks --------------------------");


        Queue<Integer> actualQueue2 = new Queue<>();
        actualQueue2.add(1);
        actualQueue2.add(2);
        actualQueue2.add(3);
        System.out.println(actualQueue2.remove());
        System.out.println(actualQueue2.remove());
        actualQueue2.add(6);
        System.out.println(actualQueue2.remove());
        System.out.println(actualQueue2.remove());

    }

/* Response:
1
2
3
6
-----------------------------------------Queue from Stacks --------------------------
1
2
3
6
 */
}

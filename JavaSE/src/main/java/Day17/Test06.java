package Day17;

import java.util.LinkedList;
import java.util.Queue;

public class Test06 {
    public static void main(String[] args) {
        /**
         * Queue 为队列，先进先出的数据结构（FIFO）
         */
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println(queue);
        // 获取队列的头，不移除队列的头
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("-----------------");
        // 获取队列的头，并移除它
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

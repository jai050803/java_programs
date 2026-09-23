import java.util.ArrayDeque;

class arrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack peek: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        stack.pop();
        System.out.println("Stack size after removal: " + stack.size());
        System.out.println("stack peek after removal: " + stack.peek());

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println("Queue front: " + queue.peek());
        System.out.println("queue size: " + queue.size());
        queue.poll();
        System.out.println("queue size after removal : " + queue.size());
        System.out.println("Queue front after removal: " + queue.peek());
   }
}
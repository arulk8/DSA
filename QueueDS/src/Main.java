public class Main {
    public static void main(String[] args) {
        QueueDS queue = new QueueDS(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.traverse(); // Output: 1 -> 2 -> 3 ->

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); // Output: Queue is Empty

        queue.traverse(); // Output: Queue is Empty

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println();
        queue.traverse(); // Output: 1 -> 2 -> 3 ->

        queue.add(4);
        queue.add(5);
        queue.add(6); // Output: Queue is Full (if attempted)

        queue.traverse(); // Output: 1 -> 2 -> 3 -> 4 -> 5 ->

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.traverse(); // Output: 5 ->

        queue.poll();
        queue.poll(); // Queue is empty
        
    }
}
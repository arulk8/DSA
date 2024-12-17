public class QueueDS {
        private final int[] queueArray;
        private int front;
        private int rear;
        private final int capacity;
        private int size;

        QueueDS(int capacity) {
            this.capacity = capacity;
            this.queueArray = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;  // size
        }

        public boolean isEmpty() {
            return size == 0;
        }
        public boolean isFull() {
            return size == capacity;
        }

        public void add(int num) {
            if (isFull()) {
                System.out.println("Queue is Full");
            } else {
                queueArray[rear] = num;
                rear = (rear + 1) % capacity;
                size++;
            }
        }

        public int poll() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            } else {
                int element = queueArray[front];
                front = (front + 1) % capacity;
                size--;
                return element;
            }
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return queueArray[front];
        }


        public void traverse() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            } else {
                int i = front;
                for (int count = 0; count < size; count++) {
                    System.out.print(queueArray[i] + " -> ");
                    i = (i + 1) % capacity;
                }
                System.out.println();
            }
        }
    }







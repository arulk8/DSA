public class StackDS {
    int top = -1;
    int[] arr;
    int capacity;

    public StackDS(int capacity){
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public void push(int e){
        if(top == capacity -1){
            System.out.println("Capacity is full");
        }
        top++;
        arr[top] = e;

    }

    public int pop(){
        if(top == -1){
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }

    public int peek(){
        if(top == -1){
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}

public class Queue {
    private int maxSize;
    private Object[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(Object item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queueArray[rear] = item;
            nItems++;
        }
    }

    public Object remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Object item = queueArray[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return item;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}

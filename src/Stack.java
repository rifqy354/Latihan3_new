public class Stack {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int a) {
        this.maxSize = 100;
        this.stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object item) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            Object item = stackArray[top];
            top--;
            return item;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int search(Object item) {
        int count = 0;
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(item)) {
                return count + 1;
            }
            count++;
        }
        return -1;
    }

    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        } else {
            String stackString = "";
            for (int i = top; i >= 0; i--) {
                stackString += stackArray[i] + " ";
            }
            return stackString;
        }
    }
}


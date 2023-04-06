public class MainQueue {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert("Java");
        myQueue.insert("DotNet");
        myQueue.insert("PMP");
        myQueue.insert("HTML");

        System.out.println("remove: " + myQueue.remove());
        System.out.println("peek: " + myQueue.peek());
        System.out.println("remove: " + myQueue.remove());
        System.out.println("peek: " + myQueue.peek());
        System.out.println("Size: " + myQueue.size());
    }
}

package CircularQueue;

public class CircularQueue {

    public static void main(String[] args) {

        Queue circularqueue = new Queue(5);

        System.out.println(circularqueue.enqueue(50));
        System.out.println(circularqueue.enqueue(70));
        System.out.println(circularqueue.enqueue(80));
        System.out.println(circularqueue.IsEmpty());
        System.out.println(circularqueue.dequeue());
        System.out.println(circularqueue.dequeue());
        System.out.println(circularqueue.enqueue(55));
        System.out.println(circularqueue.enqueue(45));
        System.out.println(circularqueue.enqueue(75));
        System.out.println(circularqueue.dequeue());
        System.out.println(circularqueue.dequeue());
        System.out.println(circularqueue.dequeue());
    }
}

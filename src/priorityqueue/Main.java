package priorityqueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue pq=new PriorityQueue();
        pq.enqueue(10,2);
        pq.display();
        pq.enqueue(20,1);
        pq.display();
        pq.enqueue(30,4);
        pq.display();
        pq.enqueue(40,3);
        pq.display();

        pq.dequeue();
        pq.display();


        pq.dequeue();
        pq.display();
    }
}

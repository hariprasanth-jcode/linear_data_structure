package queueds;

public class CircularQueue {

    Node front;
    Node rear;

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
            rear = node;
            rear.next = front;
            return;
        }
        rear.next = node;
        front = node;
        rear.next = front;

    }

    public void dequeue(){

        if(isEmpty()){
            System.out.println("Circular Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + front.data);
        if(front==rear){
            front=null;
            rear=null;
            return;
        }
        front=front.next;
        rear.next=front;
    }

    public void display(){
        Node node=front;
        if(isEmpty()){
            System.out.println("Circular Queue is empty");
            return;
        }

        while(node!=front){
            System.out.print(node.data+"===>");
            node = node.next;
        }
        System.out.println("(back to front)");
    }
}

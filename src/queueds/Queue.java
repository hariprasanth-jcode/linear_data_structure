package queueds;

public class Queue {

    Node front;
    Node rear;

    public boolean isEmpty(){
        return front==null;
    }


    public void enqueue(int data){
        Node node=new Node(data);
        if(isEmpty()){
            front=node;
            rear=node;
            return ;
        }
        rear.next=node;
        rear=node;
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front=front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void display(){
        Node node=front;
        while(node!=null){
            System.out.print(node.data+"=======>");
            node=node.next;
        }
        System.out.println();
    }
}

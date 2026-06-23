package priorityqueue;

public class PriorityQueue {

    Node front;

    public void enqueue(int data,int priority){

        Node newNode=new Node(data,priority);

        if(front==null || priority< front.priority){
            newNode.next=front;
            front=newNode;
        }else{
            Node temp=front;
            while(temp.next!=null && temp.next.priority<=priority){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }


    }
    public void display(){
        if(front==null){
            System.out.println("Priority queue is Empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print("[Data : "+temp.data +", Priority "+temp.priority+" ");
            temp=temp.next;
        }
        System.out.println(" null]");
    }

    public void dequeue(){

        if(front==null){
            System.out.println("Priority queue is Empty");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front=front.next;
    }

}

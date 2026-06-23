package stackds;

public class Stack {

    private Node top;
    private int size;

    public Stack(){
        this.top=null;
        this.size=0;
    }

    public void push(int data){
        Node node=new Node(data);
        node.next=top;
        top=node;
        size++;
        System.out.println("Pushed " + data + " to stack");
    }

    public void clear(){
        top=null;
        size=0;
        System.out.println("Stack cleared");
    }

    public void display(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack top to bottom");
        Node node=top;
        while(node!=null){
            System.out.print(node.data+"---->");
            node=node.next;
        }
        System.out.println();

    }

    public boolean isEmpty(){
        return top==null;
    }

    public int size() {
        return size;
    }

    public int peek(){

        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        int data=top.data;
        top=top.next;
        size--;
        System.out.println("popped"+data+"from stack");
        return data;
    }
}

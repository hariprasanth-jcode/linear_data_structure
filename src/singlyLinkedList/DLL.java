package singlyLinkedList;

public class DLL {


    private Node head;
    private Node tail;
    private int size;

    DLL(){
        this.size=0;
    }

    private class Node{

        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val=val;
        }

        Node(int val,Node prev,Node next){
            this.val=val;
            this.prev=next;
            this.next=next;
        }


    }

    public void insertAtFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }

    public void displayForward(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+"======>");
            node=node.next;
        }
        System.out.println("End");
    }

    public void displayBackward(){
        Node node=tail;
        while(node!=null){
            System.out.print(node.val+"==========>");
            node=node.prev;
        }
        System.out.println("End");
    }

    public void deleteAtFirst(){
        Node node=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }

        head=node.next;
        node.prev=null;
        size--;
    }

    public void deleteAtlast(){
        Node node=tail;
        if(tail==null){
            System.out.println("List is Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
        tail=node.prev;
        node.next=null;
        size--;

    }
}

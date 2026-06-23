package singlyLinkedList;

public class LL {

    private Node head;
    private  Node tail;
    private int size;

    private class Node{
        private int value;
        private Node next;

        Node(int value){
        this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }



    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"--->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }


    public void insert(int val,int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;

    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;

        return val;

    }

    public int deleteByIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public int findTheLargest(){
        Node node=head;
        int max=node.value;
        while(node!=null){
            if(max<node.value){
                max=node.value;
            }
            node=node.next;
        }
        return max;
    }

   public int getSize(){
        return size;
   }

   public int findMiddleValue(){
       Node node=head;
       int value=0;

            for(int i=0;i<(size/2)+1;i++) {

                if (node != null) {
                    value = node.value;
                    node = node.next;
                }
            }
       return value;
   }

   public int findTheMiddle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        }

        return slow.value;
   }
}

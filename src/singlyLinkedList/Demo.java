package singlyLinkedList;

public class Demo {


    static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtFirst(60);
        list.displayForward();
       // list.displayBackward();
//        list.deleteAtFirst();
          list.displayForward();
//        list.deleteAtFirst();
//        list.displayBackward();
        list.deleteAtlast();
        list.displayForward();
    }
}

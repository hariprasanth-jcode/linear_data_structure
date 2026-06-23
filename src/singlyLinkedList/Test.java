package singlyLinkedList;

public class Test {

    static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(10);
        list.insertFirst(200);
        list.insertFirst(30);
        list.insertLast(14);
        list.insert(15,2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteByIndex(1));
//        list.display();
//        System.out.println(list.find(10));

        System.out.println(list.findTheLargest());
        System.out.println(list.getSize());
        list.display();
        System.out.println(list.findMiddleValue());
        System.out.println(list.findTheMiddle());
    }
}

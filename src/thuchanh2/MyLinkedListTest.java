package thuchanh2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);             // 13 12 11 10 8 9
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 8);

        ll.printList();
    }
}

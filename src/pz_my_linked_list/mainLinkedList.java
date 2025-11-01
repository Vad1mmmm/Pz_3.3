package pz_my_linked_list;

public class mainLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(30);
        myLinkedList.add(new Element(1234));
        myLinkedList.add(new Element(5678));
        myLinkedList.add(new Element(789));
        myLinkedList.add(new Element(9));
        myLinkedList.add(new Element(10));
        myLinkedList.add(new Element(11));


        MyLinkedList.writeLists(myLinkedList);
    }
}

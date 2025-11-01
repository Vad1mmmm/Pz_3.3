package pz_my_linked_list;

public class MyLinkedList {
    private Element[] heads;
    public MyLinkedList() {
        heads = new Element[10];
    }
    public MyLinkedList(int size) {
        heads = new  Element[size];
    }

    public void add(Element element) {
        for (int i = 0; i < heads.length; i++) {
            if (heads[i] == null) {
                heads[i] = element;
                break;
            }
        }
    }

    public void add(int index, int value) {
        if (index > heads.length - 1) {
            for (int i = heads.length - 1; i > index; i--) {

            }
        }
    }

    public Element[] getLists() {
        return heads;
    }

    public static void writeLists(MyLinkedList myLinkedList) {
        for (int i = 0; i < myLinkedList.getLists().length; i++) {
            if (myLinkedList.getLists()[i] != null) {
                System.out.println(myLinkedList.getLists()[i]);
            }
        }
    }
}

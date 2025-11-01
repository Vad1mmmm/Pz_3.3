package pz_my_linked_list;

public class Element {
    int data;
    Element next;
    public Element(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

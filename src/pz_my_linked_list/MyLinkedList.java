package pz_my_linked_list;

public class MyLinkedList {
    private Element head;
    private Element tail;
    private int size;

    private static class Element {
        private Integer element;
        private Element next;

        public Element(Integer element) {
            this.element = element;
        }
        public boolean hasNext() {
            return next != null;
        }
        public Element next() {
            return next;
        }
        public Integer getElement() {
            return element;
        }
        public void setElement( Integer element) {
            this.element = element;
        }
        public void setNext(Element next) {
            this.next = next;
        }
    }
    public void add(Integer element) {
        Element newElement = new Element(element);
        if (head == null) {
            head = newElement;
            tail = newElement;
        }
        else {
            tail.setNext(newElement);
            tail = newElement;
        }
    }
    public void add(int index, Integer element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Element newElement = new Element(element);
        if (index == 0) {
            newElement.setNext(head);
            head = newElement;
            if(size == 0) tail = newElement;
        }
        if(index == size) {
            tail.setNext(newElement);
            tail = newElement;
        }
        else {
            Element prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            newElement.setNext(prev.next);
            prev.setNext(newElement);
        }
        size++;
    }

    public void addFirst(Integer element) {
        Element newElement = new Element(element);
        if (head == null) {
            head = newElement;
            tail = newElement;
        }
        else {
            newElement.setNext(head);
            head = newElement;
            if(size == 0) tail = newElement;
        }
        size++;
    }
    public void addLast(Integer element) {
        Element newElement = new Element(element);
        if (head == null) {
            head = newElement;
            tail = newElement;
        }
        else {
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;
    }
    public Integer get(int index){
        Element element = head;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        for (int i = 0; i < index; i++) {
            element = element.next();
        }
        return element.element;
    }
    public Integer getFirst() {
        return head.element;
    }
    public Integer getLast() {
        return tail.element;
    }
    public Integer remove(int index){

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }


        Integer returnValue;

        return null;
    }
    public Integer removeFirst(){
        head = head.next;
        size--;
        return head.element;
    }
}

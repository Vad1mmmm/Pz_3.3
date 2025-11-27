package pz_my_linked_list;

import javax.lang.model.element.Element;

public class MyQueue {

    private MyLinkedList list = new  MyLinkedList();

    public void offer (Integer e){
        list.addLast(e);
    }
    public Object peek() {
        if (list.size() == 0) return null;
        return list.getFirst();
    }
    public Object poll() {
        if (list.size() == 0) return null;
        return list.removeFirst();
    }
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue: ");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.toString();
    }
}


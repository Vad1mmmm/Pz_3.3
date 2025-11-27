package pz_my_linked_list;

public class MyStack {
    private MyLinkedList list = new MyLinkedList();

    public void push(Integer e){
        list.addFirst(e);
    }
    public Object pop() {
        if(list.size() == 0) return null;
        return list.removeFirst();
    }
    public Object peek() {
        if(list.size() == 0) return null;
        return list.getFirst();
    }
    public int  size() {
        return list.size();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: ");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.toString();
    }
}

class GenSLNode<T> {
    T data;
    GenSLNode<T> next;

    GenSLNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class GenSLList<T> {

    private GenSLNode<T> head;
    private int size;

    public GenSLList() {
        head = null;
        size = 0;
    }

    public void addy(T item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null.");

        GenSLNode<T> newNode = new GenSLNode<>(item);

        if (head == null) {
            head = newNode;
        } else {
            GenSLNode<T> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }

        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException("pos out of range: " + pos);

        if (pos == 0) {
            head = head.next;
        } else {
            GenSLNode<T> current = head;
            for (int i = 0; i < pos - 1; i++) current = current.next;
            current.next = current.next.next;
        }

        size--;
    }

    @Override
    public String toString() {
        if (size == 0) return "Empty List";

        StringBuilder sb = new StringBuilder();
        GenSLNode<T> current = head;

        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }

        return sb.toString();
    }
}
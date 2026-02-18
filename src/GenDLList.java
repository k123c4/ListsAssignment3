class GenDLNode<T> {
    T data;
    GenDLNode<T> next;
    GenDLNode<T> prev;

    GenDLNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class GenDLList<T> {

    private GenDLNode<T> head;
    private int size;

    public GenDLList() {
        head = null;
        size = 0;
    }

    public void addy(T item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null.");

        GenDLNode<T> newNode = new GenDLNode<>(item);

        if (head == null) {
            head = newNode;
        } else {
            GenDLNode<T> current = head;
            while (current.next != null) current = current.next;

            current.next = newNode;
            newNode.prev = current;
        }

        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException("pos out of range: " + pos);

        if (pos == 0) {
            head = head.next;
            if (head != null) head.prev = null;
        } else {
            GenDLNode<T> current = head;
            for (int i = 0; i < pos; i++) current = current.next;

            GenDLNode<T> prevNode = current.prev;
            GenDLNode<T> nextNode = current.next;

            prevNode.next = nextNode;
            if (nextNode != null) nextNode.prev = prevNode;
        }

        size--;
    }

    @Override
    public String toString() {
        if (size == 0) return "Empty List";

        StringBuilder sb = new StringBuilder();
        GenDLNode<T> current = head;

        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }

        return sb.toString();
    }

}


public class DLList {

    private DLNode head;
    private int size;

    //empty list
    public DLList() {
        head = null;
        size = 0;
    }
    public void addy(Song s) {

        if (s == null) {
            throw new IllegalArgumentException("Song cannot be null.");
        }

        DLNode newNode = new DLNode(s);

        if (head == null){
            head = newNode;
        }else{
            DLNode current = head
                    ;
            // Traverse to last node
            while (current.next != null) {
                current = current.next;
            }

            // Link new node
            current.next = newNode;
            newNode.prev = current; // the doubly part
        }

        size++;
    }
    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Position out of range: " + pos);
        }

        // Removing head
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            DLNode current = head;

            // move to position
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }

            // Re-link neighbors
            DLNode previousNode = current.prev;
            DLNode nextNode = current.next;

            previousNode.next = nextNode;

            if (nextNode != null) {
                nextNode.prev = previousNode; //doubly part
            }
        }

        size--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode current = head;

        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return sb.toString();
    }

}


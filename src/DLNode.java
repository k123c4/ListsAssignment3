public class DLNode {
    Song data;
    DLNode next;
    DLNode prev;


     // Constructor for DLNode.
    public DLNode(Song data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

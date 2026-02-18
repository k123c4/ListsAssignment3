public class SLList {
    private SLNode head;
    private int size;

    //empty constructor
    public SLList(){
        head = null;
        size = 0;
    }


    public void addy(Song s){
        if (s == null){
            throw new IllegalArgumentException("Song cannot be null");
        }

        SLNode newNode = new SLNode(s);

        if (head == null){
            head = newNode;
        }else{
            SLNode current = head;
        // move to last node
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++; //increment list size
    }
    public void removy(int pos){
        if(pos < 0 || pos >= size) {
        throw new IllegalArgumentException("Position out of range: "+ pos);
        }
        //remove head
        if (pos==0){
            head = head.next;
        }else{
            SLNode current = head;

            //move to node before pos
            for(int i = 0; i < pos-1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        SLNode current = head;

        while(current != null){
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }

        return sb.toString();
    }
}

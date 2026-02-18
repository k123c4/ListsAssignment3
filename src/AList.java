/**
 * Array-based list that stores Song instances.
 */
public class AList {

    private Song[] data;
    private int size;
    private int maxSize;

    private static final int DEFAULT_CAPACITY = 10;


    public AList() {
        this.maxSize = DEFAULT_CAPACITY;
        this.data = new Song[maxSize];
        this.size = 0;
    }

    public void addy(Song p) {
        if (p == null) {
            throw new IllegalArgumentException("Song cannot be null.");
        }

        // Resize if full
        if (size == maxSize) {
            resize(maxSize * 2);
        }

        data[size] = p;
        size++;
    }


    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("pos out of range: " + pos);
        }

        // Shift left to cover removed pos
        for (int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // Clear last spot and decrement size
        data[size - 1] = null;
        size--;

    }

    @Override
    public String toString() {
        if (size == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[i].toString());
            if (i < size - 1) sb.append("\n");
        }
        return sb.toString();
    }

    // Helper Methods

    private void resize(int newCapacity) {
        Song[] newData = new Song[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        maxSize = newCapacity;
    }

    public Song get(int pos) { //pos song position
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("pos out of range: " + pos);
        }
        return data[pos];
    }
}

public class GenAList<T> {
    private Object[] data;
    private int size;
    private int maxSize;

    private static final int DEFAULT_CAPACITY = 10;

    public GenAList() {
        maxSize = DEFAULT_CAPACITY;
        data = new Object[maxSize];
        size = 0;
    }

    public void addy(T item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null.");

        if (size == maxSize) resize(maxSize * 2);

        data[size] = item;
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) throw new IndexOutOfBoundsException("pos out of range: " + pos);

        for (int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;

        if (maxSize > DEFAULT_CAPACITY && size <= maxSize / 4) {
            resize(Math.max(DEFAULT_CAPACITY, maxSize / 2));
        }
    }

    @Override
    public String toString() {
        if (size == 0) return "Empty List";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append("\n");
        }
        return sb.toString();
    }

    private void resize(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        for (int i = 0; i < size; i++) newData[i] = data[i];
        data = newData;
        maxSize = newCapacity;
    }

    public int size() { return size; }

    @SuppressWarnings("unchecked")
    public T get(int pos) {
        if (pos < 0 || pos >= size) throw new
                IndexOutOfBoundsException("pos out of range: " + pos);
        return (T) data[pos];
    }
}

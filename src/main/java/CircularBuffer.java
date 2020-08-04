public class CircularBuffer {
    private final int bufferSize;
    private String[] buffer;
    private int ReadPointer;
    private int WritePointer;

//Default Cost.
    public CircularBuffer() {
        this(10);
    }
// Overload Const.
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public void setSize() {
        this.buffer = new String[15];
    }

    public boolean isReSize(int size){
        return this.buffer.length == size;
    }

    public boolean isEmpty() {
        return ReadPointer == WritePointer;
    }

    public void writeData(String input) {
        this.buffer[WritePointer++] = input;
    }

    public boolean isFull() {
        return WritePointer>=bufferSize;
    }

    public String readData() {
        return this.buffer[ReadPointer++];
    }

    public void deleteData(String input) {
        this.buffer[WritePointer--] = input;
    }
}

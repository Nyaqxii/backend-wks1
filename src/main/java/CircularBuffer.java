public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer;
    private int ReadPointer;
    private int WritePointer;

    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[WritePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize==0;
    }

    public String readData() {
        return this.buffer[ReadPointer++];
    }
}

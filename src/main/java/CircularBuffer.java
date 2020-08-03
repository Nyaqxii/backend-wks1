public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer;
    private int ReadPointer;
    private int WritePointer;


    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public void setSize() {
        this.buffer = new String[15];
    }

    public boolean isReSize(int size){
        return this.buffer.length == size;
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

    public void deleteData(String input) {
        this.buffer[WritePointer--] = input;
    }
}

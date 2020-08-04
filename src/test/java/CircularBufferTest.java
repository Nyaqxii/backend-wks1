import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_with_size(){
       cb = new CircularBuffer(5);

    }

    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue ("Buffer not Empty", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10(){
        for (int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue ("Buffer is Full", result);
    }

    @Test //FIFO
    public void write_A_B_to_buffer_should_read_A_B(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }

    @Test //FIFO
    public void write_A_B_C_to_buffer_should_read_A_B_C(){
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
        assertEquals("C",cb.readData());
    }
    @Test
    public void write_A_B_C_D_to_buffer_should_read_A_B_C_D(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
        assertEquals("C",cb.readData());
    }
    @Test
    public void reset_buffer_size_from_10_to_15() {
        int size = 15;
        cb.setSize();
        boolean result = cb.isReSize(size);
        assertTrue("size update: 15.",result);
    }

    @Test
    public void create_A_Read_A_and_Remove_A() {
        cb.writeData("A");
        assertEquals("A",cb.readData());
        cb.deleteData("A");
    }
    @Test
    public void create_A_Read_A_and_Delete_All_A_one_by_one() {
        for (int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue ("Buffer is Full", result);
        cb.readData();
        for (int i=0; i>10;){
        cb.deleteData("A");

        boolean result2 = cb.isEmpty();
        assertTrue ("Buffer is Empty", result2);
        }

    }
}

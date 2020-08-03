import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi();
        assertEquals("Hello World", result); //ค่าที่เราคาดหวัง,สิ่งที่เราได้มา
    }
    @Test
    public void sayHi_with_neeya_should_return_Hello_Neeya(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("neeya");
        assertEquals("Hello Neeya", result); //ค่าที่เราคาดหวัง,สิ่งที่เราได้มา
    }

    @Test
    public void sayHi_with_Hasaneeya_should_return_Hello_hasaneeya(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHi("hasaneeya");
        assertEquals("Hello Hasaneeya", result); //ค่าที่เราคาดหวัง,สิ่งที่เราได้มา
    }
}
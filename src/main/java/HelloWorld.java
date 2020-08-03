import static java.lang.System.*;

public class HelloWorld {

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        String substring1 = name.substring(0,1).toUpperCase();
        String substring2 = name.substring(1,name.length());
        String Name = substring1 + substring2;
        return "Hello " + Name;
    }
}

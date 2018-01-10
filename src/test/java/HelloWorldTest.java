import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testGetHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String str = helloWorld.getHelloWorld();
        Assert.assertEquals("hello world", str);
    }

}

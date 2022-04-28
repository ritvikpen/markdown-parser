import static org.junit.Assert.*; // Import the JUnit tester code from the library
import org.junit.*;
import java.util.List;

public class MarkdownParseTest { // Create the class
    @Test // tell the code we're making a test here 
    public void addition() { // the test method
        assertEquals(2, 1 + 1); // check to see if 2 equals 1+1 and the test passes if it is
    }

    @Test
    public void getLinksTest(){
        assertEquals(MarkdownParse.main("test-file.md"), List.of("https://something.com", "some-thing.html"));
    }
}
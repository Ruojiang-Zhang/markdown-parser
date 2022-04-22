import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest{
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }

    @Test
    public void checkLink() throws Exception{
        Path filename = Path.of("test-file.md");
        String content = Files.readString(filename);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }
}

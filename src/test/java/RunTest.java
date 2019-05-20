import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunTest {

    Run CurrentRun;

    @Before
    public void setUp() throws Exception {
        CurrentRun = new Run();
        System.out.println("Выполнена аннотация \"@Before\"");
    }

    @After
    public void tearDown() throws Exception {
        CurrentRun = null;
        System.out.println("Выполнена аннотация \"@After\"");
    }

    @Test
    public void addSymbolsToString() {
        assertEquals("кошка", CurrentRun.addSymbolsToString());
        System.out.println("Выполнена аннотация \"@Test\"");
    }

    @Test
    public void addSymbolsToStringFailedTest() {
        assertEquals("неправильная кошка", CurrentRun.addSymbolsToStringFailedTest());
        System.out.println("Выполнена аннотация \"@Test\"");
    }
}
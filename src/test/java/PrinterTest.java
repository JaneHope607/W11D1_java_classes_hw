import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 100);
        printer.print(5, 3);
    }

    @Test
    public void checkPages() {
        assertEquals(35, printer.getPagesLeft());
    }

    @Test
    public void checkToner() {
        assertEquals(85, printer.getTonerLeft());
    }

}

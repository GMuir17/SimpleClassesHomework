import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10);
    }

    @Test
    public void getPaperLeft() {
        assertEquals(10, printer.getPaperLeft());
    }

    @Test
    public void printTest() {
        printer.print(1, 1);
        assertEquals(9, printer.getPaperLeft());
    }

}

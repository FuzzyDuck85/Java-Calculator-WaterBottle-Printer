import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 45);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(45, printer.getToner());
    }

    @Test
    public void canPrintWhenEnoughPaper() {
        printer.print(5, 2);
        assertEquals(40, printer.getPaper());
    }

    @Test
    public void willNotPrintIfPaperSupplyTooLow(){
        printer.print(10, 6);
        assertEquals(50, printer.getPaper());
        assertEquals(45, printer.getToner());
    }

    @Test
    public void tonerLevelReducesWhenPrinting(){
        printer.print(1,1);
        assertEquals(44, printer.getToner());
    }

    @Test
    public void canPrintWhenTonerLevelSufficient(){
        printer.print(5, 2);
        assertEquals(35, printer.getToner());
    }
}

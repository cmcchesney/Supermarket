import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ProductRule2for1Test extends TestCase {

    private ProductRule2for1 productRule2for1;

    @Before
    public void setUp() throws Exception {
        productRule2for1 = new ProductRule2for1();
    }

    @Test
    public void testProductRule() throws Exception {
        assertEquals(100, productRule2for1.calculatePrice(100, 2));
        assertEquals(100, productRule2for1.calculatePrice(50, 4));
        assertEquals(100, productRule2for1.calculatePrice(100, 1));
        assertEquals(500, productRule2for1.calculatePrice(100, 10));
    }

    public void testProductRule_InvalidValues() throws Exception {
        assertEquals(0, productRule2for1.calculatePrice(100, 0));
        assertEquals(0, productRule2for1.calculatePrice(0, 4));
        assertEquals(0, productRule2for1.calculatePrice(100, -3));
    }
}
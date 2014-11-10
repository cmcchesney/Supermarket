import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductRule5for3Test {

    private ProductRule5for3 productRule5for3;

    @Before
    public void setUp() throws Exception {
        productRule5for3 = new ProductRule5for3();
    }

    @Test
    public void testProductRule() throws Exception {
        assertEquals(700, productRule5for3.calculatePrice(100, 11));
        assertEquals(200, productRule5for3.calculatePrice(50, 4));
        assertEquals(100, productRule5for3.calculatePrice(100, 1));
        assertEquals(600, productRule5for3.calculatePrice(100, 10));
    }

    public void testProductRule_InvalidValues() throws Exception {
        assertEquals(0, productRule5for3.calculatePrice(100, 0));
        assertEquals(0, productRule5for3.calculatePrice(0, 4));
        assertEquals(0, productRule5for3.calculatePrice(100, -6));
    }
}
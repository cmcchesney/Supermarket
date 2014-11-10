import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Product product;
    private Product product2;
    private Product product3;
    private Product product4;

    @Before
    public void setUp() throws Exception {
        product = new Product("Test", 10, 3);
        product2 = new Product("Test2", 50, 5, new ProductRule5for3());
        product3 = new Product("Test2", 50, 2, new ProductRule5for3());
        product4 = new Product("Test2", 50, 8, new ProductRule5for3());
    }

    @Test
    public void testAddQuantity() throws Exception {
        product.addQuantity(1);
        product2.addQuantity(0);
        product3.addQuantity(-1);
    }

    @Test
    public void testGetProductTotal() throws Exception {
        assertEquals(30, product.getProductTotal());
        assertEquals(150, product2.getProductTotal());
        assertEquals(100, product3.getProductTotal());
        assertEquals(300, product4.getProductTotal());
    }
}
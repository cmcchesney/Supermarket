import java.lang.Exception;import static org.junit.Assert.*;

public class NikeSupermarketTest {

    private NikeSupermarket nikeSupermarket;

    @org.junit.Before
    public void setUp() throws Exception {
        nikeSupermarket = new NikeSupermarket();
    }

    @org.junit.Test
    public void testCheckout_Valid() throws Exception {
        assertEquals(100,nikeSupermarket.checkout("ABC"));
        assertEquals(60,nikeSupermarket.checkout("AAA"));
        assertEquals(150,nikeSupermarket.checkout("BBBBB"));
        assertEquals(90,nikeSupermarket.checkout("CCC"));
        assertEquals(100,nikeSupermarket.checkout("AAAAA"));
        assertEquals(200,nikeSupermarket.checkout("BBBBBB"));
        assertEquals(300,nikeSupermarket.checkout("BBBBBBBBBB"));
        assertEquals(240,nikeSupermarket.checkout("ABBACBBAB"));
    }

    @org.junit.Test
    public void testCheckout_InvalidCharacter() throws Exception {
        assertEquals(100,nikeSupermarket.checkout("ABCD"));
        assertEquals(0,nikeSupermarket.checkout("D"));
        assertEquals(0, nikeSupermarket.checkout("%"));
        assertEquals(0, nikeSupermarket.checkout(""));
        assertEquals(0, nikeSupermarket.checkout(null));
    }

}
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tenku on 10/16/13.
 */
public class CardTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        Card test = new Card("Boot");
        Assert.assertEquals("Boot", test.getName());

    }

    @Test
    public void testSetName() throws Exception {
        Card test = new Card("Shoe");
        test.setName("Boot");
        Assert.assertEquals("Boot", test.getName());

    }

    @Test
    public void testGetText() throws Exception {

    }

    @Test
    public void testSetText() throws Exception {

    }

    @Test
    public void testCompareTo() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}

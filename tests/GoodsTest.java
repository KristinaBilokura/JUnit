import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import unitTests.Goods;
import unitTests.Shop;


import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GoodsTest {
    private static final Logger log = Logger.getLogger(String.valueOf(GoodsTest.class));
    private Goods goods;
    @Before
    public void init() {
        goods = new Goods(); }

    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(GoodsTest.class);
        log.info("run tests: " + result.getRunCount());
        log.info("failed tests: " + result.getFailureCount());
        log.info("ignored tests: " + result.getIgnoreCount());
        log.info("success: " + result.wasSuccessful());

    }

    @Test
    public void generateSaleTest() throws Exception {
        assertTrue(30> goods.generateSale());
    }

    @Test
    public void generateSaleNullTest() throws Exception {
        int sale =goods.generateSale();
        if(0!=sale) {
            log.error("OPS!It is error");
            fail("Error");
        }
    }


    @Ignore
    @Test
    public void calculatePriceWithSale() throws Exception {
    }
    @Test
    public void voidmethodTest() throws Exception {
        assertEquals(false,goods.trueFalse);
    }
    @Test
    public void testPrivateMethodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Goods.class.getDeclaredMethod("privatemethod", String.class);
        method.setAccessible(true);
        Boolean result = (Boolean)method.invoke(new Goods(), "test parameter");
        Assert.assertTrue(result);
    }
    @Test
    public void getPriceTest(){
        assertEquals(199.99, goods.getPrice());
    }




}

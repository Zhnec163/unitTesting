import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] testEquals() {
        return new Object[][]{
                {"4", "2", "2"},
                {"0", "-1", "1"},
                {"4", "2", "2"},
                {"2", "0.5", "1.5" },
                {"-100", "-100", "0"},
                {"-20", "-15.5", "-4.5" }
        };
    }

    @Test(dataProvider = "testEquals")
    public void testEqualsFive(String one, String two, String tree) {
        Assert.assertEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '+'), "Значения не равны!");
    }
}

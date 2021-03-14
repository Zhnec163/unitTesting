import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] testEquals() {
        return new Object[][]{
                {4, 2, 2},
                {0, -1, 1},
                {8, 4, 4},
                {-1, 0, -1},
                {5, 2, 3}
        };
    }

    @Test(dataProvider = "testEquals")
    public void testEqualsFive(Object one, Object two, Object tree) {
        Assert.assertEquals((int)one, (int)Calculator.sum(two, tree), "Значения не равны!");
    }
}

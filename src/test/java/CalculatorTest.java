import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] dataEqualsSumm() {
        return new Object[][]{
                {"4", "2", "2"},
                {"0", "-1", "1"},
                {"2", "0.5", "1.5" },
                {"-100", "-100", "0"},
                {"-20", "-15.5", "-4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsSumm")
    public void testEqualsSumm(String one, String two, String tree) {
        Assert.assertEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '+'), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsSummNegative() {
        return new Object[][]{
                {"2", "2", "2"},
                {"5", "-1", "1"},
                {"4", "0.5", "1.5" },
                {"-10", "-100", "0"},
                {"-2", "-15.5", "-4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsSummNegative")
    public void testEqualsSummNegative(String one, String two, String tree) {
        Assert.assertNotEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '+'), "Значения равны!");
    }

    @DataProvider
    public Object[][] dataEqualsSubtract() {
        return new Object[][]{
                {"-4", "-2", "2"},
                {"-110", "-10", "100"},
                {"-1", "0.5", "1.5" },
                {"-100", "-100", "0"},
                {"-11", "-15.5", "-4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsSubtract")
    public void testEqualsSubtract(String one, String two, String tree) {
        Assert.assertEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '-'), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsSubtractNegative() {
        return new Object[][]{
                {"-7", "-2", "2"},
                {"-100", "-10", "100"},
                {"-2", "0.5", "1.5" },
                {"-9", "-100", "0"},
                {"-17", "-15.5", "-4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsSubtractNegative")
    public void testEqualsSubtractNegative(String one, String two, String tree) {
        Assert.assertNotEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '-'), "Значения равны!");
    }

    @DataProvider
    public Object[][] dataEqualsMultiply() {
        return new Object[][]{
                {"-4", "-2", "2"},
                {"-1000", "-10", "100"},
                {"0.75", "0.5", "1.5" },
                {"0", "10", "0"},
                {"0", "0", "4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsMultiply")
    public void testEqualsMultiply(String one, String two, String tree) {
        Assert.assertEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '*'), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsMultiplyNegative() {
        return new Object[][]{
                {"7", "-2", "2"},
                {"-1", "-10", "100"},
                {"75", "0.5", "1.5" },
                {"1", "10", "0"},
                {"2", "0", "4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsMultiplyNegative")
    public void testEqualsMultiplyNegative(String one, String two, String tree) {
        Assert.assertNotEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '*'), "Значения равны!");
    }

    @DataProvider
    public Object[][] dataEqualsDivide() {
        return new Object[][]{
                {"2", "-4", "-2"},
                {"-10", "-100", "10"},
                {"0.5", "1", "2" },
                {"0", "0", "4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsDivide")
    public void testEqualsDivide(String one, String two, String tree) {
        Assert.assertEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '/'), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsDivideNegative() {
        return new Object[][]{
                {"4", "-4", "-2"},
                {"-1", "-100", "10"},
                {"2", "1", "2" },
                {"3", "0", "4.5" }
        };
    }

    @Test(dataProvider = "dataEqualsDivideNegative")
    public void testEqualsDivideNegative(String one, String two, String tree) {
        Assert.assertNotEquals(Float.parseFloat(one), Calculator.calc(Float.parseFloat(two), Float.parseFloat(tree), '/'), "Значения равны!");
    }

    @Test
    public void testDivideByZero() {
        Assert.assertEquals("на 0 делить нельзя", (String)Calculator.calc(10, 0f, '/'), "Значения не равны!");
    }

    @Test
    public void testIncorrectOperator() {
        Assert.assertEquals("не верный оператор", (String)Calculator.calc(10, 0f, '#'), "Значения не равны!");
    }
}

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider
    public Object[][] dataEqualsSumm() {
        return new Object[][]{
                {4f, 2f, 2f},
                {0f, -1f, 1f},
                {2f, 0.5f, 1.5f},
                {-100f, -100f, 0f},
                {-20f, -15.5f, -4.5f}
        };
    }

    @Test(dataProvider = "dataEqualsSumm")
    public void testEqualsSumm(Float one, Float two, Float tree) {
        Assert.assertEquals(one, Calculator.calc(two, tree, "+"), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsSubtract() {
        return new Object[][]{
                {-4f, -2f, 2f},
                {-110f, -10f, 100f},
                {-1f, 0.5f, 1.5f},
                {-100f, -100f, 0f},
                {-11f, -15.5f, -4.5f}
        };
    }

    @Test(dataProvider = "dataEqualsSubtract")
    public void testEqualsSubtract(Float one, Float two, Float tree) {
        Assert.assertEquals(one, Calculator.calc(two, tree, "-"), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsMultiply() {
        return new Object[][]{
                {-4f, -2f, 2f},
                {-1000f, -10f, 100f},
                {0.75f, 0.5f, 1.5f},
                {0f, 10f, 0f},
                {0f, 0f, 4.5f}
        };
    }

    @Test(dataProvider = "dataEqualsMultiply")
    public void testEqualsMultiply(Float one, Float two, Float tree) {
        Assert.assertEquals(one, Calculator.calc(two, tree, "*"), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataEqualsDivide() {
        return new Object[][]{
                {2f, -4f, -2f},
                {-10f, -100f, 10f},
                {0.5f, 1f, 2f},
                {0f, 0f, 4.5f}
        };
    }

    @Test(dataProvider = "dataEqualsDivide")
    public void testEqualsDivide(Float one, Float two, Float tree) {
        Assert.assertEquals(one, Calculator.calc(two, tree, "/"), "Значения не равны!");
    }

    @DataProvider
    public Object[][] dataNegative() {
        return new Object[][]{
                {"на 0 делить нельзя", 10f, 0f, "/"},
                {"не верный оператор", 10f, 1f, "#"},
                {"не верный оператор", 10f, 1f, " "},
                {"не верный оператор", 10f, 1f, ""},
                {"не верный оператор", 10f, 1f, "++"},
                {"не верный оператор", 10f, 1f, "Текст"},
                {"не верный оператор", 10f, 1f, "F"}

        };
    }

    @Test(dataProvider = "dataNegative")
    public void testNegative(Object one, Object two, Object tree, Object four) {
        Assert.assertEquals(one, Calculator.calc(two, tree, four), "Значения не равны!");
    }
}

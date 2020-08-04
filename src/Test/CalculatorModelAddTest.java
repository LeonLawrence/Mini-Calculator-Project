package Test;

import com.company.Model.CalculatorModelAdd;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorModelAddTest {
    @Test
    public void canAddNumbers() {
        CalculatorModelAdd calculatorModelAdd = new CalculatorModelAdd();
        calculatorModelAdd.addTwoNumbers(10, 5);
        assertEquals(15, calculatorModelAdd.getCalculation());
    }
}

package Test;

import com.company.Model.CalculatorModelAdd;
import com.company.Model.CalculatorModelMinus;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorModelMinusTest {

    @Test
    public void canAddNumbers() {
        CalculatorModelMinus calculatorModelMinus = new CalculatorModelMinus();
        calculatorModelMinus.minusTwoNumbers(30, 20);
        assertEquals(10, calculatorModelMinus.getCalculation());
    }
}

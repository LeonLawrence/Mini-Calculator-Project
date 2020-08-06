package Test;

import com.company.Model.CalculatorModel;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorModelTest {
    private CalculatorModel model = new CalculatorModel();

    @Test
    public void canAdd() {
        model.addTwoNumber(10, 15);
        assertEquals(25, model.getCalculation());
    }

    @Test
    public void canMinus() {
        model.minusTwoNumber(30, 10);
        assertEquals(20, model.getCalculation());
    }
}

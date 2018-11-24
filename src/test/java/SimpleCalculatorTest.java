import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void add() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(2);
        cal.add(2);
        cal.add(2);

        Assert.assertEquals(6, cal.value);
    }

    @Test
    public void substract() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(8);
        cal.add(10);
        cal.substract(5);
        cal.substract(3);

        Assert.assertEquals(10, cal.value);
    }

    @Test
    public void multiply() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(15);
        cal.add(4);
        cal.multiply(2);
        cal.multiply(3);

        Assert.assertEquals(114, cal.value);
    }

    @Test
    public void divide() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(13);
        cal.add(17);
        cal.divide(2);
        cal.divide(2);

        Assert.assertEquals(7, cal.value);
    }

    @Test
    public void all_operations_combinations() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(13);
        cal.add(17);
        cal.divide(2);
        cal.substract(5);
        cal.multiply(3);

        Assert.assertEquals(30, cal.value);
    }

    @Test
    public void absolute_zero_or_negative_number() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(10);
        cal.divide(2);
        cal.substract(5);

        Assert.assertEquals(0, cal.getSign());
    }

    @Test
    public void convert_to_absolute_value() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.add(38);
        cal.divide(2);
        cal.substract(24);
        cal.abs();

        Assert.assertEquals(5, cal.value);

    }

    @Test
    public void factorial() {

        SimpleCalculator cal = new SimpleCalculator(0);
        cal.factorial();

        Assert.assertEquals(1,cal.value);

    }

    @Test
    public void power() {

        SimpleCalculator cal = new SimpleCalculator(5);
        cal.power(3);

        Assert.assertEquals(125,cal.value);



    }
}
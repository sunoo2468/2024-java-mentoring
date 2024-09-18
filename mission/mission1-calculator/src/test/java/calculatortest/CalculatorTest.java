package calculatortest;

import domain.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("add 테스트")
    public void testAdd() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 5;
        int secondNumber = 15;
        int expected = 20;

        //when
        int result = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("subtract 테스트")
    public void testSubtract() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 15;
        int secondNumber = 5;
        int expected = 10;

        //when
        int result = calculator.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("multiply 테스트")
    public void testMultiply() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 5;
        int secondNumber = 15;
        int expected = 75;

        //when
        int result = calculator.multiply(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("divide 테스트")
    public void testDivide() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 15;
        int secondNumber = 5;
        int expected = 3;

        //when
        int result = calculator.divide(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("divide Exception 발생 테스트")
    public void testDivideException() {
        Calculator calculator = new Calculator();

        //given
        int firstNumber = 1;
        int secondNumber = 0;
        Spring expected = "Division by zero"

        //when
        ArithmeticException arithmeticException =
                assertThrows(ArithmeticException.class, () -> calculator.divide(firstnumber, secondNumber));

        //then
        assertEquals(expected, arithmeticException.getMessage());
    }

}
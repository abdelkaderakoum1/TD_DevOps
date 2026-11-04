package fr.insa.ws.soap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addAddsTheTwoNumbers() {
        Calculator.Add parameters = new Calculator.Add();
        parameters.intA = 6;
        parameters.intB = 3;
        assertEquals(9, calculator.Add(parameters).AddResult);
    }

    @Test
    void substractSubtractsTheSecondNumberFromTheFirst() {
        Calculator.Substract parameters = new Calculator.Substract();
        parameters.intA = 6;
        parameters.intB = 3;
        assertEquals(3, calculator.Substract(parameters).SubstractResult);
    }

    @Test
    void multiplyMultipliesTheTwoNumbers() {
        Calculator.Multiply parameters = new Calculator.Multiply();
        parameters.intA = 6;
        parameters.intB = 3;
        assertEquals(18, calculator.Multiply(parameters).MultiplyResult);
    }

    @Test
    void divideDividesTheFirstNumberByTheSecond() {
        Calculator.Divide parameters = new Calculator.Divide();
        parameters.intA = 6;
        parameters.intB = 3;
        assertEquals(2, calculator.Divide(parameters).DivideResult);
    }

    @Test
    void divideByZeroThrowsAnError() {
        Calculator.Divide parameters = new Calculator.Divide();
        parameters.intA = 6;
        parameters.intB = 0;
        assertThrows(ArithmeticException.class, () -> calculator.Divide(parameters));
    }
}

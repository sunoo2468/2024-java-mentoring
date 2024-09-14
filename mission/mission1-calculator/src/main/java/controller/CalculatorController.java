package controller;

import domain.Calculator;
import view.InputView;
import view.OutputView;

public class CalculatorController {
    private Calculator calculator;
    private InputView inputView;
    private OutputView outputView;

    public CalculatorController(Calculator calculator, InputView inputView, OutputView outputView) {
        this.calculator = calculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void controllerStart() {
        calculator = new Calculator();
        inputView = new InputView();
        outputView = new OutputView();

        int num1 = inputView.num1();
        int num2 = inputView.num2();

        outputView.print(calculator.add(num1, num2));
        outputView.print(calculator.subtract(num1, num2));
        outputView.print(calculator.multiply(num1, num2));
        outputView.print(calculator.divide(num1, num2));
    }
}

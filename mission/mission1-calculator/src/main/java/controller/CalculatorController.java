package controller;

import domain.Calculator;
import view.InputView;
import view.OutputView;

public class CalculatorController {
    private final Calculator calculator;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(Calculator calculator, InputView inputView, OutputView outputView) {
        this.calculator = calculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void controllerStart(Calculator calculator, InputView inputView, OutputView outputView) {

        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        outputView.print(calculator.add(firstNumber, secondNumber));
        outputView.print(calculator.subtract(firstNumber, secondNumber));
        outputView.print(calculator.multiply(firstNumber, secondNumber));
        outputView.print(calculator.divide(firstNumber, secondNumber));
    }
}

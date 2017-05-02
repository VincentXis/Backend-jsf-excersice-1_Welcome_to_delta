package pagebeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CalculatorBean {
    private double inputNumber1;
    private double inputNumber2;
    private double result;
    private char chosenOperator;


    // Operations

    // Set
    public void setInputNumber1(double inputNumber1) {
        this.inputNumber1 = inputNumber1;
    }

    public void setInputNumber2(double inputNumber2) {
        this.inputNumber2 = inputNumber2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setChosenOperator(char chosenOperator) {
        this.chosenOperator = chosenOperator;
    }

    // Get
    public double getInputNumber1() {
        return inputNumber1;
    }

    public double getInputNumber2() {
        return inputNumber2;
    }

    public double getResult() {
        return result;
    }

    public char getChosenOperator() {
        return chosenOperator;
    }

    public String showResult() {
        return "result: " + getInputNumber1() +" "+ getInputNumber2();
    }
}

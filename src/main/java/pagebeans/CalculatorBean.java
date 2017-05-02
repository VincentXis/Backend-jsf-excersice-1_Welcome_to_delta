package pagebeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CalculatorBean {
    private double inputNumber1;
    private double inputNumber2;
    private double result;
    private char chosenOperator = '\0';


    // Operations
    public void doOperation() {
        switch (getChosenOperator()) {
            case '+':
                setResult(getInputNumber1() + getInputNumber2());
                break;
            case '-':
                setResult(getInputNumber1() - getInputNumber2());
                break;
            case '*':
                setResult(getInputNumber1() * getInputNumber2());
                break;
            case '/':
                setResult(getInputNumber1() / getInputNumber2());
                break;
            default:
                break;
        }
    }
    public void clearValues(){
        setInputNumber1(0);
        setInputNumber2(0);
        setChosenOperator('\0');
        setResult(0);
    }

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
        if (getChosenOperator() != '\0') {
            doOperation();
            return "result for: " + getInputNumber1() + " " + getChosenOperator() + " " + getInputNumber2() + " is: " + getResult();
        } else {
            return "";
        }
    }
}

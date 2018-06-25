public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public int firstNumber() {
        return this.firstNumber;
    }

    public int secondNumber() {
        return this.secondNumber;
    }

    public int addingNumbers() {
        int sum = this.firstNumber + this.secondNumber;
        return sum;
    }


    public int subtractingNumbers() {
        int result = this.firstNumber - this.secondNumber;
        return result;
    }
}

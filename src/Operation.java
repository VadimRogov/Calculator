public class Operation {
    double x = 0;
    public double oper(Double operand1, Double operand2, char operation){
        switch(operation) {
            case 'a':
                break;
            case 'c':
                x = 0;
                break;
            case '+':
                x = operand1 + operand2;
                break;
            case '-':
                x = operand1 - operand2;
                break;
            case '*':
                x = operand1 * operand2;
                break;
            case '/':
                x = operand1 / operand2;
                break;
            default:
                System.out.println("Неподдержиааемая операция");
        }return x;
    }
}
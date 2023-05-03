import java.util.Scanner;

class logicCl {
    public static void logic() throws NumberFormatException{
        boolean isBoolean = true;
        double x = 0;
        Operation op = new Operation();
        Scanner scanner = new Scanner(System.in);
        char operation = '0';
        String number1 = "";
        String number2 = "";
        int count = 0;

        while(isBoolean) {
            if (count == 0 && operation != 'c' && !number1.equals("c") && !number2.equals("c")) {
                System.out.print("Введите первое число: ");
                number1 = scanner.next();
                count++;
            }

            if (number1.equals("s")) {
                isBoolean = false;
            } else {
                System.out.print("Введите операцию(+, -, *, /): ");
                operation = scanner.next().charAt(0);
                if (operation == 'c') {
                    logic();
                }
                if (operation != 's') {
                    System.out.print("Введите второе число: ");
                    number2 = scanner.next();
                    number1 = String.valueOf(op.oper(Double.valueOf(number1), Double.valueOf(number2), operation));
                    System.out.println(number1);
                } else if(number2.equals("s")){
                    isBoolean = false;
                }
            }
        }
    }
}
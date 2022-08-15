import java.util.Scanner;

class calculator {
    public static void main(String args[]) {

        boolean run = false;
        while (!run) {
            Scanner calculator = new Scanner(System.in);

            double num2, num1, answer;
            System.out.println("Enter first number: ");
            num1 = calculator.nextDouble();

            System.out.println("Enter the operator(+,-,*,/) ");
            char operator = calculator.next().charAt(0);

            System.out.println("Enter second number: ");
            num2 = calculator.nextDouble();


            switch (operator) {
                case '+':
                    System.out.println(answer = num1 + num2);
                    break;
                case '-':
                    System.out.println(answer = num1 - num2);
                    break;
                case '*':
                    System.out.println(answer = num1 * num2);
                    break;
                case '/':
                    System.out.println(answer = num1 / num2);
                    break;



            }
        }
    }
}


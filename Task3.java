// 3* В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> array = new Stack<>();
        int number1, number2 = 0;
        String command = "";

        while (!command.equals("q")) {

            System.out.println("Выберите операцию: +, -, /, %, *, r");
            command = sc.nextLine();
            if (!command.equals("r")) {
                System.out.println("Введите первое число: ");
                number1 = sc.nextInt();
                sc.nextLine();

                System.out.println("Введите второе число: ");
                number2 = sc.nextInt();
                sc.nextLine();

                if (command.equalsIgnoreCase("+")) {
                    array.push(number1 + number2);
                } else if (command.equalsIgnoreCase("-")) {
                    array.push(number1 - number2);
                } else if (command.equalsIgnoreCase("*")) {
                    array.push(number1 * number2);
                } else if (command.equalsIgnoreCase("%")) {
                    array.push(number1 % number2);
                } else if (command.equalsIgnoreCase("/")) {
                    array.push(number1 / number2);
                }
            }
            else {
                array.pop();
            }

            System.out.println("Результат: " + array);
        }
    }
}
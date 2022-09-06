import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите числа и операторы через пробел:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        String[] arr = string.split(" ");
        try {
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Неверно введены данные");
                System.exit(0);
            }
            if (arr.length == 5) {
                int num3 = Integer.parseInt(arr[4]);
                if (num3 < 1 || num3 > 10) {
                    System.out.println("Неверно введены данные");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println("Неверно введены данные");
            System.exit(0);
        }

        if (arr.length == 3) {
            if (arr[1].equals("+") || arr[1].equals("-") || arr[1].equals("*") || arr[1].equals("/")) {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[2]);
                String sign1 = arr[1];
                switch (sign1) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / (float) num2);
                        break;
                }
            } else {
                System.out.println("Неверно введены данные");
                System.exit(0);
            }
        }

        if (arr.length == 5) {
            if ((arr[1].equals("+") || arr[1].equals("-") || arr[1].equals("*") || arr[1].equals("/")) &&
                    (arr[3].equals("+") || arr[3].equals("-") || arr[3].equals("*") || arr[3].equals("/"))) {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[2]);
                int num3 = Integer.parseInt(arr[4]);
                String sign1 = arr[1];
                String sign2 = arr[3];
                if (sign1.equals("+")) {
                    switch (sign2) {
                        case "+":
                            System.out.println(num1 + num2 + num3);
                            break;
                        case "-":
                            System.out.println(num1 + num2 - num3);
                            break;
                        case "*":
                            System.out.println(num1 + (num2 * num3));
                            break;
                        case "/":
                            System.out.println(num1 + (num2 / (float) num3));
                            break;
                    }
                } else if (sign1.equals("-")) {
                    switch (sign2) {
                        case "+":
                            System.out.println(num1 - num2 + num3);
                            break;
                        case "-":
                            System.out.println(num1 - num2 - num3);
                            break;
                        case "*":
                            System.out.println(num1 - (num2 * num3));
                            break;
                        case "/":
                            System.out.println(num1 - (num2 / (float) num3));
                            break;
                    }
                } else if (sign1.equals("*")) {
                    switch (sign2) {
                        case "+":
                            System.out.println((num1 * num2) + num3);
                            break;
                        case "-":
                            System.out.println((num1 * num2) - num3);
                            break;
                        case "*":
                            System.out.println(num1 * num2 * num3);
                            break;
                        case "/":
                            System.out.println(num1 * num2 / (float) num3);
                            break;
                    }
                } else if (sign1.equals("/")) {
                    switch (sign2) {
                        case "+":
                            System.out.println((num1 / num2) + num3);
                            break;
                        case "-":
                            System.out.println((num1 / num2) - num3);
                            break;
                        case "*":
                            System.out.println(num1 / (float) num2 * num3);
                            break;
                        case "/":
                            System.out.println(num1 / (float) num2 / num3);
                            break;
                    }
                }
            } else {
                System.out.println("Неверно введены данные");
                System.exit(0);
            }
        }
    }
}

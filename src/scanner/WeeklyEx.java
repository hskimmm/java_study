package scanner;

import java.util.Scanner;

public class WeeklyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 / 0.종료");
            int number = scanner.nextInt();

            if(number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (number < 5) {
                System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                int firstNumber = scanner.nextInt();
                System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                int secondNumber = scanner.nextInt();
                if (number == 1) {
                    System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
                } else if (number == 2) {
                    System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
                } else if (number == 3) {
                    System.out.println(firstNumber + "X" + secondNumber + "=" + (firstNumber * secondNumber));
                } else if (number == 4) {
                    double resultValue =  (double) firstNumber / secondNumber;
                    System.out.println(firstNumber + "/" + secondNumber + "=" + String.format("%.1f", resultValue));
                }
            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
    }
}

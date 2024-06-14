package exception.ex;

import java.util.Scanner;

public class QuizEx1 {
    /*
        사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요.
        이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여 적절한 메시지를 출력하세요.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int firstNumber = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int secondNumber = scanner.nextInt();

            System.out.println("두 수의 나눗셈 = " + firstNumber / secondNumber);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
        } finally {
            scanner.close();
        }

    }
}

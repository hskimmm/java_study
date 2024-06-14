package exception.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizEx2 {
    /*
        사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요.
        이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력하세요.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수 배열의 크기를 입력하세요 : ");
            int arrayIndexNumber = scanner.nextInt();
            int[] intArr = new int[arrayIndexNumber];

            System.out.println("배열의 요소를 입력하세요 : ");
            for (int i = 0; i < arrayIndexNumber; i++) {
                intArr[i] = scanner.nextInt();
            }

            //출력
            for (int i : intArr) {
                System.out.print(i + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스의 길이를 초과했습니다.");
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}

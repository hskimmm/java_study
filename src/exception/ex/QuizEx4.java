package exception.ex;

import java.util.Scanner;

public class QuizEx4 {
    /*
        사용자로부터 문자열을 입력받아 정수로 변환하는 프로그램을 작성하세요.
        이때, 입력된 문자열이 정수로 변환될 수 없는 경우 NumberFormatException을 처리하여 적절한 메시지를 출력하세요.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("문자열을 입력 하세요 : ");
            String str = scanner.nextLine();

            int numCasting = Integer.parseInt(str);
            System.out.println("문자열을 정수로 변환 = " + numCasting);
        } catch (NumberFormatException e) {
            System.out.println("문자열을 정수로 변환할 수 없습니다.");
        } finally {
            scanner.close();
        }
    }
}

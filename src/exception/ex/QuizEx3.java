package exception.ex;

import exception.custom.InvalidAgeException;

import java.util.Scanner;

public class QuizEx3 {
    /*
        사용자로부터 이름과 나이를 입력받아 Person 객체를 생성하는 프로그램을 작성하세요.
        이때, 나이가 음수이면 InvalidAgeException(사용자 정의 예외)을 발생시키고 적절한 메시지를 출력하세요.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("사용자의 이름을 입력하세요 : ");
            String userName = scanner.nextLine();
            System.out.print("사용자의 나이를 입력하세요 : ");
            int userAge = scanner.nextInt();

            Person person = new Person(userName, userAge);

            person.inputUserForm();
            person.printUserInfo();

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

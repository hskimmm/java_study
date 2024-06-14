package exception.ex;

import exception.custom.InvalidAgeException;

public class Person {
    private String userName;
    private int userAge;

    public Person(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public void inputUserForm() throws InvalidAgeException{
        if(userAge < 0) {
            throw new InvalidAgeException("음수를 입력할 수 없습니다.");
        }
    }

    public void printUserInfo() {
        System.out.println("사용자의 이름은 = " + userName + "이고," + " 사용자의 나이는 = " + userAge + " 입니다.");
    }
}

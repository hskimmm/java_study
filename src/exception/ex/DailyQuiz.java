package exception.ex;

import exception.custom.DailyQuizException;

public class DailyQuiz {
    private String message;

    public void inputMessage(String message) throws DailyQuizException{
        if(!message.equals("DailyQuiz")) {
            throw new DailyQuizException("DailyQuiz 문자열이 아닙니다.");
        }
        this.message = message;
    }

    public void printMessage(){
        System.out.println("메시지 = " + message);
    }
}

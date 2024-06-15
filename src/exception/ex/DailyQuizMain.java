package exception.ex;

import exception.custom.DailyQuizException;

public class DailyQuizMain {
    public static void main(String[] args){
        DailyQuiz dailyQuiz = new DailyQuiz();

        try {
            dailyQuiz.inputMessage("WeeklyQuiz");
            dailyQuiz.printMessage();
        } catch (DailyQuizException e) {
            System.out.println(e.getMessage());
        }
    }
}

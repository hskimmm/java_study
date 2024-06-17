package interfaces.ex1;

public class SamsungPhone implements Phone{
    @Override
    public String call() {
        return "삼성 핸드폰으로 전화를 겁니다.";
    }

    @Override
    public String answerThePhone() {
        return "삼성 핸드폰으로 전화를 받습니다.";
    }
}

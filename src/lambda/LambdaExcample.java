package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaExcample {
    public static void main(String[] args) {
        /*
            람다 표현식
            익명 함수를 생성하기 위한 표현식이다.
            람다 표현식을 사용하면 코드를 간결하게 작성할 수 있고, 가독성을 높일 수 있다.

            람다 표현식 문법
            (매개변수 목록) -> {실행문}

            매개변수 목록 : 함수에 전달되는 매개변수를 뜻한다. 매개변수가 없는 경우 ()(빈 괄호)를 사용한다.
            > : 람다 표현식을 나타내는 기호이다.
            실행문 : 함수의 본문을 나타낸다. 실행문이 한 줄인 경우 {}(중괄호)를 생략할 수 있다.
        */
        
        //기존 메서드 사용 방법1
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        callList(list);

        //기존 메서드 사용 방법2
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            int number = iterator.next();
            if(number % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("기존 메서드 = " + numbers);


        //람다 표현식 방법
        numbers.removeIf((number) -> number % 2 == 0);
        System.out.println("람다 = " + numbers);
    }

    public static void callList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

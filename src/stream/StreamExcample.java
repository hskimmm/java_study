package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExcample {
    public static void main(String[] args) {
        /*
            스트림 API
            Java 8에서 도입되었다.
            컬렉션, 배열 등의 데이터를 함수형 프로그래밍 스타일로 처리할 수 있는 기능을 제공한다.
            Stream은 데이터의 흐름을 나타내며, 중간 연산과 최종 연산을 통해 데이터를 처리할 수 있다.
            Stream은 원본 데이터를 변경하지 않으며(중요!!!!!), 내부 반복을 통해 코드의 가독석광 유지보수성을 향상 시킨다.

            스트림 생성
            1. 컬렉션에서 스트림 생성 - 컬렉션을 통한 스트림 생성이 제일 많이 사용된다.
            2. 배열에서 스트림 생성
            3. 직접 스트림 생성

            중간연산
            중간연산은 Stream을 변환하고 필터링하는 등의 작업을 한다.
            중간연산은 lazy evaluation으로 이루어지며, 최종 연산이 호출될 때까지 실행되지 않습니다.
            
            최종연산
            최종 연산은 Stream을 소비하여 결과를 생성합니다.
            최종 연산이 호출되면 Stream이 닫히며, 더 이상 사용할 수 없습니다.
        */

        //컬렉션에서 스트림 생성(제일 많이 사용하는 방법)
        List<Integer> numbers = Arrays.asList(1,23,40,34,5);

        numbers.stream()
            .filter(num -> num % 2 == 0) //중간연산 - filter의 조건에 맞는 값 들만 리스트에 담는다.(짝수들만 리스트에 나와야 된다.)
            .map(num -> num * 2) //중간 연산 - filter로 걸러져 리스트에 담긴 값에 *2를 한다.
            .sorted() //중간 연산 - 요소를 정렬한다.(오름차순)
            .forEach(num -> System.out.println("numbers = " + num)); //최종연산 - foreach 반복문을 통해 필터에서 거른 값들을 출력한다.

        //map, coolect 사용
        List<Integer> collect = numbers.stream()
            .map(num -> num * 2) //중간연산 - numbers 리스트에 담겨있는 값들을 map을 통해 *2 해준다
            .collect(Collectors.toList()); //최종연산 - 컬렉션이나 다른 형태로 변환

        for (Integer i : collect) {
            System.out.println("collect = " + i);
        }

        //오름차순 정렬
        numbers.stream()
            .sorted() //중간연산 - 데이터 오름차순 정렬
            .forEach(num -> System.out.println("sorted = " + num)); //최종연산 - 반복문을 통해 데이터 출력

        //홀수 필터링하기
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumber = numbers2.stream()
                                    .filter(number -> number % 2 != 0) //중간연산
                                    .collect(Collectors.toList()); //최종연산

        System.out.println("홀수 출력 = " + numbers2); // 출력시 기존값나옴 -> 이유는 스트림은 원본 데이터를 건드리지 않기 떄문에
        System.out.println("홀수 출력 = " + oddNumber);

        //문자열 길이 매핑하기
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
        List<Integer> wordLengths = words.stream()
                                        .map(String::length)
                                        .collect(Collectors.toList());

        System.out.println("문자열 길이: " + wordLengths);

        //단어 수 세기
        String sentence = "Java Stream API Example";
        long wordCount = Arrays.stream(sentence.split(" "))
                                            .count();

        System.out.println("단어의 수 = " + wordCount);

        //정수 리스트에서 홀수만 필터링하여 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intList.stream()
                .filter(numList -> numList % 2 != 0)
                .forEach(numList -> System.out.println("홀수 출력 = " + numList));

        //문자열 리스트에서 길이가 5 이하인 문자열만 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
        List<String> strList = Arrays.asList("김나다", "나다라마바", "박나다", "가나다라마바사아");
        List<String> resultList = strList.stream()
                                    .filter(word -> word.length() <= 5)
                                    .collect(Collectors.toList());

        System.out.println("길이가 5 이하인 문자열 = " + resultList);

    }
}

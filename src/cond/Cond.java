package cond;

public class Cond {
    public static void main(String[] args) {
        /*
            당신은 두 개의 정수 변수 a와 b를 가지고 있습니다. 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요:

            1. a가 b보다 크면 "a is greater than b"를 출력합니다.
            2. a와 b가 같으면 "a and b are equal"을 출력합니다.
            3. a가 b보다 작으면 "a is less than b"를 출력합니다.

            예를 들어, a = 5, b = 3일 경우 "a is greater than b"를,
            a = 2, b = 2일 경우 "a and b are equal"을,
            그리고 a = 1, b = 4일 경우 "a is less than b"를 출력해야 합니다.
        */

        int a = 2;
        int b = 2;

        if(a > b){
            System.out.println("a is greater than b");
        }else if(a == b){
            System.out.println("a and b are equal");
        }else if(a < b){
            System.out.println("a is less than b");
        }

        /*
            - 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자)
            - 변수 score에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
                - 90점 이상: A
                - 80점 이상 90점 미만: B
                - 70점 이상 80점 미만: C
                - 60점 이상 70점 미만: D
                - 60점 미만: F
            - 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하세요.
                - 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해
            - 변수 a에 10, b에 20, c에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요.
            - 변수 passScore에 60이 저장되어 있습니다. 변수 myScore에 75가 저장되어 있을 때, myScore가 passScore 이상인지 판별하여 합격/불합격을 출력하는 코드를 작성하세요. (삼항연산자)
        */

        //문제1
        int x = -1;
        if(x > 0){
            System.out.println("양수");
        }else if(x < 0){
            System.out.println("음수");
        }else if(x == 0){
            System.out.println("0");
        }
        System.out.println((x > 0) ? "양수" : (x == 0) ? "0" : "음수");


        //문제2
        int score = 59;

        if(score >= 90){
            System.out.println("당신의 학점은 A");
        }else if(score >= 80){
            System.out.println("당신의 학점은 B");
        }else if(score >= 70){
            System.out.println("당신의 학점은 C");
        }else if(score >= 60){
            System.out.println("당신의 학점은 D");
        }else{
            System.out.println("당신의 학점은 F");
        }

        //문제3
        int year = 2024;

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }

        //문제4
        int c = 10;
        int d = 20;
        int e = 30;

        if(c >= b && c >= e){
            System.out.println(c);
        }else if(d >= c && d >= e){
            System.out.println(d);
        }else{
            System.out.println(e);
        }

        //문제5
        int passScore = 60;
        int myScore = 75;
        System.out.println((myScore > passScore)? "합격" : "불합격");

        //문제6
        int three = 3;
        int five = 5;
        int two = 2;
        boolean result = (five > three) || (five < two) && (five < three);
        System.out.println(result); // true (and 계산후 or 계산)

        /*
            ### 문제: 요일에 따른 활동 제안하기!

            목표: 프로그램 내에서 미리 지정된 요일에 따라 적합한 활동을 제안하는 프로그램을 작성하세요.

            조건:

            1. 요일은 프로그램 내에서 문자열 변수로 미리 정의합니다 (예: "수요일").
            2. `switch` 문을 사용하여 각 요일에 따른 활동을 제안합니다.
                - 예: "월요일"에는 "책 읽기", "금요일"에는 "영화 보기" 등
            3. 일치하는 요일이 없으면 "알 수 없는 요일"이라는 메시지를 출력합니다.
        */

        String day = "금";

        switch (day){
            case "월" :
                System.out.println("책읽기");
                break;
            case "금" :
                System.out.println("영화보기");
                break;
            default:
                System.out.println("알 수 없는 요일");
        }

        //문제2
        char grade = 'A';

        switch (grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Good");
                break;
            case 'C' :
                System.out.println("Average");
                break;
            case 'D' :
                System.out.println("Below Average");
                break;
            case 'F' :
                System.out.println("Fail");
            default:
                System.out.println("알 수 없는 성적입니다.");
        }

        //문제3
        char operator = '/';
        int num1 = 20;
        int num2 = 30;
        switch (operator){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("알 수 없는 연산 부호입니다.");
        }
        
        //문제4
        String color = "red";
        
        switch (color){
            case "red" :
                System.out.println("Apple");
                break;
            case "green" :
                System.out.println("Grass");
                break;
            case "blue" :
                System.out.println("Sky");
                break;
            default:
                System.out.println("알 수 없는 문자입니다.");
        }

        //문제5
        int scores = 60;

        switch (scores/10){
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}

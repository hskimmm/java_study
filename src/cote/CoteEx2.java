package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoteEx2 {
    public static void main(String[] args) {
        /*
            문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
            단, 재귀 함수를 이용하여 풀어보세요.
        */
        String str = "hello";
        System.out.println("printAt = " + printAt(str));

        /*
            경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
            만약 당신의 속도가 60 이하라면 벌금은 없습니다.
            속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
            속도가 81 이상이라면 벌금은 200원입니다.
            단, 휴일인 경우 속도 한도가 5 더 높아집니다.

            속도가 60 이하라면 벌금은 0원입니다.
            속도가 61 이상이라면 벌금은 100원입니다.
            만약 휴일이라면 속도가 65라도 벌금은 0원입니다.
        */
        System.out.println("speedRacer = " + speedRacer(86, true));

        /*
            세 개의 정수 a, b, c가 주어졌을 때,
            두 개의 정수를 더해서 세 번째 정수를 만들 수 있으면 true를 반환하는 코드를 작성합니다.
            메서드 본문은 단 한 줄의 코드로 작성되어야 합니다.
        */
        int a, b, c;
        a = 3;
        b = 2;
        c = 2;
        System.out.println("twoSumOne = " + twoSumOne(a, b, c));

        /*
            세 개의 정수 first, second, third가 주어졌을 때,
            second가 first보다 크고 third가 second보다 크면 true를 반환하는 코드를 작성하세요.
            단, 마지막 opt 파라미터가 true인 경우에는 second가 first보다 크지 않아도 되지만,
            여전히 third보다는 작아야 합니다.
        */
        System.out.println("isOrdered = " + isOrdered(1, 2, 4, false)); // true
        System.out.println("isOrdered = " + isOrdered(1, 2, 1, false)); // false
        System.out.println("isOrdered = " + isOrdered(1, 1, 2, true));  // true

        /*
            어떤 숫자가 11의 배수이거나 11의 배수보다 1 큰 숫자라면, 그 숫자를 "cool"하다고 하겠습니다.
            주어진 0 이상의 숫자가 cool하다면 true를 반환하세요.
        */
        System.out.println("isCool = " + isCool(11));
        System.out.println("isCool = " + isCool(12));
        System.out.println("isCool = " + isCool(13));
        System.out.println("isCool = " + isCool(22));
        System.out.println("isCool = " + isCool(23));
        System.out.println("isCool = " + isCool(24));

        /*
            정수 n이 주어졌을 때, 숫자를 문자열 형태로 변환하고 뒤에 "!"를 붙여 반환하세요.
            예를 들어, 정수가 13인 경우 이 메서드는 "13!"을 반환해야 합니다.
            하지만, 숫자가 3으로 나누어 떨어지면 숫자 대신 "새콤!"를 반환하고,
            5로 나누어 떨어지면 "달콤!"를 반환하며, 3과 5 모두로 나누어 떨어지면
            "새콤달콤!"를 반환해야 합니다.
        */
        System.out.println("secomDalcom = " + secomDalcom(15));
        System.out.println("secomDalcom = " + secomDalcom(10));
        System.out.println("secomDalcom = " + secomDalcom(3));
        System.out.println("secomDalcom = " + secomDalcom(11));

        /*
            3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
            하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
            기본적으로 중복되지 않는 숫자만 합산합니다.
        */
        System.out.println("sumUnique = " + sumUnique(1, 2, 3)); // 6
        System.out.println("sumUnique = " + sumUnique(3, 2, 3)); // 2
        System.out.println("sumUnique = " + sumUnique(3, 3, 3)); // 0

        /*
            주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.
        */
        System.out.println("repeatChar = " + repeatChar("The")); // "TThhee"
        System.out.println("repeatChar = " + repeatChar("AAbb")); // "AAAAbbbb"
        System.out.println("repeatChar = " + repeatChar("Hi-There")); // "HHii--TThheerree"

        /*
            주어진 문자열에서 모든 별표()와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
            예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.
        */
        System.out.println("starSideDel = " + starSideDel("cd*zq")); // "cq"
        System.out.println("starSideDel = " + starSideDel("ab**cd")); // "ad"
        System.out.println("starSideDel = " + starSideDel("wacy*xko")); // "wacko"
        System.out.println("starSideDel = " + starSideDel("ab*c*d")); // "a"
    }

    public static String printAt(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "@" + printAt(str.substring(1));
    }

    public static int speedRacer(int speed, boolean isHoliday){
        int penalty = 0;

        //휴일인 경우
        if(isHoliday) {
            speed -= 5;
        }

        if (speed >= 61 && speed <= 80) {
            penalty = 100;
        } else if (speed >= 81) {
            penalty = 200;
        }

        return penalty;
    }

    public static boolean twoSumOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public static boolean isOrdered(int first, int second, int third, boolean opt) {
        if(opt) {
            return third > second;
        }

        return second > first && third > second;
    }

    public static boolean isCool(int num) {

        if(num % 11 == 0 || num % 11 == 1) {
            return true;
        }

        return false;
    }

    public static String secomDalcom(int n) {
        boolean secom = n % 3 == 0;
        boolean dalcom = n % 5 == 0;

        if(secom && dalcom) {
            return "새콤달콤!";
        }

        if(secom) {
            return "새콤!";
        }

        if(dalcom) {
            return "달콤!";
        }

        return n + "!"; // 문자형 자료형이랑 다른 자료형을 연산하면 자동으로 문자형 자료형으로 변환한다.
    }

    public static int sumUnique(int a, int b, int c) {

        if(a == b && b == c) return 0;
        if(a == b) return c;
        if(a == c) return b;
        if(b == c) return a;

        return a + b + c;
    }

    public static String repeatChar(String str) {

        String[] result = str.split("");
        String concat = "";

        for(int i = 0; i < result.length; i++) {
            concat += result[i].concat(result[i]);
        }

        return concat;
    }

    public static String starSideDel(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                i++;
                continue;
            }

            if((i == 0 || str.charAt(i - 1) != '*') && (i == str.length() -1 || str.charAt(i + 1) != '*')) {
                result += String.valueOf(str.charAt(i));
            }
        }

        return result;
    }
}


package type;

public class StringType {
    public static void main(String[] args) {
        //=================================== 1.문자열 타입 내장 메서드 ===================================

        /*
            indexOf
            특정 문자열이 시작되는 위치(인덱스값)를 반환한다.
        */
        String a = "IndexOf!";
        System.out.println("IndexOf = " + a.indexOf("!")); //7
        System.out.println("IndexOf = " + a.indexOf("d")); //2

        /*
            contains
            문자열에서 특정 문자열이 포함 되었는지 여부를 반환한다.
        */
        String b = "Contains!";
        System.out.println("contains = " + b.contains("!")); //true
        System.out.println("contains = " + b.contains("d")); //false
        System.out.println("contains = " + b.contains("c")); //false

        /*
            charAt
            문자열에서 특정 위치의 문자를 반환하다.
        */
        String c = "CharAt!";
        System.out.println("CharAt = " + c.charAt(0)); //C
        System.out.println("CharAt = " + c.charAt(6)); //!

        /*
            replaceAll
            특정 문자열을 다른 문자열로 바꿀때 사용한다.
        */
        String d = "Replace All!";
        System.out.println("replaceAll = " + d.replaceAll("All!", "")); //Replace
        System.out.println("replaceAll = " + d.replaceAll("!", "!!")); //Replace All!!
        
        /*
            substring
            문자열에서 특정 문자열을 뽑아낼 때 사용한다.
        */
        String e = "Substring!";
        System.out.println("Substring = " + e.substring(1)); //ubstring!
        System.out.println("Substring = " + e.substring(5)); //ring!

        /*
            toUpperCase
            특정 문자열을 대문자로 변경할 때 사용한다.
        */
        String f = "toUpperCase";
        System.out.println("toUpperCase = " + f.toUpperCase()); //TOUPPERCASE

        /*
            toLowerCase
            특정 문자열을 소문자로 변경할 때 사용한다.
        */
        String g = "toLowerCase";
        System.out.println("toLowerCase = " + g.toLowerCase()); //tolowercase

        /*
            split
            문자열을 특정한 구분자로 나누어 문자열 배열로 반환한다.
        */
        String h = "S:p:l:i:t";
        String[] strArray = h.split(":"); // strArray = {"S", "p", "l", "i", "t"}

        /*
             concat
             문자열을 합칠때 사용한다.
        */
        String i = "Concat";
        System.out.println("Concat = " + i.concat("!")); //Concat!

        //=================================== 2.문자열 타입 포맷팅 메서드 ==================================

        /*
            format
            String.format("... %s.. %s..", 치환값1, 치환값2);
            문자열 안의 특정한 값을 바꿀 수 있게 해준다.
            %s -> 치환값으로 변경
        */
        String name1 = "Tim";
        int age1 = 30;

        String name2 = "Anna";
        int age2 = 45;

        System.out.println(String.format("%s의 나이는 %s세 입니다", name1, age1));
        System.out.println(String.format("%s의 나이는 %s세 입니다", name2, age2));

        /*
            StringBuffer/StringBuilder
            문자열을 추가하거나 변경할 때(연산) 주로 사용하는 자료형이다.

            사용이유는?
            String 자료형이나 concat() 메소드를 통해 문자열을 붙일 수 있지만,
            String 자료형이 참조형임으로 새로운 객체를 생성하고 String 공간을 할당하기 때문에 공간을 낭비하고 비효율적이다.
            그렇기때문에 StringBuffer/StringBuilder 자료형을 사용한다.

            StringBuffer/StringBuilder 장점
            StringBuffer 자료형은 멀티스레드 환경에서 thread safe 하다는 장점이 있다.
            StringBuilder 자료형은 성능이 우수하다는 장점이 있다.
        */
        
        //String 자료형으로 문자열 연결
        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println("String 자료형 문자열 연결 = " + result);

        //StringBuffer
        //하나의 객체를 생성하고 메모리에도 하나의 공간이 할당 됨으로 String 자료형의 비해 효율적이다.
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World!");
        System.out.println("StringBuffer 자료형 문자열 연결 = " + buffer.toString());

        //StringBuilder
        //하나의 객체를 생성하고 메모리에도 하나의 공간이 할당 됨으로 String 자료형의 비해 효율적이다.
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("Java ");
        builder.append("World!");
        System.out.println("StringBuilder 자료형 문자열 연결 = " + builder.toString());

        //============================ 3.StringBuffer/StringBuilder 내장 메서드 =========================

        /*
            append
            문자열을 생성(추가)하는 메서드이다.
        */
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append("문자열을 ");
        buffer2.append("생성하는 ");
        buffer2.append("함수이다.");
        System.out.println("append() = " + buffer2);

        /*
            insert
            특정 위치에 원하는 문자열을 삽입할 수 있다.
        */
        StringBuffer buffer3 = new StringBuffer();
        buffer3.append("Hello");
        buffer3.insert(5, " World");
        System.out.println("insert() = " + buffer3);

        /*
             substring
             String 자료형의 subString과 동일한 역할을 한다.
        */
        StringBuffer buffer4 = new StringBuffer();
        buffer4.append("Hello ");
        buffer4.append("Java ");
        buffer4.append("World");
        System.out.println("substring() = " + buffer4.substring(5));
        System.out.println("substring() = " + buffer4.substring(3,9));

    }
}

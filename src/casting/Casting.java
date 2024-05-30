package casting;

public class Casting {
    public static void main(String[] args) {
        //=================================== 1.형변환(캐스팅) ===================================

        /*
            작은 범위 -> 큰 범위 : 형변환이 가능하다.
            큰 범위 -> 작은 범위 : 형변환은 가능하지만 문제가 발생한다.

            묵시적 형변환
            - 작은 범위 -> 큰 범위로 형변환 시 자바에서 자동으로 형변환 해준다.
            명시적 형변환
            - 큰 범위 -> 작은 범위로 형변환 시 개발자가 직접 형변환을 해줘야 한다.
            - 오버플로우, 소수점 버림 문제가 발생한다.
        */
        
        //묵시적 형변환
        int intValue = 35;
        double doubleValue;
        //doubleValue = (double)intValue; 자바가 자동으로 (double) 형변환을 시켜준다.
        doubleValue = intValue;
        System.out.println("묵시적 형변환 = " + doubleValue);

        //명시적 형변환
        double d = 3.5;
        //int i = d; 컴파일러 에러가 발생한다.
        int i = (int) d; // 개발자가 직접 (int) 형변환을 시켜줘야한다. 단, 오버플로우 및 소수점 버림 문제가 발생한다.
        System.out.println("명시적 형변환 = " + i);
    }
}

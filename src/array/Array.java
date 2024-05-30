package array;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //=================================== 1.배열 선언 방법 ===================================
        int[] a = new int[5]; //배열 선언
        a[0] = 1; //배열 초기화
        a[1] = 2; //배열 초기화
        a[2] = 3; //배열 초기화
        a[3] = 4; //배열 초기화
        a[4] = 5; //배열 초기화
        
        int[] b = {1, 2, 3, 4, 5};
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //=================================== 2.배열 인덱스 ===================================

        /*
            배열의 인덱스는 0부터 시작한다.
        */

        System.out.println("a = " + a[0]);
        System.out.println("b = " + b[1]);
        System.out.println("list = " + list.get(2));

        //=================================== 3.배열 데이터 추출 ===================================

        //인덱스 값이 사용 해야할 경우
        for(int i = 0; i < list.toArray().length; i++){
            System.out.println("인덱스의 값이 필요한 경우 = " + list.get(i));
        }
        
        
        //인덱스 값을 사용하지 않아도 될 경우
        for (Integer i : list) {
            System.out.println("인덱스의 값이 필요하지 않는 경우 = " + i);
        }

        //=================================== 4.정리 ===================================
        /*
            배열은 같은 타입의 변수를 반복해서 선언하지 않고 하나의 배열을 통해 같은 타입의 데이터를 담을 수 있다.

            배열도 참조형임으로 배열을 선언한 변수에 참조값이 담겨져있다.

            배열도 참조형임으로 초기화를 하지 않아도 자바에서 자동으로 해준다.
            - int[] a; -> 0
            - String[] str; -> null
            - boolean[] b; -> false
        */
    }
}

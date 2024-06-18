package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExcample {
    public static void main(String[] args) {
        /*
            LinkedList
            - ArrayList와 사용 방법은 똑같지만 내부 구조는 완전히 다르다.
            - ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조를 링크해서 체인처럼 관리합니다.
            - 리.스트에 데이터를 추가 및 삭제가 빈번히 일어날 경우 사용한다

            객체추가
            특정 인덱스에 객체를 추가할 경우 추가하기전 특정 인덱스에 연결 되어 있던 링크가
            객체가 추가하면 링크를 끊고 추가된 객체에 링크를 건다.

            객체삭제
            특정 인덱스의 객체를 삭제하면 삭제된 객체에 링크를 끊고 삭제된 객체의 앞 뒤 객체에 링크를 건다.
        */

        //ArrayList, LinkList 시간 차이
        List<String> arrayList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        long startTime, endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i)); //오른쪽으로 계속 쉬프트가 일어남
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 = " + (endTime - startTime));

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
           linkList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkList 걸린 시간 = " + (endTime - startTime));
    }
}

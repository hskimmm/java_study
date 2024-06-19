package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExcample {
    public static void main(String[] args) {
        /*
            Set
            저장 순서가 유지되지 않는다.
            중복 저장을 허용하지 않는다.

            Set - 사용방법
            객체 추가
            - boolean add(E e)
              주어진 객체를 저장, 객체가 성공적으로 저장되면 true를 리턴하고 중복 객체면 false를 리턴
            객체 검색
            - boolean contains(Object o)
              주어진 객체가 저장되어 있는지 여부
            - isEmpty()
              컬렉션이 비어 있는지 조사
            - Iterator<E> iterator()
              저장된 객체를 한 번씩 가져오는 반복자 리턴
            - int size()
              저장되어 있는 전체 객체 수 리턴
            객체 삭제
            - void clear()
              저장된 모든 객체를 삭제
            - boolean remove(Object o)
              주어진 객체를 삭제

            Set - add(저장)원리
            add 메소드 호출 시 hashCode() 메소드를 호출하여 저장할 값을 해시코드로 변환 후
            이미 저장된 객체의 해시코드와 비교한다.
            그리고 동일한 해시코드가 있다면 equals() 메소드를 통해 두 객체를 비교한다.
            true 가 나올 경우 동일한 객체로 판단하며 중복 저장하지 않는다.

            요약
            순서가 유지되어 저장되고, 중복 저장이 가능하면?
            -> List 사용한다.
            -> 순서가 유지되어 인덱스를 통해 값을 가져 올 수 있다.
            저장 순서가 유지되지 않고, 중복 저장이 불가능 하면?
            -> Set 사용한다.
            -> 순서가 유지되지 않기 때문에 인덱스를 사용하지 못하고 결과를 출력하면 순서대로 출력된다.
        */
        Set<Integer> integerSet = new HashSet<>();


        //중복을 허용하지 않는다.
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        System.out.println("integerSet = " + integerSet.size()); //size = 1

        /*
            Set은 저장 시 순서를 유지하지 않기 때문에 인덱스를 사용할 수 없다.(get 사용불가)
            그래서 객체를 가져올 때  Iterator 키워드를 사용하여 저장된 객체를 나열한다.

            Iterator - 사용방법
            - boolean hasNext()
              가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴합니다
            - E next()
              컬렉션에서 하나의 객체를 가져옵니다
            - void remove()
              Set 컬렉션에서 객체를 제거합니다
        */
        integerSet = new HashSet<>();

        integerSet.add(5);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(6);
        integerSet.add(8);
        integerSet.add(7);
        integerSet.add(9);

        integerSet.remove(9);

        Iterator<Integer> iterator = integerSet.iterator();
        //Set에 저장된 객체 꺼내는 방법1
        while (iterator.hasNext()) { //iterator에 저장된 객체가 있을때 까지 반복
            // 결과 = 2,4,5,6,7,8 -> 순서를 유지 하지 않는다.
            System.out.println("HashSet 반복 방법1 = " + iterator.next()); // 객체를 하나씩 가져와서 출력
            //iterator.remove(); // 객체 삭제
        }

        //Set에 저장된 객체 꺼내는 방법2
        System.out.println("=====================");
        for (Integer i : integerSet) {
            System.out.println("HashSet 반복 방법2 = " + i);
        }

        //HashSet - 저장원리
        Set<String> stringSet = new HashSet<>();

        /*
            add 메소드를 통해 값을 저장 시 hashCode() 메소드를 호출하여 add에 저장된 값을 해시코드로 변환한다.
            변환한 해시코드 값을 기존에 저장된 해시코드와 비교한다.
            그리고 동일한 해시코드가 있을 경우 equals() 메소드를 통해 비교하여 객체가 동일하다면
            중복 저장을 시키지 않는다.
        */
        stringSet.add("Hello");
        stringSet.add("Hello");
        stringSet.add("Java");
        stringSet.add("World");

        System.out.println("add 메소드 원리 = " + stringSet); // 중복된 값을 저장하지 않는다.

        /*
            객체를 통한 데이터 저장
        */
        Set<Member> member = new HashSet<>();

        member.add(new Member("홍길동", 30));
        member.add(new Member("홍길동", 30));

        //인스턴스가 다를지만 값이 해시코드로 변환 시 동일하기 때문에 객체의 수는 1이다.
        System.out.println("member 객체의 수 = " + member.size());

    }
}

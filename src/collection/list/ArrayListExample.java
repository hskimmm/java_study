package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
            ArrayList
            1.순서를 유지하고 저장한다.
            2.중복 저장이 가능하다.
            
            사용법
            add = 추가
            remove = 삭제
            get = 입력한 인덱스에 저장된 데이터 값 가져오기

            3.List 인터페이스의 메소드
            기능
            객체추가  boolean add(E e)                  주어진 객체를 맨 끝에 추가
                    void add(int index, E element)    주어진 인덱스에 객체를 추가
                    set(int index, E element)         주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
            객체검색  boolean contains(object o)        주어진 객체가 저장되었는지 확인
                     E get(int index)                 주어진 인덱스에 저장된 객체를 리턴
                     isEmpty()                        컬렉션이 비어있는지 여부(NUll도 값이다.)
                     int size()                       저장되어 있는 전체 객체수를 리턴
            객체삭제  void clear()                      저장된 모든 객체 삭제
                     E remove(int index)               주어진 인덱스에 저장된 객체를 삭제
                     boolean remove(Object o)          주어진 객체를 삭제

            4.객체 삭제시 중복값을 삭제할 때에는 인덱스의 번호가 앞에 있는 값을 삭제한다.
            5.객체 삭제 시 삭제 된 인덱스 의 뒤의 인덱스 부터 마지막 인덱스까지 앞으로 -1씩 당겨진다.
              반대로 객체를 추가하면 추가한 인덱스 부터 마지막 인덱스 까지 뒤로 +1씩 밀려난다.
            6.ArrayList 사용 시 주의점
            객체의 중간에 객체를 추가하거나 삽입을 할 경우 빈번하게 일어날 경우 ArrayList 사용은 바람직하지 않다.(지양)
            왜냐하면, 객체 추가하거나 삽입 시 ArrayList는 앞으로 -1 떙겨지거나 뒤로 +1 밀려나기 때문에 ArrayList에
            담겨져 있는 객체가 많을 수록 '딜로스(쉬프트)'가 생기기 떄문이다.
            이럴 경우 LinkedList를 사용하는게 바람직하다.
            그래서 ArrayList는 인덱스를 검색하거나, 인덱스 맨 마지막에 객체를 추가할 경우 사용하는게 바람직하다.
        */
        List<String> arrayList = new ArrayList<>();

        //요소 추가
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("world");

        //요소 꺼내기
        String str = arrayList.get(0);
        System.out.println("str1 = " + str);
        
        //요소 삭제
        arrayList.remove(0);
        arrayList.remove("java");
        str = arrayList.get(0);
        System.out.println("str2 = " + str);
        arrayList.remove(0);

        arrayList.add("사과");
        arrayList.add("바나나");
        arrayList.add("포도");
        arrayList.add("딸기");
        arrayList.add("멜론");

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("일반 과일 = " + arrayList.get(i));
        }

        for (String s : arrayList) {
            System.out.println("향상된 과일 = " + s);
        }
        
        //ArrayList 사용을 지양하는 경우
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Servelt/JSP");
        list.add("DBMS");
        list.add("JPA");

        int size = list.size();
        System.out.println("총 객체 수 = " + size);
        System.out.println("contains = " + list.contains("DBMS"));
        System.out.println("isEmpty = " + list.isEmpty()); //null도 값이라 false

        for(int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            System.out.println(i + ": " + str2);
        }

        list.remove(2);
        list.remove(2);
        list.remove("Java");
        list.add("SpringBoot");
        list.add("Jquery");

        System.out.println("=========객체삭제/추가========");
        for(int i = 0; i < list.size(); i++) {
            String str3 = list.get(i);
            System.out.println(i + ": " + str3);
        }
    }
}

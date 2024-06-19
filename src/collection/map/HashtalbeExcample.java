package collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtalbeExcample {
    public static void main(String[] args) {
        /*
            Hashtable

            HashMap vs Hashtable 차이점
            HashMap과 동일한 내부 구조를 가졌지만, 가장 큰 차이점은 동기화된 메소드로 구성되어 있기 때문에
            멀티 스레드가 동시에 일어날 수 없고, 하나의 스레드가 실행이 완료 되어야 다음 스레드가 실행이 된다.
            그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있는 특징이 있다. 이것을 thread safe 라고도 한다.
        */
        Map<String, Object> map = new Hashtable<>();

        map.put("spring", "qwer");
        map.put("summer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwer123");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디 : ");
            String userId = scanner.nextLine();

            System.out.print("비밀번호 : " );
            String userPwd = scanner.nextLine();
            System.out.println();

            if(map.containsKey(userId)) {
                if(map.get(userId).equals(userPwd)) {
                    System.out.println("로그인이 되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다!");
            }
        }

    }
}

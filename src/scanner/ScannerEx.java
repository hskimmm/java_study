package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            문제:
            "계절을 맞춰보세요!"라는 자바 프로그램을 작성해보세요.

            사용자에게 1에서 4 사이의 숫자를 입력하라고 요청합니다.
            각 숫자는 계절을 나타냅니다: 1은 봄, 2는 여름, 3은 가을, 4는 겨울입니다.
            사용자가 숫자를 입력하면, 프로그램은 해당 계절의 이름을 출력해야 합니다. 만약 사용자가 1에서 4 사이의 숫자가 아닌 것을 입력하면, "잘못된 입력입니다!"라고 출력해야 합니다.
            이 문제를 해결하기 위해 switch 문을 사용하세요.
        */

        System.out.print("1에서 4 사이의 숫자를 입력하세요 : ");
        int seasonNumber = scanner.nextInt();

        switch (seasonNumber){
            case 1 :
                System.out.println("봄");
                break;
            case 2 :
                System.out.println("여름");
                break;
            case 3 :
                System.out.println("가을");
                break;
            case 4 :
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다!");
        }

        /*
            문제: 숫자 맞추기 게임

            사용자가 1부터 100 사이의 숫자를 맞추는 게임을 만들어 보세요.
            프로그램은 먼저 1부터 100 사이의 무작위 숫자를 생성합니다.
            그런 다음 사용자에게 숫자를 입력하라고 요청합니다.
            사용자가 숫자를 입력하면, 프로그램은 사용자가 입력한 숫자가 무작위로 생성된 숫자보다 높은지, 낮은지, 아니면 정확히 맞는지를 알려줍니다.
            사용자가 정확한 숫자를 맞출 때까지 이 과정을 반복합니다.
            숫자를 맞추면 "정답입니다!"라고 출력하고 게임을 종료합니다.
        */

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("randomNumber = " + randomNumber);
        while(true){
            System.out.print("숫자를 입력하세요 : ");
            int intNumber = scanner.nextInt();

            if(intNumber == randomNumber){
                System.out.println("정답입니다.");
                break;
            } else if (intNumber < randomNumber){
                System.out.println("무작위 숫자보다 작습니다.");
            } else {
                System.out.println("무작위 숫자보다 큽니다.");
            }
        }

        /*
            문제: "영화 티켓 예매 시스템"
            영화관에서 사용할 수 있는 간단한 티켓 예매 시스템을 만들어보세요. 이 시스템은 사용자로부터 다음과 같은 정보를 입력받아야 합니다:
            영화 제목 (문자열)
            관람 인원 수 (정수)
            예매자의 이름 (문자열)
            예매자의 전화번호 (문자열)

            입력받은 정보를 바탕으로 다음과 같은 형식으로 예매 정보를 출력해야 합니다:
            ===== 영화 티켓 예매 정보 =====
            영화 제목: [입력받은 영화 제목]
            관람 인원: [입력받은 관람 인원 수]명
            예매자 이름: [입력받은 예매자 이름]
            예매자 전화번호: [입력받은 예매자 전화번호]

            추가로, 티켓 가격은 1인당 10,000원으로 가정하고, 총 결제 금액을 계산하여 예매 정보 출력 후에 다음과 같이 출력해야 합니다:
            총 결제 금액: [계산된 총 결제 금액]원
            - Scanner 클래스를 사용하여 사용자로부터 입력을 받아야 합니다.
            - 입력받은 정보는 적절한 자료형으로 저장되어야 합니다.
            - 출력 형식은 예시와 정확히 일치해야 합니다.
        */

        System.out.print("영화 제목을 입력하세요 : ");
        String movieTitle = scanner.nextLine();
        System.out.print("관람 인원 수를 입력하세요 : ");
        int movieNumberOfPeople = scanner.nextInt();
        scanner.nextLine();
        System.out.print("예매자의 이름을 입력하세요 : ");
        String ticketName = scanner.nextLine();
        System.out.print("예매자의 전화번호를 입력하세요 : ");
        String ticketPhoneNumber = scanner.nextLine();

        System.out.println("===== 영화 티켓 예매 정보 =====");
        System.out.println("영화 제목: " + "[" + movieTitle + "]");
        System.out.println("관람 인원: " + "[" + movieNumberOfPeople + "]");
        System.out.println("예매자 이름: " + "[" + ticketName + "]");
        System.out.println("예매자 전화번호: " + "[" + ticketPhoneNumber + "]");
        System.out.println("총 결제 금액:" + 10000 * movieNumberOfPeople);

    }
}

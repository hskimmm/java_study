package scanner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

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


        /*
            문제: "학생 성적 관리 시스템"
            학생들의 성적을 관리하는 프로그램을 작성해보세요. 이 프로그램은 사용자로부터 학생 정보와 성적을 입력받아 저장하고, 입력된 정보를 바탕으로 학생별 총점, 평균, 등급을 계산하여 출력해야 합니다.

            프로그램의 동작은 다음과 같습니다:

            1. 사용자로부터 학생 수를 입력받습니다.
            2. 입력받은 학생 수만큼 다음 정보를 반복적으로 입력받습니다:
                - 학생 이름 (문자열)
                - 국어 점수 (정수)
                - 영어 점수 (정수)
                - 수학 점수 (정수)
            3. 입력받은 정보를 바탕으로 각 학생의 총점, 평균, 등급을 계산합니다.
                - 총점은 국어, 영어, 수학 점수의 합입니다.
                - 평균은 총점을 과목 수(3)로 나눈 값입니다.
                - 등급은 평균 점수에 따라 다음과 같이 부여합니다:
                    - 90점 이상: A
                    - 80점 이상 90점 미만: B
                    - 70점 이상 80점 미만: C
                    - 60점 이상 70점 미만: D
                    - 60점 미만: F
            4. 모든 학생의 정보를 입력받은 후, 다음과 같은 형식으로 학생별 성적 정보를 출력합니다:
            ===== 학생 성적 정보 =====
            이름: [학생 이름]
            국어 점수: [국어 점수]
            영어 점수: [영어 점수]
            수학 점수: [수학 점수]
            총점: [총점]
            평균: [평균]
            등급: [등급]
            ========================

            모든 학생의 성적 정보를 출력한 후, 프로그램을 종료합니다.
            제한사항:
            Scanner 클래스를 사용하여 사용자로부터 입력을 받아야 합니다.
            입력받은 정보는 적절한 자료형으로 저장되어야 합니다.
            출력 형식은 예시와 정확히 일치해야 합니다.
            평균 점수는 소수점 둘째 자리까지 출력해야 합니다.
            힌트:
            반복문을 사용하여 학생 정보를 입력받고 처리할 수 있습니다.
            조건문을 사용하여 평균 점수에 따라 등급을 판단할 수 있습니다.
            System.out.printf()를 사용하여 소수점 둘째 자리까지 출력할 수 있습니다.
        */

        System.out.print("학생 수를 입력하세요 : ");
        int userCount = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < userCount; i++) {
            System.out.print("학생 이름을 입력하세요 : ");
            String studentName = scanner.nextLine();
            System.out.print("국어 점수를 입력하세요 : ");
            int koreanScore = scanner.nextInt();
            System.out.print("영어 점수를 입력하세요 : ");
            int englishScore = scanner.nextInt();
            System.out.print("수학 점수를 입력하세요 : ");
            int mathScore = scanner.nextInt();

            int totalScore = koreanScore + englishScore + mathScore;
            int averageScore = totalScore / 3;
            String rating = "";

            if(averageScore >= 90) {
                rating = "A";
            } else if (averageScore >= 80) {
                rating = "B";
            } else if (averageScore >= 70) {
                rating = "C";
            } else if (averageScore >= 60) {
                rating = "D";
            } else {
                rating = "F";
            }

            System.out.println("===== 학생 성적 정보 =====");
            System.out.println("이름: " + "[" + studentName + "]");
            System.out.println("국어 점수: " + "[" + koreanScore + "]");
            System.out.println("영어 점수: " + "[" + englishScore + "]");
            System.out.println("수학 점수: " + "[" + mathScore + "]");
            System.out.println("총점: " + "[" + totalScore + "]");
            System.out.println("평균: " + "[" + averageScore + "]");
            System.out.println("등급: " + "[" + rating + "]");
            System.out.println("========================");


        }

        /*
            퀴즈: 로또 번호 생성기
            로또 번호 생성기 프로그램을 작성하세요. 이 프로그램은 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자를 무작위로 선택하여 출력합니다.

            요구사항:
            1. Random 클래스를 사용하여 난수를 생성해야 합니다.
            2. 생성된 로또 번호는 오름차순으로 정렬되어 출력되어야 합니다.
            3. 생성된 로또 번호는 서로 중복되지 않아야 합니다.
            4. 출력 형식은 다음과 같아야 합니다:
            로또 번호: [번호1] [번호2] [번호3] [번호4] [번호5] [번호6]

            힌트:
            - 1부터 45까지의 숫자를 리스트나 배열에 저장하고, 해당 리스트에서 난수를 생성하여 번호를 선택할 수 있습니다.
            - 중복을 방지하기 위해 선택된 번호는 리스트에서 제거하거나, Set 자료구조를 사용할 수 있습니다.
        */
        int lotto[] = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.

        System.out.print("로또 번호 : ");
        for(int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 45) + 1;
            lotto[i] = num;
            for(int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
            System.out.print("[" + lotto[i] + "] ");
        }
    }
}

package loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*
            반복문
            
            FOR문 : 반복 횟수가 정해질 때 사용한다.
            for(초기식; 조건식; 증감식){
            }
            
            이중반복문(중첩반복문) : 반복문 안에 반복문이 있는 구조
            for(초기식; 조건식; 증감식){
                for(초기식; 조건식; 증감식){
                }
            }
            break,continue 예약어
            break : 해당 반복문을 빠져나온다.
            continue : 현재 실행하고 있는 반복문을 나오고 다음 반복문을 실행한다.
            
            While문
            While(true){ //참 일때 반복문 실행
                //조건식이 true 일 때 실행되는 코드 블록
            }

            do-while문
            do{
                //무조건 한번 실행해야할 때 사용한다.
            }while(){
            }
        */
        
        /*
            목표: 10부터 0에 도달할 때까지 카운트다운을 출력하는 프로그램을 작성하세요.

            조건:

            1. 시작 숫자는 10입니다.
            2. while 문을 사용하여, 현재 숫자에서 1씩 감소시키면서 카운트다운을 진행합니다.
            3. 카운트다운은 0에 도달할 때까지 계속됩니다.
            4. 각 숫자는 새로운 줄에 출력되어야 합니다.
        */

        int num = 10;

        while (num >= 1){
            System.out.println(num);
            num--;
        }

        /*
            - (하) 1부터 주어진 양의 정수 n까지의 합을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
            - 주어진 값: n = 100
            - (중) 주어진 배열 numbers에 저장된 숫자들의 평균을 계산하여 출력하는 코드를 while문을 사용하여 작성하세요.
            - 주어진 배열: numbers = [5, 2, 9, 1, 7, 4, 6, 3, 8]
        */

        //(하)
        int n = 1;
        int sum = 0;
        while(n <= 100){
            sum += n;
            n++;
        }
        System.out.println(sum);

        //(중)
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int sum2 = 0;
        for (int number : numbers) {
            sum2 += number;
        }

        int average = sum2 / numbers.length;
        System.out.println(average);

        //최대값 출력
        int[] numbers2 = {10, 50, 8, 20, 30, 15, 9, 2};

        int tmp = numbers2[0]; // 초기값 설정
        int maxNumber = 0;
        for(int i = 1; i < numbers2.length; i++){
            if(tmp < numbers2[i]){ // 초기값 보다 클 경우
                maxNumber = numbers2[i];  // 초기값 보다 클 경우 maxNumber 변수에 값 삽입
                tmp = maxNumber; // 초기값 변수에 maxNumber 변수 값 삽입
            }
        }
        System.out.println("최대값 = " + maxNumber);

        //양수의 합 + 음수의 합 출력
        int[] numbers3 = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};

        int plusSum = 0;
        int minusSum = 0;

        for(int i=0; i < numbers3.length; i++){
            if(numbers3[i] > 0) {
                plusSum += numbers3[i];
            }else{
                minusSum += numbers3[i];
            }
        }
        System.out.println("양수의 합 = " + plusSum);
        System.out.println("음수의 합 = " + minusSum);
        
        /*
            짝수의 합 계산
            목표: 1부터 100까지의 숫자 중에서 모든 짝수의 합을 계산하고 출력하는 프로그램을 작성하세요.

            조건:

            1. for 문을 사용하여 1부터 100까지 숫자를 반복합니다.
            2. 각 숫자가 짝수인지 판별합니다 (짝수는 2로 나누어 떨어지는 숫자입니다).
            3. 짝수인 경우, 그 값을 누적하여 합계를 계산합니다.
            4. 모든 반복이 끝나면 짝수의 총합을 출력합니다.목표: 1부터 100까지의 숫자 중에서 모든 짝수의 합을 계산하고 출력하는 프로그램을 작성하세요.
        */

        int sum3 = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum3 += i;
            }
        }
        System.out.println("짝수의 총 합 = " + sum3);

        /*
            문제:
            사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
            예시:

            입력: 20
            출력: 15

            설명:
            1부터 20까지의 정수 중에서 3의 배수이면서 5의 배수인 수는 15 하나뿐입니다. 따라서 출력 결과는 15입니다.
            이 문제에서는 for문을 사용하여 1부터 n까지의 정수를 순회하면서, 3의 배수이면서 5의 배수인 수를 찾아 그 합을 계산해야 합니다.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 n을 입력하세요 : ");
        int number = scanner.nextInt();
        int sum4 = 0;
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum4 += i;
            }
        }
        System.out.println("총 합 = " + sum4);

        /*
            피보나치 수열의 첫 10개 항을 출력하는 프로그램을 작성하세요.

            설명:
            피보나치 수열은 다음과 같이 정의됩니다:

            - 첫 번째 항과 두 번째 항은 1입니다.
            - 세 번째 항부터는 이전 두 항의 합으로 정의됩니다.

            피보나치 수열의 첫 10개 항은 다음과 같습니다:
            1, 1, 2, 3, 5, 8, 13, 21, 34, 55

            이 문제에서는 for문을 사용하여 피보나치 수열의 첫 10개 항을 차례로 출력해야 합니다.

            힌트:

            - 첫 번째 항과 두 번째 항을 변수에 초기화합니다.
            - for문을 사용하여 10번 반복합니다.
            - 각 반복에서 이전 두 항의 합을 계산하여 다음 항을 구합니다.
            - 현재 항을 출력합니다.
        */

        int number2 = 10;
        int[] fibArray = new int[n];

        // 피보나치 수열의 첫 번째와 두 번째 항을 초기화
        fibArray[0] = 1;
        fibArray[1] = 1;

        // for문을 사용하여 피보나치 수열을 계산하고 배열에 저장
        for (int i = 2; i < number2; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        // 피보나치 수열이 저장된 배열 출력
        System.out.print("피보나치 수열의 첫 " + n + "개 항: ");
        for (int i = 0; i < number2; i++) {
            System.out.print(fibArray[i] + " ");
        }

        /*
            목표: 1부터 10까지 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력합니다.
        */

        for(int i = 0; i <= 10; i++){
            if(i == 4 || i == 7){
                continue;
            }
            System.out.println(i);
        }

        /*
            - 퀴즈 1: 정수형 배열 scores가 주어졌을 때, 향상된 반복문을 사용하여 점수의 총합과 평균을 계산하는 코드를 작성하세요.
            - 퀴즈 2: 문자열 배열 names가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요.
        */

        //퀴즈1
        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum5 = 0;
        for (int score : scores) {
            sum5 += score;
        }
        int average2 = sum5 / scores.length;
        System.out.println("점수의 총 합 = " + sum5);
        System.out.println("점수의 평균 = " + average2);

        //퀴즈2
        String[] names = {"Apple", "banana", "cat", "dog"};
        for (String name : names) {
            if(name.length() >= 5){
                System.out.println("이름의 길이가 5 이상인 이름 = " + name);
            }
        }

        
    }
}

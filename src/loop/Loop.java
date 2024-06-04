package loop;

public class Loop {
    public static void main(String[] args) {
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

        int n = 1;
        int sum = 0;
        while(n <= 100){
            sum += n;
            n++;
        }
        System.out.println(sum);

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

    }
}

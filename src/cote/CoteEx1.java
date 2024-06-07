package cote;

import java.util.Arrays;

public class CoteEx1 {
    /*
        static은 메서드 영역에 생성된다.
        프로그램 처음 실행 시 메모리의 메서드 영역에 로딩된다.
        로딩 된 static 클래스, 메서드, 변수는 다른 곳의 클래스에서 곻유되어 사용할 수 있다.
        -> 객체 생성 없이 사용할 수 있다는 뜻이다.
        왜냐하면, 프로그램 처음 실행 시 메모리(메서드 영역)에 로딩되기 때문에 다른 곳에서 객체없이
        불러와서 사용할 수 있다.
    */
    public static void main(String[] args) {
        /*
            주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
            예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
            만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

            예제
            입력: "Monitor"
            출력: "nit"

            요구사항
            문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
            문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.
        */
        String str = "Monitor";
        System.out.println("문제 1 = " + getStringExtraction(str));

        /*
            여러분은 아주 크게 짖는 개를 키우고 있습니다.
            hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
            만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
            만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

            barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
            barkingDogProblem(true, 7) ==> "든든하군!"
            barkingDogProblem(false, 5) ==> "든든하군!"
        */
        System.out.println("문제 2 = " + barkingDogProblem(true, 6));
        System.out.println("문제 2 = " + barkingDogProblem(true, 7));
        System.out.println("문제 2 = " + barkingDogProblem(false, 5));

        /*
            주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
            "When organizing items, always label each group with the appropriate
            category. category: books, category: electronics, category: clothing, category: kitchenware,
            and so on."
         */
        String text = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
        printCategory(text);

        /*
            다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.
            String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";

            물
            방
            울
            이
            ..
            그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.
        */
        String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        printText(someTxt);

        /*

            배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
            search(new int[] {1,2,3,4,5}, 5); ==> 4
            search(new int[] {1,2,3,4,5}, 6); ==> -1
        */
        int target = 5;
        int[] num = {1, 2, 3, 4, 5};
        int result = search(num, target);
        System.out.println("result1 = " + result);

        num = new int[]{1, 2, 3, 4, 5};
        target = 6;
        result = search(num, target);
        System.out.println("result2 = " + result);

    }

    //문제1
    public static String getStringExtraction(String str){
        String result = str;
        
        //문자열의 길이가 3보다 크고 홀수 일 때만 문자열 가운데를 추출하여 반환
        if (str.length() >= 3 && str.length() % 2 != 0) {
            /*
                홀수 길이의 문자열 가운데 숫자구하기
                str.length()/2 = 홀수 문자열의 가운데 문자열의 인덱스를 구함.
                str.length()/2 -1 = 가운데 문자열의 에 문자열의 인덱스를 구함앞
                str.length()/2 + 2 = 가운데 문자열의 뒤에 문자열의 인덱스를 구함
                -> substring(앞 위치, 끝 위치) -> 끝 위치의 인덱스의 문자열은 추출이 안되기 때문에
                   +1이 아니라 +2를 해줘야 한다.
            */
            result = str.substring(str.length()/2 -1, str.length()/2 + 2);
        }

        //문자열의 길이가 3보다 작거나 짝수일 경우 문자열을 그대로 반환
        return result;
    }

    //문제2
    public static String barkingDogProblem(boolean bool, int hour){
        return bool && (hour < 7 || hour >= 20) ? "짖으면 안돼!!" : "든든하군!";
    }

    //문제3
    public static void printCategory(String str){
        //방법1
        //문자열의 공백을 기준으로 자르고 배열에 넣는다.
        String[] textArr = str.split(" ");

        int i = 0;
        while(i < textArr.length){
            //공백을 기준으로 자른 배열의 인덱스에 해당 값이 조건이 맞으면 다음 인덱스의 값을 출력한다.
            if(textArr[i].equals("category:")){
                System.out.print(textArr[i + 1]);
            }
            //배열의 길이 만큼 while문을 실행하기 위해 i의 값을 1씩 늘려줌
            i++;
        }

        //방법2
        int j = 0;
        while (true){
            //category: 문자열이 처음 시작하는 인덱스 값을 구함
            int idx = str.indexOf("category:", j);

            //찾는 문자열이 더이상 없을 경우 -1
            if(idx == -1){
                break;
            }

            int startIdx = idx + 9;
            int endIdx = str.indexOf(",", startIdx);
            System.out.println(str.substring(startIdx, endIdx));

            j = endIdx + 1;

        }
    }

    //문제4
    public static void printText(String str){
        //정방향
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

        //역방향
        for(int i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }

    //문제5
    public static int search(int[] nums, int target){
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                result = i;
                break;
            } else {
                result = -1;
            }
        }

        return result;
    }
}

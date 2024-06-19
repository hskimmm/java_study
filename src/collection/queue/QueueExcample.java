package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExcample {
    public static void main(String[] args) {
        /*
            Queue
            FIFO(first-in, first-out) - 선입선출
            먼저 넣은 객체가 제일 먼저 빠져나가는 자료구조이다.

            offer() -> 주어진 객체를 넣는다.
            peek() -> 객체 하나를 가져온다. 객체를 큐에서 제거하지 않는다.
            poll() -> 객체를 하나 가져온다. 객체를 큐에서 제거한다.
        */

        Queue<Message> queue = new LinkedList<>();

        //큐에 객체 추가
        queue.offer(new Message("sendMail", "kim"));
        queue.offer(new Message("sendSMS", "lee"));
        queue.offer(new Message("sendKaKaoTalk", "park"));

        //출력 -> 먼저 추가한 객체가 먼저 출력된다.
        while (!queue.isEmpty()) {
            Message message = queue.poll();

            switch (message.getCommend()) {
                case "sendMail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                    break;
                case "sendKaKaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

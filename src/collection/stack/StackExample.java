package collection.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
            Stack
            LIFO(Last In First Out) - 후입선출
            마지막에 넣은 객체가 제일 먼저 빠져나오는 자료구조이다.

            push() : 주어진 객체를 스택에 넣는다.
            peek() : 스택의 맨 위에 위치한 객체를 가져온다. 객체를 스택에서 제거하지 않는다.
            pop() : 스택의 맨 위에 객체를 꺼내고, 스택에서 제거한다.
        */
        Stack<Coin> stack = new Stack<>();

        //스택에 넣는다.
        stack.push(new Coin(10));
        stack.push(new Coin(20));
        stack.push(new Coin(30));
        stack.push(new Coin(40));

        while (!stack.isEmpty()) {
            Coin coin = stack.pop();
            System.out.println("꺼내온 동전 = " + coin.getValue() + "원"); //4,3,2,1 -> 마지막에 넣은 객체가 먼저 나간다.
        }
    }
}

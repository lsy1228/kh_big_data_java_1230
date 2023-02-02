package 스택기본;
//Stack : LIFO(Last in First Out)구조, Vector의 기능을 제약해서 만듦, 메모리 구조의 Stack구역이 대표적 예시
//입력과 출력이 한 곳에서만 일어남
//push() : 객체 삽입
//peek() : 스택의 맨 위의 값 확인
//pop() : 맨 위의 값 추출하면서 보여줌
//empty() : 스택이 비어있는지 반환 (true / false)
//size() : 스택에 포함된 객체의 개수 반환
//contains(값) : 해당 값이 스택내에 있는지 확인

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());  //3
        System.out.println(stack.pop());   //3
        System.out.println(stack.empty()); //false
        System.out.println(stack.size());  //2
        System.out.println(stack.contains(1)); //true
        for(Integer e : stack) {
            System.out.println(e);
        }
    }
}

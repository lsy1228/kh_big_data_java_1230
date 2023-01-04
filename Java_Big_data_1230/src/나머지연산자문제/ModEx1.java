package 나머지연산자문제;
//100의 자리 정수를 입력받아서 3개의 변수(100의자리/ 10의자리/ 1의자리)에 대입하기
//365
//a = 3, b = 6, c = 5

import java.util.Scanner;

public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; //100으로 나눈 몫을 취한다
        b = (num % 100) / 10;
        c = num % 10;

        System.out.println("100의 자리 : " + a +", 10의 자리: " + b + ", 1의 자리 : " + c);
    }
}

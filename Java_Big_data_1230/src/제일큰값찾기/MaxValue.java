package 제일큰값찾기;

import java.util.Scanner;

//세자리의 정수를 입력 받아서 100의 자리, 10의 자리, 1의 자리로 나누어 담고 이중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //정수를 입력받기 위해 스캐너 객체 생성

        System.out.print("값을 입력하세요: ");
        int num = sc.nextInt();

        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        if(a > b) {
            /*if(a > c)
                System.out.println(a);
            else
                System.out.println(c);*/
            System.out.println(Math.max(a,c));
        }
        else
            /*if(b > c) {
                System.out.println(b);
            }*/
            System.out.println(Math.max(b,c));
    }
}

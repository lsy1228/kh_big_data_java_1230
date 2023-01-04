package 반복문유효값체크;

import java.util.Scanner;

public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) break;
            System.out.println("나이를 잘 못 입력하셨습니다");
        }
        System.out.println("입력하신 나이는 " + age + "입니다");
    }
}

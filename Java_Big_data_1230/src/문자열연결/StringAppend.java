package 문자열연결;

import java.util.Scanner;

//문자열 추가하기
//첫번째 문자열 입력 : seoul
//두번째 문자열 입력 : korea
//정수값 입력 : 2
//첫번째 문자열에서 입력 받은 정수 개수만큼의 문자를 뒤에서부터 잘라, 두번째 문자열 앞에 추가하기
//ulkorea
//3이라고 입력하면 oulkorea
//힌트1 : substring() - 문자열의 시작 위치부터 끝까지 잘라냄
//힌트2 : substring 메소드를 이용해 문자열을 추출하기 전에 index 계산이 필요
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력하시오: ");
        String str1 = sc.next();
        System.out.print("두번째 문자열을 입력하시오: ");
        String str2 = sc.next();
        System.out.print("정수값을 입력하시오: ");
        int num = sc.nextInt();
        int position = str1.length() - num;
        String sub = str1.substring(position);
        System.out.print(sub + str2);
    }
}

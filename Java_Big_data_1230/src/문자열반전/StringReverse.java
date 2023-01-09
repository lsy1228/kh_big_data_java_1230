package 문자열반전;

import java.util.Scanner;

//abcdefg => gfedcba
//힌트 : for문을 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();

        //for문으로 풀기
        for(int i = (str.length()-1); i > -1; i--) {
            System.out.print(str.charAt(i));
        }

        //while문으로 풀기
        int index = str.length();
        while(true) {
            index--;
            System.out.print(str.charAt(index));
            if(index == 0)  break;
        }

    }
}

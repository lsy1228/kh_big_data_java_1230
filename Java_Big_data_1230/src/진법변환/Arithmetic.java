package 진법변환;

import java.util.Scanner;

//8진수를 2진수로 변환
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("8진수 입력 : ");
        String num = sc.next();
        String[] eightArr = {"000","001","010","011","100","101","110","111"};
        String[] eightF = {"","1","10","11","100","101","110","111"};

        for(int i = 0; i < num.length(); i++) {
            if(num.length() == 1 && num.charAt(0) == 0) {
                System.out.println(0); break;
            }
            if(i == 0) {
                System.out.print(eightF[num.charAt(0) - '0']);
            }
            else {
                System.out.print(eightArr[num.charAt(i) - '0']);
            }
        }
    }
}

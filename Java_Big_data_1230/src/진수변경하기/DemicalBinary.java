package 진수변경하기;

import java.util.Scanner;

public class DemicalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //10
        String result = "";
        //int[] remain = new int[num];
        int[] binary = {1,2,4,8,16,32,64,128,256,512,1024};
        int demNum = 0;

        for(int i = num; i > 0; i/=2) {
            result = String.valueOf(i%2) + result;
        }
        System.out.println("이진수 : " + result);
        StringBuffer sb = new StringBuffer(result);
        String reverse = sb.reverse().toString();
        //System.out.println(reverse);
        for(int i = 0; i < result.length(); i++) {
            demNum += (sb.charAt(i) - '0') * binary[i];
        }
        System.out.println("십진수 : " + demNum);
    }
}


package 진수변경하기;
import java.util.Scanner;
//10진수를 입력받아 2진수로 변경 -> 10진수 변경
//배열을 사용하지 않고 정수 타입 변수를 이용해 변환, 문자열 사용 금지
public class DemicalBinary {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //10
        String result = "";
        int[] binary = {1,2,4,8,16,32,64,128,256,512,1024};
        int demNum = 0;

        for(int i = num; i > 0; i/=2) {
            result = String.valueOf(i%2) + result;
        }
        System.out.println("이진수 : " + result);
        StringBuffer sb = new StringBuffer(result);
        String reverse = sb.reverse().toString();
        for(int i = 0; i < result.length(); i++) {
            demNum += (sb.charAt(i) - '0') * binary[i];
        }
        System.out.println("십진수 : " + demNum);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : " + val);
    }
    static int decToBin(int dec) { //10진수를 입력받아서 2진수 반환
        int calc; //계산으로 만들어진 이진수
        int bin = 0; //최종 결과
        int pos = 1; //자리 이동을 위한 포지션 변수
        while(dec != 0) {
            calc = dec % 2; //2로 나눈 나머지를 구함
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;
    }
    static int binToDec(int bin) { //2진수를 입력받아서 10진수 반환
        int dec = 0; //최종 결과
        int i = 0;   //인덱스 계산용 변수
        int tmp;     //계산을 위한 임시값 저장용
        while(bin != 0) {
            tmp = bin % 10;  //10으로 나눈 나머지 구함
            bin =  bin / 10;
            dec += tmp * Math.pow(2, i++);
        }

        return dec;
    }
}


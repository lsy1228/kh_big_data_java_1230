package 배수찾기;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램
//입력 : 첫째줄에 n이 주어짐, 다음 줄에 한줄에 한개씩 목록에 들어있는 수가 주어짐 (0~10000)
//출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력
//입력 :
//  3 -> 주어진 수
//  1
//  7
//  99
//  321
//  777
//  0 -> 반복문에 대한 종료
//결과
//  1 is NOT a multiple of 3
//  7 is NOT a multiple of 3
//  99 is a multiple of 3
//  321 is a multiple of 3
//  777 is a multiple of 3
public class MultipleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>(); //ArrayList 생성
        int n = sc.nextInt(); //주어진 수
        int val; //주어진 수의 배수인지 아닌지 판별하기 위한 값을 입력받음
        while(true) { //항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출조건이 필요
            val = sc.nextInt(); //키보드로부터 값을 입력받음
            if(val == 0) break; //반복문의 탈출조건
            number.add(val); //add에 인덱스를 지정하지 않으면 마지막 위치에 저장됨
        }
        for(Integer e : number) {
            if(e % n == 0)
                System.out.println(e + " is a multiple of " + n);
            else
                System.out.println(e + " is NOT a multiple of " + n);
        }



    }
}

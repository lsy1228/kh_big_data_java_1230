package 홀수짝수나누어담기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//7개 정수를 입력받음 (배열생성)
//정수 입력 : 1 2 3 4 5 6 7
//홀수 : 1 3 5 7
//짝수 : 2 4 6
public class OddEvenSeparator {
    /*int[] inputArr = new int[7]; //입력받을 배열
    int[] oddArr = new int[7]; //홀수 넣을 배열
    int[] evenArr = new int[7]; //짝수 넣을 배열
    int oddCnt = 0;
    int evenCnt = 0;*/
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>(); //리스트는 크기를 넣을 필요가 없다

    //7개의 정수를 입력 받기
    void inputArray() {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        for(int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }*/
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력: ");
        while(true) {
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value); //ArrayList값을 추가함
        }
    }
    //홀수,짝수 나누어 담기
    void separatorArray() {
        /*for(int e : inputArr) {
            if(e % 2 == 0) evenArr[evenCnt++] = e;
            else oddArr[oddCnt++] = e;
        }*/
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    //홀수, 짝수 배열 출력
    void printArray() {
        /*System.out.print("짝수: ");
        for(int i = 0; i < evenCnt; i++)
            System.out.print(evenArr[i] + " ");
        System.out.println();
        System.out.print("홀수: ");
        for(int i = 0; i < oddCnt; i++)
            System.out.print(oddArr[i] + " "); */
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }
}

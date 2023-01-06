package 최소값최대값구하기;

import java.util.Scanner;

//정수값 입력받음
//입력된 정수 범위의 임의의 값 입력해서 배열 생성
//해당 배열에서 제일 작은 값과 제일 큰 값 찾기
//정수 값 입력 : 10
// 1 3 5 7 2 4 10 20 15
//Min : 1, Max : 20
public class MinMaxArray {
    public static void main(String[] args) {
        //입력 받은 정수로 배열을 생성
        //생성된 배열 크기만큼 순회하면서 정수값을 입력받음
        //배열에서 제일 작은 값과 제일 큰 값을 찾음
        //출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값을 입력하시오: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("배열의 값을 입력하시오: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int e : arr) {
            if(min > e)
                min = e;
            if(max < e)
                max = e;
        }
        System.out.println("최대값 : " + max + ", 최소값 : " + min);
    }
}

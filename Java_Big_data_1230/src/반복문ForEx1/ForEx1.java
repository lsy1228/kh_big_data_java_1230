package 반복문ForEx1;
//for 반복문 : for(초기식; 조건식; 증감식) {반복 수행 구간}

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        /*for(int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
        }*/

        /*int i = 1;
        while(i <= 100) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
            i++;
        }*/

        /*int i = 1;
        for(; i <= 100;) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
            i++;
        }*/

        /*int i = 1;
        for(; ;) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
            if(i == 100) break;
            i++;
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        //int sum = 0;
        /*while(num > 0) {
            sum += num;
            num--;
        }*/
        /*for(int i = 1; i <= num; i++) {
            sum += i;
        }*/
        //System.out.println("정수의 합은 : " + sum);

        int result = recursiveFunc(num);
        System.out.println(result);
    }
    public static int recursiveFunc(int n) {
        if(n == 1) return 1;
        return n + recursiveFunc(n-1);
    }
}

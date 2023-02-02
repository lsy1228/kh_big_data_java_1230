package 피타고라스정리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Pythagoras {
    public static void main(String[] args) {
        ArrayList<String> rstList = new ArrayList<>();
        String rst;
        while(true) {
            rst = CalcFunc();
            if(rst.equals("exit")) break;
            rstList.add(rst);
        }
        for(String e : rstList) System.out.println(e);

       /* Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while(true) { // 0 0 0 들어올 때까지 반복 수행

            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if(sum == 0) break;

            Arrays.sort(arr); //오름차순 정렬

            *//*int tmp = 0;
            for(int i = 0; i < 3; i++) {
                for(int j = i; j < 3; j++) {
                    if(arr[i] > arr[j]) {
                        tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
            }*//*
            if(arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }*/
    }
    static String CalcFunc() {
        int sum = 0;
        int[] arr = new int[3];
        Scanner sc =  new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum == 0) return "exit";
        Arrays.sort(arr);
        if(arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
            return "right";
        } else {
            return "wrong";
        }
    }
}

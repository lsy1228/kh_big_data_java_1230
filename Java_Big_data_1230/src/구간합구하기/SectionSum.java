package 구간합구하기;

import java.util.Scanner;

public class SectionSum {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();  //배열의 개수
        int tryNum = sc.nextInt();  //구하는 횟수
        int[] arr = new int[arrNum];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m;
        int n;
        long sum = 0;
        for(int i = 0; i < tryNum; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            for (int j = m - 1; j < n; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
            sum = 0;
        }*/

        //while문으로 작성한 경우
        /*while(tryNum != 0) {
            long sum = 0;
            m = sc.nextInt();
            n = sc.nextInt();
            for(int i = m - 1; i < n; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            tryNum--;
        }*/

        //구간합 공식 적용 : S[i] = S[i-1] + A[i]
        Scanner sc =  new Scanner(System.in);
        int arrNum = sc.nextInt();
        int tryNum = sc.nextInt();
        int[] arr = new int[arrNum];
        long[] sum = new long[arrNum];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i == 0) {
                sum[0] = arr[0];
            } else {
                sum[i] = sum[i-1] + arr[i];
            }
        }
        int left = 0, right = 0;
        while(tryNum != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            //구간합 계산하기 : sum[R] - sum[L-1], 인덱스로 계산하기 위해서는 -1을 더해준다
            //시간 복잡도 : O(1)
            if(left != 1) System.out.println(sum[right-1] - sum[left-2]);
            else System.out.println(sum[right-1] - 0);
            tryNum--;
        }

    }
}

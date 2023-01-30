package x보다작은수;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : 정수 N개로 이루어진 배열 A와 정수 X가 주어진다
//이때 A에서 X보다 작은 수를 모두 출력
//10 5 => 배열의 길이, 정수 X
//1 10 4 9 2 3 8 5 7 6
//결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt(); //배열의 개수
        int n = sc.nextInt();
        /*int val;
        for(int i = 0; i < listSize; i++) {
            val = sc.nextInt();
            list.add(val);
        }
        for(Integer e : list) {
            if(e < n)
                System.out.print(e + " ");
        }*/
        for(int i = 0; i < listSize; i++) {
            list.add(sc.nextInt());
            if(list.get(i) < n) System.out.println(list.get(i) + " ");
        }

    }
}

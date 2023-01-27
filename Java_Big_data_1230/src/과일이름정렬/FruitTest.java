package 과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//임의의 과일 이름 10개의 배열 생성
//길이 순으로 정렬하고 길이가 같은 경우 사전(알파벳 순서)을 정렬하기
//String의 length() : 양수, 음수
//String의 compareTo() 사용하면 해결할 수 있음
//Arrays.sort(배열이름, new Comparator<String>(){compare() 메소드 구현}
public class FruitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruit = new String[10];
        System.out.print("과일 이름 입력 : ");
        for(int i = 0; i < fruit.length; i++) {
            fruit[i] = sc.next();
        }
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1; //첫번째가 두번째보다 길이가 길면 정렬 조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); //두번째가 사전순서상 앞에 있으면 양수
                    }
                    else return -1; // 현 상태 유지
                }
            }
        });
        System.out.println("정렬 : " + Arrays.toString(fruit));

        String test = "abcd";
        System.out.println(test.compareTo("ab")); //양수
        System.out.println(test.compareTo("abcd")); //0
        System.out.println(test.compareTo("abcde")); //음수
    }
}

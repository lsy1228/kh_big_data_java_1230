package 저항;

import java.util.Scanner;

//전자제품에서는 저항이 들어간다, 처음 색 2개는 저항의 값, 마지막은 곱해야 하는 값
//색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
//값 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//곱 : 1, 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
//입력 : yellow violet red
//결과 : 4,700
//입력 : orange red blue
//결과 : 32,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //컬러값에 대한 문자열 배열 생성, 문자열을 비교해서 인덱스를 찾기 위해
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] num = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        int first = 0;
        int second = 0;
        int last = 0;

        String first_c = sc.next();
        String second_c = sc.next();
        String last_c = sc.next();

        for(int i = 0; i < color.length; i++) {
            if(first_c.equals(color[i])) first = i; //첫번째 입력받은 컬러 문자열과 배열의 컬러 이름이 같으면 인덱스를 대입
            if(second_c.equals(color[i])) second = i;
            if(last_c.equals(color[i])) last = i;
        }
        //System.out.println((long)(first * 10 + second) * last);
        //Math.pow(2, 4) => 2 * 2 * 2 * 2, 제곱함수를 사용해서 풀기
        //정수값 범위를 벗어날 수 있으므로 long으로 형변환 해줌
        System.out.println((long)(first * 10 + second) * (long)(Math.pow(10, last)));
    }
}

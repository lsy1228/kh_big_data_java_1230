package 배열로또번호생성;
//1 ~ 45 사이의 임의의 수 6개로 구성
//1. 배열로 로또번호 생성해 출력
//2. 배열로 로또번호 생성 (중복제거)
//3. 다른 자료구조를 사용해 로또번호 생성 (ArrayList, Set)

import java.util.Arrays;

public class RandomLotto {
    public static void main(String[] args) {
        //정수형 배열 생성, 개수는 6개 (로또번호 저장을 위한 공간)
        //반복문(6회)을 만들어 순회하면서 1 ~ 45 사이의 임의의 숫자를 배열에 대입
        //value = (int) ((Math.random * 45) + 1);
        //배열의 요소를 출력

        int[] Lotto = new int[6];

        /*for(int i = 0; i < 6; i++) {
            int value = (int)((Math.random()) * 45 + 1);
            System.out.printf("%d ", Lotto[i] = value);
        }*/
        int tmp; //생성된 로또 번호를 배열에 넣기전에 임시로 저장
        boolean isExist = false; //번호의 중복 여부 확인
        int index = 0;
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            //중복 확인 구간
            for(int i = 0; i < Lotto.length; i++) {
                if(Lotto[i] == tmp)
                    isExist = true; //배열에 생성된 로또번호가 있으면 true
            }
            //생성된 번호가 배열내에 없으면 저장하는데, 인덱스 계산 필요
            if(isExist == false)
                Lotto[index++] = tmp;
            //로또번호가 6개 만들어졌으면 반복문 탈출
            if(index == Lotto.length) break;
            //존재여부 확인하는 변수를 초기화
            isExist = false;
        }
        System.out.print(Arrays.toString(Lotto));

        /*for(int i = 0; i < Lotto.length; i++) {
            System.out.print(Lotto[i] + ", ");
        }
        System.out.println("\b\b");*/

    }
}

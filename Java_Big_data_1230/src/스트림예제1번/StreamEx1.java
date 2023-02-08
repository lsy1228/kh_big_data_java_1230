package 스트림예제1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림이란? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
//자료의 대상과 상관없이 동일한 연산 수행
//내부의 반복자 이용(반복문 배제)
//스트림은 한번 생성 된 후 최종연산을 통해 소모되면 재사용 안됨
//원본 데이터 변경하지 않음
//지연 연산 지원, 병렬 처리 지원
//스트림은 생성 -> 중개 연산 -> 최종 연산 순서로 진행
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        //스트림 생성, 중간 연산, 최종 연산
        //list.stream().filter(s->s.intValue() >= 5).forEach(System.out::println);
        int sum = list.stream().mapToInt(e->e).sum();   //mapToInt(중간연산, int 스트림을 구성), sum(최종연산)
        int count = (int) list.stream().count();    //count()의 반환 타입은 long이므로 변환 필요
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}

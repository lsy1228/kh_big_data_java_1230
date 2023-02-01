package 로또번호생성리스트이용;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//리스트 타입 => HashSet을 이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //개수 지정 필요없음
        int tmp; //로또번호를 임시로 저장하는 변수
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            if(!list.contains(tmp))
                list.add(tmp);
            if(list.size() == 6)
                break;
        }
        for(Integer e : list)
            System.out.print(e + " ");

        //HashSet 이용
        HashSet<Integer> lotto = new HashSet<>();
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            lotto.add(tmp);
            if(lotto.size() == 6)
                break;
        }
        System.out.println(lotto);
    }
}

package 상근이알람;
//상근이라는 친구는 매일 학교를 지각함
//창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려줌
//시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함
//24시간제

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        //시간을 입력받기 위해서 스캐너 객체 생성
        //생성된 객체로 시간과 분을 입력 받음 (24시간제)
        //변수를 만들어서 입력받은 시간과 분을 모두 분으로 환산
        //고려사항 : 환산한 시간이 45분 보다 적으면 별도의 계산이 필요
        //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림 (45를 빼줌)
        //계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("시간: ");
        int hour = sc.nextInt();
        System.out.print("분: ");
        int minute = sc.nextInt();
        int boon = (hour * 60) + minute ;

        if(boon < 45) {
            boon = (24 * 60) + minute;
        }
        boon -= 45;

        /*int alarm_h = boon / 60;
        int alarm_m = boon % 60;
        System.out.println("알람이 " + alarm_h + "시 " + alarm_m + "분에 울립니다");*/

        System.out.printf("%d시 %d분\n", (boon / 60), (boon % 60));
   }
}

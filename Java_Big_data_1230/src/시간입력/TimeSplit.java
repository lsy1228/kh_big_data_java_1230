package 시간입력;

import java.util.Scanner;
//split() 사용
//입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
//출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하시오: ");
        String time = sc.next();
        String[] num = time.split(":");

        int intHour = Integer.parseInt(num[0]);
        int intMin = Integer.parseInt(num[1]);
        int intSec = Integer.parseInt(num[2]);

        if(intHour > 11) {
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초",intHour, intMin, intSec);
        }
        else {
            System.out.printf("오전 %02d시 %02d분 %02d초",intHour, intMin, intSec);
        }
    }
}

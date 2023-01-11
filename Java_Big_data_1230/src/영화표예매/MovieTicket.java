package 영화표예매;
//현재 좌석 상태를 보여주는 메소드가 필요
//좌석을 예매하는 메소드가 필요
//판매된 좌석의 개수를 구해 총 판매금액을 구하는 메소드 필요

import java.util.Scanner;

public class MovieTicket {
    //극장의 좌석 상태를 표시하는 배열 만들기(총 10개)
    int seatStatus[] = new int[10];
    //현재 좌석 상태를 보여주는 메소드 작성
    //0이면 [ ], 1이면 [V]
    void printSeat() {
        for(int i = 0 ; i < seatStatus.length; i++) {
            if(seatStatus[i] == 0) System.out.print("[ ] ");
            else System.out.print("[V] ");
        }
        /*for(int val : seatStatus) {
            if(val == 0) System.out.println("[ ] ");
            else System.out.println("[V] ");
        }*/
        System.out.println();
    }
    //좌석을 예매하는 메소드
    void selectSeat( ) {
        //printSeat() 호출해 현재 좌석 상태를 보여줌
        //좌석번호를 입력받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력
        //좌석 예약이 성공하면 다시 printSeat()을 호출해 좌석 상태를 보여줌
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력하세요: ");
        int seatNum = sc.nextInt();
        if(seatStatus[seatNum - 1] == 0){
            seatStatus[seatNum - 1] = 1;
            printSeat();
        }
        else
            System.out.println("예약할 수 없는 좌석입니다. 다시 선택해주세요");

    }
    int totalAmount() {
        //좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        //좌석 개수와 좌석당 가격을 곱해서 결과를 반환
        int seatCnt = 0;

        for(int i = 0; i < seatStatus.length; i++) {
            if(seatStatus[i] == 1)
                seatCnt++;
        }
        return seatCnt * 12000;

        /*for(int val : seatStatus) {
            if(val == 1) seatCnt++;
        }
        return  seatCnt * 12000;*/
    }
}

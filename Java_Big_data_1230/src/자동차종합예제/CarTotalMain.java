package 자동차종합예제;

import java.util.Scanner;

public class CarTotalMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300}; //인덱스로 해당 거리를 구함
        Car car = null; //부모의 클래스의 참조 변수로 선택된 차량의 객체를 연결하기 위한 것
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int city = sc.nextInt();
        System.out.print("승객의 수 : ");
        int passCnt = sc.nextInt();
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int sel = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (sel) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("GV80"); break;
            case 3 : car = new Bus("관광버스"); break;
            default : System.out.println("차량 선택이 잘 못 되었습니다");
        }
        car.setMode(isMode);
        int moveCnt = car.getMoveCnt(passCnt);
        System.out.println("======= " + car.getName() + " =======");
        System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[city], moveCnt) + "회");
        System.out.printf("총 소요 시간 : %.2f\n", car.getMoveTime(dist[city], moveCnt));
    }
}

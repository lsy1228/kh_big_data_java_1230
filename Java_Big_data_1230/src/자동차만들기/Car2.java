package 자동차만들기;
public abstract class Car2 {
    int maxSpeed; //최고속도
    int gasMil; //연비
    int fuelTank; //연료탱크 크기
    int seat; //좌석수
    int moveCnt;
    String name; //이름

    void result(int area, int person) {
        //이동횟수
        if(person % seat == 0) {
            moveCnt = person / seat;
        } else moveCnt = (person / seat) + 1;
        System.out.println("차 종류는 " + name);
        //총 비용
        int totalM = (area /gasMil * 2000) * moveCnt;
        System.out.println("총 비용은 " + totalM + "입니다");
        //주유 횟수
        int gasCnt;
        if(((area * moveCnt) /gasMil) % fuelTank != 0)
            gasCnt = (((area * moveCnt) /gasMil) / fuelTank) + 1;
        else
            gasCnt = ((area * moveCnt) /gasMil) / fuelTank;
        System.out.println("주유 횟수는 " + gasCnt + "회 입니다");
        //총 이동거리
        double totalD = (double) (area * moveCnt) / maxSpeed;
        System.out.printf("총 이동시간 %.2f입니다\n", totalD);

    }
    abstract void extraMode (boolean mode);
}

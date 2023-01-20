package 자동차종합예제;

public abstract class Car {
    protected int speed; //속도
    protected int fuelEff; //연비
    protected int fuelTank; //연료탱크
    protected int seatCnt; //좌석수
    protected String name; //자동차 이름

    public String getName() {
        return name;
    }

    //부가기능은 각 차량마다 다르기 때문에 부모는 기능만 명시하고 상속받은 자식이 해당 기능을 구현함
    public abstract void setMode(boolean isMode);

    //이동 횟수 구하기 : 외부의 입력값으로 승객의 수가 필요
    public int getMoveCnt(int passCnt) {
        if(passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    //총 이동 비용은 매개변수로 거리와 이동횟수가 필요
    public int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }

    //총 주유 횟수 : 총 이동 거리를 구하고 이를 연비로 나누고 이를 다시 연료탱크 크기로 나눔
    public int getRefuelCnt(int dist, int moveCnt) {
        if(((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }

    //총 소요 시간
    public double getMoveTime(int dist, int moveCnt) {
        return (double) dist * moveCnt / speed;
    }


}

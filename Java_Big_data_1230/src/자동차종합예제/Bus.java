package 자동차종합예제;

public class Bus extends Car{
    public Bus(String name) {
        this.name = name;
        speed = 150;
        fuelEff = 5;
        fuelTank = 100;
        seatCnt = 20;
    }
    @Override
    public void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}

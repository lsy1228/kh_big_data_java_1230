package 자동차종합예제;

public class Sedan extends Car{
    public Sedan(String name) {
        this.name = name;
        speed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }
    @Override
    public void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }
}

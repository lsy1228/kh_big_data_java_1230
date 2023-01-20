package 자동차만들기;

public class Sedan2 extends Car2 {
    public Sedan2(String name) {
        this.name = name;
        this.maxSpeed = 200;
        this.gasMil = 12;
        this.fuelTank = 45;
        this.seat = 4;
    }
    @Override
    void extraMode(boolean setMode) {
        if(setMode)
            seat +=1;
    }
}

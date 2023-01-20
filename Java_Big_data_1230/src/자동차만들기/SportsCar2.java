package 자동차만들기;

public class SportsCar2 extends Car2 {
    public SportsCar2(String name) {
        this.name = name;
        maxSpeed = 250;
        gasMil = 8;
        fuelTank = 30;
        seat = 2;
    }
    @Override
    void extraMode(boolean setMode) {
        if(setMode)
            maxSpeed *= 1.2;
    }
}

package 자동차만들기;

public class Bus2 extends Car2 {
    public Bus2(String name) {
        this.name = name;
        maxSpeed = 150;
        gasMil = 5;
        fuelTank = 100;
        seat = 20;
    }
    @Override
    void extraMode(boolean setMode) {
        if(setMode)
            fuelTank +=30;
    }

}

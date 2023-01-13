package 오버라이딩제약;

public class Vehicle {
    protected int speed; //protected : 상속 관계와 동일 패키지 내에서 접근 가능
    protected String color;
    protected String name;
    //final은 최종 상태를 의미하며, 메소드에서 사용시 오버로딩이 불가함을 의미
    final void accelerator() {
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
class SportsCar extends Vehicle {
    private boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false; //터보모드가 켜지면 차의 최고속도를 증가 시키는 기능, 상속받은 기능이 아님
        speed = 280; //Vehicle로 부터 상속 받음
        this.name = name; //생성자로부터 이름을 입력받아 인스턴스 필드의 초기값으로 사용
        color = "Red";
    }
    int getSpeed() { //Getter라고 부른다.
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo() { //getter
        return isTurbo;
    }
    void setTurbo(boolean x) { //Setter : 외부에서 내부에 있는 필드의 값을 변경하기 위해 사용
        isTurbo = x;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}
class ElectricCar extends Vehicle {
    boolean isAutoDrv;
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean getAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도: " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);
    }
}
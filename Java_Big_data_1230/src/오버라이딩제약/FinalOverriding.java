package 오버라이딩제약;
//오버라이딩은 부모가 가진 메소드를 재정의해서 사용하는 것
//부모의 클래스가 실체가 있는 클래스이면 오버라이딩은 선택사항임
//부모의 클래스에서 메소드 구현시 상속 받은 자식에서 오버라이딩을 할 수 없도록 금지할 수 있음
public class FinalOverriding {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        ElectricCar electricCar = new ElectricCar("EV6");
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
    }
}

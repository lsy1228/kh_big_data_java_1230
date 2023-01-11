package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsung = new TV(); //기본 생성자 호출
        TV lg = new TV(true, 59, 15); //매개변수가 있는 생성자 호출

        lg.getTV();

        samsung.setOn(true);
        samsung.setChannel(1300);
        samsung.setVolume(30);
        samsung.getTV();

    }
}

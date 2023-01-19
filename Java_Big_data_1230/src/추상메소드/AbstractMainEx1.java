package 추상메소드;

public class AbstractMainEx1 {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("Galaxy s22");
        phone.setPower(true);
        phone.call();
        phone.internet();
    }
}

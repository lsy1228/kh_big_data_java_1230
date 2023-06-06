package 추상클래스연습;

// 추상클래스는 느슨한 결합 관계를 만들기 위해서 사용됨
// 특징은 상속을 주는 부모는 객체를 만들 수 없음
// 추상메소드를 상속 받으면 자식 클래스에서 해당 메소드를 반드시 구현 해야 함
// 단일 상속만 지원함
public class AbstractEx05 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S23");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}

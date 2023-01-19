package 인터페이스메소드;
//인터페이스란? 완전 추상화 개념으로 인터페이스에 포함된 메소드는 일반적으로 전부 추상메소드
//메소드를 선언하면 추가 여부에 상관없이 public abstract 키워드로 동작
//인터페이스 상속의 키워드는 implements
public interface NetWorkAdapter {
    void connect(); //public abstract가 자동으로 붙어있는 상태
}
class WiFi implements NetWorkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 WiFi에 연결 되었습니다");

    }
}
class FiveG implements NetWorkAdapter {
    String company;
    public FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 FiveG에 연결 되었습니다");
    }
}
class LTE implements NetWorkAdapter {
    String company;
    public LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + "의 LTE에 연결 되었습니다");
    }
}
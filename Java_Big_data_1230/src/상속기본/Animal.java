package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
//상속을 받기 위해서는 extends
//Animal class로 부터 상속을 받아 Dog class를 생성
//Dog class에서 아무런 기능을 구현하지 않아도 자도으로 부모의 필드와 메소드가 포함되어 있음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + " 잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override //어노테이션
    void sleep() {
        System.out.println(name + "가 집에서 잠을 잡니다."); //오버라이딩
    }
    //오버로딩 관계가 성립함
    void sleep(int time) {
        System.out.println(name + "가 " + time + "시간 동안 " + "집에서 잠을 잡니다.");
    }
}

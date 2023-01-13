package 객체타입확인;
//instanceof : 객체 타입 확인 연산자, 부모와 자식 관계 성립 여부를 확인
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");

        System.out.println(parent instanceof Parent); //true parent라는 객체가 Parent 클래스로부터 만들어진게 맞는지 확인
        System.out.println(child instanceof Child); //true
        System.out.println(parent instanceof Child); //false
        System.out.println(child instanceof Parent); //true
    }
}
class Parent {
    String name;
    public Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    public Child(String name) {
        super(name);
        this.name = name;
    }
}
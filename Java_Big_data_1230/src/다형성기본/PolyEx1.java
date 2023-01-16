package 다형성기본;
//다형성이란? 여러가지 타입을 한 가지 타입으로 처리하는 기술을 의미 (상속관계를 이용)
//부모클래스의 참조변수로 자식클래스의 객체(인스턴스)를 참조하는 방법
//단, 부모클래스가 가지고 있는 메소드가 오버라이딩이 되어 있는 경우에 해당
public class PolyEx1 {
    public static void main(String[] args) {
        ChildPoly childPoly = new ChildPoly(); //자식클래스의 참조 변수로 자식 객체를 참조
        childPoly.display();
        childPoly.out();

        ParentPoly parentPoly = new ChildPoly(); //부모클래스의 참조 변수로 자식 객체를 참조
        parentPoly.display();
    }
}

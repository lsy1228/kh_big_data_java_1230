package 클래스다이어그램;
//클래스 다이어그램 (클래스 이름이 Circle)
//+ PI : double = 3.14 => public static final PI = 3.14
//- radius : double => private double radius
//+ Circle(radius:double) => (=생성자) public Circle(double radius)
public class ClassDiagram {
    public static void main(String[] args) {
        Circle circle = new Circle(20.0); //객체 생성시 생성자의 매개변수를 넣어야 함
        circle.setRadius(3.1);
        circle.draw();
    }
}
class Circle {
    public final static double PI = 3.14;
    private double radius; //접근제한자 확인 필요 (-는 private를 의미함)

    public Circle(double radius) { //생성자 호출시 매개변수가 필요함
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static double getPi() {
        return PI;
    }
    public void draw() {
        System.out.println("반지름은 " + radius + "cm인 원을 그립니다");
    }
}

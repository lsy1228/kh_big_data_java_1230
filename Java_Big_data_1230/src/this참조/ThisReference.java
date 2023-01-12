package this참조;
//this : 참조변수, this 참조변수는 자기자신의 객체 주소를 참조하는 변수
//this() : 메소드, 생성자에서만 사용가능
//this() 목적 : 같은 클래스내에서 여러개의 생성자가 만들어지는 경우, 중복된 코드가 많이 생기는데 이를 보완하기 위해 사용
public class ThisReference {
    public static void main(String[] args) {
    }
}

class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    public Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public Car(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    public Car() {
        this("싼타페", 2022, "Red");
    }
    public Car(String model) {
        this(model, 2022, "Red", 220);
    }
}
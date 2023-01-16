package 다형성응용2;

public class Driver {
    String name; //운전자 이름
    public Driver(String name) {
        this.name = name;
    }
    public void drive(Vehicle vehicle) {
        System.out.print(name + "의 ");
        vehicle.run();
    }
}

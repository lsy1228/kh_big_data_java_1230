package 다형성응용2;
import java.util.Scanner;
//매개변수의 다형성
public class PolyCar {
    public static void main(String[] args) {
        Driver driver = new Driver("우영우");
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        Truck truck = new Truck();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택하세요 [1]스포츠카, [2]버스, [3]트럭 : ");
        int selCar = sc.nextInt();
        switch (selCar) {
            case 1 : driver.drive(sportsCar); break;
            case 2 : driver.drive(bus); break;
            case 3 : driver.drive(truck); break;
        }
    }
}

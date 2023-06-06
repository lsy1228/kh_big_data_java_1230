package 다형성복습;

import java.util.Scanner;

// 다형성의 특성을 활용하여 여러가지 타입을 한가지 타입으로 처리하는 기술
// 즉, 부모 클래스 타입의 참조 변수로 자식 클래스의 인스턴스를 참조할 수 있음
public class PolyEx05 {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();
        System.out.print("운전할 차를 선택하세요 [1]버스 [2]택시 [3]스포츠카 : ");
        switch (sel) {
            case 1 : driver.drive(bus); break;
        }
    }
}


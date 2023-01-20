package 자동차만들기;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car2 car2 = null;
        int dist = 0;
        System.out.print("이동 지역을 선택하세요 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int selArea = sc.nextInt();
        if(selArea == 1) dist = 400;
        if(selArea == 2) dist = 150;
        if(selArea == 3) dist = 200;
        if(selArea == 4) dist = 300;

        System.out.print("이동할 승객 수를 입력하세요 : ");
        int passengerNum = sc.nextInt();

        System.out.print("이동 차량을 선택하세요 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carNum = sc.nextInt();
        switch (carNum) {
            case 1 : car2 = new SportsCar2("SportsCar"); break;
            case 2 : car2 = new Sedan2("sedan"); break;
            case 3 : car2 = new Bus2("bus"); break;
            default: System.out.println("다시 선택"); break;
        }

        System.out.print("부가 기능의 ON/OFF를 선택하세요 [1]ON [2]OFF: ");
        int onOff = sc.nextInt();
        boolean mode = (onOff == 1) ? true : false;

        car2.result(dist, passengerNum);
        car2.extraMode(mode);


    }
}

package 에어컨만들기;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in); //에어컨을 켜기 위해 입력 받음
        int elapsedTime = 0; //경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; //온도가 변경되어야할 조건 확인
        System.out.print("에어컨을 켜시겠습니까? [yes/no] : ");
        String isOn = sc.next(); //에어컨을 켜기 위한 문자열을 입력 받음

        if(isOn.equalsIgnoreCase("yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirConState(); //온도와 바람세기를 설정하고 설정에 따라 쿨러나 히터를 켬
            while(true) {
                sleep(1000); //1초
                elapsedTime++;
                switch (lgAirCon.getWidStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                    default:
                }
                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다");
                    break;
                }
            }
        }
    }
}

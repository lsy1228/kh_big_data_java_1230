package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        /*int num1 = 2147483647; //byte형은 1byte 크기이며 -128 ~ 127까지
        int num2 = -32768;


        num1++;
        num2--;

        System.out.println(num1);
        System.out.println(num2);*/

        int age = 100; //정수값을 저장할 수 있는 age라는 변수를 선언하고 초기값으로 100을 대입
        double value = 0.0; //실수값을 저장할 수 있는 value라는 변수를 선언하고 초기값으로 0.0을 대입

        int taxRate; //camel 표기법 : JAVA - 무조건 camel 표기법을 따라야 한다
        int tax_rate; // snake 표기법 : C, Python

        int num1 = 0, num2 = 0; //같은 타입으로 여러개의 변수를 선언, 콤마(,)로 구분
        double num3 = 3.14; //실수 타입의 변수를 선언과 동시에 초기화
        int hour = 3;
        int minute = 5;
        //System.out.println(hour + "시 " + minute + "분");

        NameCard nameCard = new NameCard();
        nameCard.name = "곰돌이사육사";
        nameCard.age = 30;
        nameCard.address = "경기도 수원시";
        nameCard.eMail = "258735@naver.com";
        nameCard.phoneNum = "01012345678";
        System.out.println(nameCard.name);


    }
}

//사용자 정의 자료형
class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phoneNum;
}

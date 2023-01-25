package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; //public final static이 자동으로 추가됨(컴파일러가)
    int MIN_TEMP = 0;
    void airConOn(); //자동으로 추상메소드가 됨 (abstract 자동 추가됨)
    void airConOff();
    void setAirConTemp(int tmp);

}

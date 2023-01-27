package 래퍼클래스;
//Wrapper 클래스란? 기본타입을 객체타입으로 변환 시켜주는 것
//필요한 이유 : 컬렉션 프레임워크에서 사용되는 자료형은 모두 객체 타입이므로 기본 타입을 사용할 수 없음
//객체타입으로 사용하는 이유 : 일반화 프로그램을 위해서이며,
//일반화 프로그램은 여러가지 다양한 데이터 타입에 대해서 동일한 자료구조로 관리하기 위해서
public class WrapperTest {
    public static void main(String[] args) {
        Integer num = 10;
        int n = num.intValue();
    }
}

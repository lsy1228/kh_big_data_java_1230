package 예외처리예제7번;
//사용자 정의 예외 클래스 만들기 : 자바에서 제공해주는 예외클래스가 사용목적에 맞는것 없을 때 직접 예외 클래스를 만들 수 있음

public class ExceptionEx7 {
    public static void main(String[] args) {
        CheckEven checkEven = new CheckEven();
        int number1 = 100;
        int number2 = 99;
        try {
            System.out.println(checkEven.printEven(number1));
            System.out.println(checkEven.printEven(number2));
        } catch (EvenException e) {
            e.printStackTrace();
        }
    }
}
//예외 처리 클래스 만들기
class EvenException extends Exception {
    private Integer number = null;

    public EvenException(Integer number) {
        this.number = number;
    }
    @Override
    public String getMessage() {
        if(number == null) {
            return "숫자가 아닙니다";
        } else
            return Integer.toString(number) + "는 짝수가 아닙니다";
    }
}
class CheckEven {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0)
            throw new EvenException(num);
        else return num;
    }
}
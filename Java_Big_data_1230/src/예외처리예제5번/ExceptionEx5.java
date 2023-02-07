package 예외처리예제5번;

import java.io.FileWriter;
import java.io.IOException;

//finally : 프로그램 실행 도중 예외가 발생할 가능성이 있는 코드에 try 구문을 걸게 되는데
//이때, 예외가 발생하면 catch 구문으로 진행하고 그렇지 않으면 아래 코드가 실행된다
//이 경우, 예외 여부에 상관없이 항상 실행되어야 할 구문이 있다면 finally로 처리 할 수 있다
public class ExceptionEx5 {
    public static void main(String[] args) {
        /*int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("여기는 예외가 발생한 구문입니다");
        } finally {
            shouldBeRun();
        }
    }
    static void shouldBeRun() {
        System.out.println("OK, Thanks...");*/
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(f != null)  {
                try {
                   f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

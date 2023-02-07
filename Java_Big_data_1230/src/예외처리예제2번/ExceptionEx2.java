package 예외처리예제2번;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileNotFoundException : 존재하지 않는 파일을 열려고 시도할 때 발생
public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
        br.readLine();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다");
        }
    }
}

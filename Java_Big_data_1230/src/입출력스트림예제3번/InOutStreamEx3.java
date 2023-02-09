package 입출력스트림예제3번;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//바이트 출력 스트림의 최상위 추상 클래스는 OutputStream
//문자 출력 스트림의 최상위 추상 클래스는 Write
public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        //char[] data = "일타스캔들 재밌음~~".toCharArray();
        String data = "재벌집 막내아들은 재밌었는데 끝이 별로";
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]);
//        }
        writer.write(data);
        writer.flush();  //write() 이후에 버퍼를 비움
        writer.close();  //스트림의 자원을 반납하고 닫음
    }
}

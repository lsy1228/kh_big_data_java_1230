package 기본타입보조스트림;
//기본타입보조스트림 : 바이트 스트림은 바이트 단위로 입출력하기 때문에 자바의 기본 데이터 타입을 사용할 수 없음
//이를 해결하기 위해 보조 스트림을 연결해 사용함 (DataInputStream, DataOutputStream)

import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("기본타입보조스트림.bin");
        DataOutputStream dos = new DataOutputStream(fos);   //프로그램에서 사용할 수 있는 기본 타입을 지원하는 보조 스트림
        dos.writeUTF("남해이");    //문자열 메소드
        dos.writeDouble(99.8);     //실수형 메소드
        dos.writeInt(1);           //정수형 메소드

        dos.writeUTF("남행선");
        dos.writeDouble(65.5);
        dos.writeInt(2);

        dos.writeUTF("최지열");
        dos.writeDouble(95.5);
        dos.writeInt(3);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("기본타입보조스트림.bin");
        DataInputStream dis = new DataInputStream(fis);

        for(int i = 0; i < 3; i++) {
            String name = dis.readUTF();    //문자열을 읽음
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

    }
}

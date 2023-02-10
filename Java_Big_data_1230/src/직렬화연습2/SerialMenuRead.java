package 직렬화연습2;
import 직렬화연습.CoffeeMenuInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();
    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:/직렬화파일/커피메뉴.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, CoffeeMenuInfo> map = (Map<String, CoffeeMenuInfo>) ois.readObject();
        for(String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("---------------------------------");
        }
        fis.close();
        ois.close();
    }
}

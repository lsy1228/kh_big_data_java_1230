package 인터페이스메소드;
import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetWorkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택하세요 [1]WIFI [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new WiFi("KT MegaPass");
                break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                break;
            case 3 :
                adapter = new LTE("LG U+");
                break;
            default:
                System.out.println("네트워크를 잘못 선택하였습니다");
        }
        adapter.connect();
    }
}

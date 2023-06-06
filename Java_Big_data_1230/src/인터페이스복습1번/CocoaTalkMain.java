package 인터페이스복습1번;

import java.util.Scanner;

public class CocoaTalkMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("곰돌이");
        cocoaTalk.writeMsg("벌써 여름이 왔네요 잘 지내시죠?");
        NetAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("네트워크 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTalk.send(adapter);
    }
}

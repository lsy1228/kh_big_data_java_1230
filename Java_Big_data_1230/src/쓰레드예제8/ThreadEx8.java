package 쓰레드예제8;

import static java.lang.Thread.sleep;

//데몬스레드 : 다른 스레드의 작업을 돕는 보조 스레드, 다른 스레드가 모두 종료되면 자동으로 종료
//스레드를 start() 하기 전에 setDaemon(true) 설정만 하면 됨
public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //데몬스레드 설정
        autoSaveThread.start();
        sleep(30000);
    }
}
class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함");
    }
    @Override
    public void run() {
        while(true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }
}
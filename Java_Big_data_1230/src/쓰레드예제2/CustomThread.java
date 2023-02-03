package 쓰레드예제2;

public class CustomThread extends Thread {
    @Override
    public void run() { //쓰레드가 실행되는 부분
        //System.out.println("Thread 상속받아 쓰레드 생성");
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
            try {
                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("" + Thread.currentThread() + sum);
        }
        System.out.println(Thread.currentThread() + " 합계 : " + sum);
    }
}

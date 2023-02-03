package 쓰레드예제7;
//synchronized(동기화) : 멀티 스레드에서 특정 메소드나 블럭{}에 대해 lock(잠금)을 설정하는 것
//동시 접근으로 인해 발생할 수 있는 문제를 해결하기 위해 사용되며, 사용시 급격한 성능저하가 발생 할 수 있음
import static java.lang.Thread.sleep;

public class ThreadEx7 {
    public static void main(String[] args) {
        SharedValue sharedValue = new SharedValue();
        //Runnable 인터페이스 익명의 스레드 생성
        Runnable th1 = new Runnable() {
            @Override
            public void run() {
                sharedValue.setValue(100);
            }
        };
        Thread thread1 = new Thread(th1);
        thread1.setName("스레드 1");   //스레드 이름을 설정
        thread1.start();

        //Runnable 인터페이스 람다식으로 익명의 스레드 생성
        Runnable th2 = () -> {
            sharedValue.setValue(200);
        };
        Thread thread2 = new Thread(th2);
        thread2.setName("스레드 2");
        thread2.start();
    }
}
class SharedValue {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try {
            sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + "의 값 : " + getValue());
    }
}

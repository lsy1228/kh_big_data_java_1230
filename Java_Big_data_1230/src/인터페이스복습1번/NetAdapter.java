package 인터페이스복습1번;

public interface NetAdapter {
    void connect();     // 자동으로 public abstract가 추가됨
    void send(String msg);
}

class WiFi implements NetAdapter {
    @Override
    public void connect() {
    }
    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetAdapter {
    @Override
    public void connect() {
    }
    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}
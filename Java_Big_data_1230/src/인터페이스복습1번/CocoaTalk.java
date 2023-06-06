package 인터페이스복습1번;

public class CocoaTalk {
    private String to;
    private String msg;
    public CocoaTalk(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);
    }
}

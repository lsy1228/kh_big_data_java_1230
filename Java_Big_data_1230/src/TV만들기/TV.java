package TV만들기;
//Television 만들기
public class TV {
    private boolean isOn; //전원버튼, 접근 제한자 private 설정 (같은 클래스내에서만 접근 가능)
    private int channel; //0 ~ 999
    private int volume; //0 ~ 100
    TV() {
        isOn = false;
        channel = 10;
        volume = 10;
        System.out.printf("기본생성자 호출, 전원 : %b, 채널 : %d, 볼륨 : %d\n", isOn, channel, volume);
    }
    TV(boolean isOn, int cnl, int vol) {
        this.isOn = isOn;
        channel = cnl;
        volume = vol;
    }
    //외부에서 전원 ON/OFF 할 수 있는 기능을 제공(리모콘)
    public void setOn(boolean isOn) {
        this.isOn = isOn;
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("TV가 " + onOffStr + "되었습니다.");
    }
    //외부에서 채널을 변경할 수 있는 기능을 제공
    public void setChannel(int cnl) {
        if(cnl >= 0 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을 " + channel + "로 변경하였습니다.");
        }
        else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100){
            volume = vol;
            System.out.println("볼륨을 " + volume + "로 변경하였습니다.");
        }
        else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    public void getTV() {
        String onOffStr = (isOn) ? "ON" : "OFF";
        System.out.println("===== TV 정보 =====");
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);
    }
}

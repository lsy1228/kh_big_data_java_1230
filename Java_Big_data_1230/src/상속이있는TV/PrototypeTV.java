package 상속이있는TV;
//PrototypeTV는 TV의 기본 기능을 가짐
public class PrototypeTV {
    protected boolean isPower; //전원에 대한 설정값 저장
    protected int channel; //채널 정보 저장
    protected int volume; //볼륨값 저장

    public PrototypeTV() {
        this.isPower = false;
        channel = 10;
        volume = 10;
    }
    //생성자 오버로딩 일어남
    public PrototypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
        }
        else System.out.println("채널 설정 범위가 아닙니다");
    }
}
class ProductTV extends PrototypeTV {
    private String name;
    private boolean isInternet;
    ProductTV () {
        super(true, 30, 30); //부모의 생성자를 호출
        name = "LG TV";
    }
    ProductTV (String name) {
        isPower = false;
        channel = 10;
        isInternet = false; //기본적으로는 채널 설정 모드로 동작
        this.name = name;
    }
    void setPower(boolean power) {
        isPower = power;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <=100) {
            volume = vol;
        }
        else System.out.println("볼륨 설정 범위를 벗어났습니다");
    }
    @Override
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 2000) {
            channel =  cnl;
        }
        else System.out.println("채널 설정 범위를 벗어났습니다");
    }
    //메소드 오버로딩
    public void setChannel(int cnl, boolean isInternet) {
        if(isInternet) {
            System.out.println("인터넷 모드 입니다");
            this.isInternet = true;
        } else {
            this.isInternet = false;
            if(cnl > 0 && cnl < 2000) {
                channel =  cnl;
            }
            else System.out.println("채널 설정 범위를 벗어났습니다");
        }
    }
    void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + isInternet);
    }
}


package 제너릭응용;

public class Powder extends Material {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다");
    }
    @Override
    public String toString() {
        return "재료는 Powder 입니다";
    }

}

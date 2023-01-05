package ContinueEx1;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) continue; //짝수일 경우, for문으로 돌아감
            System.out.println(i);
        }
    }
}

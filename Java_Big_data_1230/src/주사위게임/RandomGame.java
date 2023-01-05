package 주사위게임;
//주사위 2개를 던져서 합이 12이면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while(true) {
            cnt++;
            rand1 = (int) ((Math.random()) * 6 + 1); //랜덤 함수는 실수형으로 값이 생성되므로 형변환이 필요, 난수 발생
            rand2 = (int) ((Math.random()) * 6 + 1); //난수 발생
            if((rand1 + rand2) == 12) {
                System.out.printf("무인도를 %d번만에 탈출합니다", cnt);
                break;
            }
            else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다");
            }
        }
    }
}

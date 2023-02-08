package 블랙잭;
import java.util.Scanner;
// 5 25 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 카드 중 3장의 카드를 골라서 주어진 값과 같거나 작은 값 중 제일 가까운 값을 찾아야 함

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //3장의 카드의 합으로 만들어진 결과값
        System.out.print("카드 갯수 : ");
        int cardNum = sc.nextInt();
        System.out.print("카드 합 : ");
        int s = sc.nextInt(); //입력받는 3장의 카드의 합
        int result = 0;
        int[] card = new int[cardNum];
        System.out.print("뽑은 카드 : ");
        for(int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }
        for(int i = 0; i < card.length; i++) {
            for(int j = i + 1; j < card.length; j++) {
                for(int k = j + 1; k < card.length; k++) {
                    sum = card[i] + card[j] + card[k];
                    if(sum <= s && result < sum) result = sum;
                }
            }
        }
        System.out.println("결과값 : " + result);
    }
}

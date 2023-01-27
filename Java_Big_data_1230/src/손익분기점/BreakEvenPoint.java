package 손익분기점;
import java.util.Scanner;
//첫번째 : 고정비용
//두번째 : 가변비용
//세번째 : 판매가격
//손익분기점을 달성 할 수 없으면 -1 반환
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost; //고정비용
        int variableCost; //가변비용(생산비용)
        //int breakPoint = 0; //손익분기점이 발생하는 판매량
        int productCost; //제품 가격
        System.out.print("고정비용 : ");
        fixCost = sc.nextInt();
        System.out.print("가변비용 : ");
        variableCost = sc.nextInt();
        System.out.print("가격 : ");
        productCost = sc.nextInt();

        if(variableCost >= productCost) {
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost / (productCost - variableCost)) + 1);
    }
}

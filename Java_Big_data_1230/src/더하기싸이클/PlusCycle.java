package 더하기싸이클;
import java.util.Scanner;
//입력 받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 돌아오는지 확인하는 문제
//입력 26 ==> 10의 자리의 수, 1의 자리의 수를 분리해서 더함 ==> 2 + 6 = 8
//입력 받은 수의 1의 자리의 수와 계산된 수의 1의 자리수로 다시 연선 ==> 68
//-------1 Cycle-------
//68 => 6 + 8 = 14
//계산된 수는 84
//-------2 Cycle-------
//84 => 8 + 4 = 12
//계산된 수는 42
//...
public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int inputNum = sc.nextInt();
        int num = inputNum; //입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듦
        int newNum;
        int sumNum;
        int cnt = 0; //사이클 횟수 누적
        while(true) {
            sumNum = (num / 10) + (num % 10);
            newNum = ((num % 10) * 10) + (sumNum % 10);
            cnt++;
            if(newNum == inputNum) break;
            num = newNum;
        }
        System.out.println(cnt);
    }
}

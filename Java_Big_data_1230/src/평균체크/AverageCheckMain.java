package 평균체크;
import java.util.Scanner;
//        5 ==> 총 테스트 케이스
//        5 50 50 70 80 100 ==> (학생수 성적 성적 성적 성적 성적) ==> 평균이 넘는 비율을 백분율로 표기
//        7 100 95 90 80 70 60 50
//        3 70 90 80
//        3 70 90 81
//        9 100 99 98 97 96 95 94 93 91
public class AverageCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 개수 입력 : ");
        int testCnt = sc.nextInt(); //테스트케이스에 대한 개수
        double result[] = new double[testCnt];

        for(int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for(double e : result) {
            System.out.printf("%.3f%%\n", e);
        }
    }
    //학생 수를 입력받고 입력받은 학생 수만큼의 성적을 입력 받음
    //평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
    //구해서 평균을 가지고 각각의 입력받은 성적을 비교해 평균을 넘는 학생 수를 구함
    //구해진 학생수를 백분율로 변환해서 반환
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int total = 0; //총점을 구하기 위한 변수
        int overCnt = 0; //평균을 넘는 학생의 수를 구하는 변수
        int studentCnt = sc.nextInt(); //학생 수
        int[] score = new int[studentCnt]; //학생의 수만큼 성적을 입력 받기 위한 배열 생성
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt(); //학생의 수만큼 성적을 입력 받아 배열에 대입
            total += score[i]; //학생의 수만큼 입력된 성적을 누적해서 총점을 구함
        }
        double average = (double)total / studentCnt; //총점을 학생의 수로 나누어 평균을 구함
        for(int e : score) { //e는 배열에 포함되어 있는 각각의 학생 성적
            if(e > average) overCnt++; //평균을 넘는 학생의 수 구함
        }
        return (double)overCnt / studentCnt * 100; //소수점 이하가 있는 백분율 반환
    }
}


package 배열을향상된For;
//향상된 for문은 배열요소를 처음부터 끝까지 자동 순회
//배열의 내부의 값을 변경 할 수 없음

public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 50, 50};
        int sum = 0;

        /*for(int e : score) {
            sum += e;
        }*/

        for(int e : score) {
            e += 10;
            sum += e;
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , ((double)sum / score.length));

        sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i]; //sum = sum + score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , ((double)sum / score.length));
    }
}

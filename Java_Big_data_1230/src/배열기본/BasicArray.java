package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        /*int[] score = new int[3]; //타입[] 참조변수 = new 타입[크기];
        score[0] = 90;
        score[1] = 88;
        score[2] = 70;*/

        int[] score = {90, 88, 70};
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
                sum += score[i]; //sum = sum + score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , ((double)sum / score.length));
    }
}

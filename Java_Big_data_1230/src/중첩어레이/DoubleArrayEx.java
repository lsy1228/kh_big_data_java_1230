package 중첩어레이;
//2차원 배열에 대해서
//
public class DoubleArrayEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i = 0; i < arr.length; i++) { //행의 개수를 알 수 있음
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }

        }
        for(int i = 0; i < arr.length; i++) { //행의 개수를 알 수 있음
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //향상된 for문으로 나타낸 출력문
        /*for(int[] row  : arr) {
            for(int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }*/
    }
}

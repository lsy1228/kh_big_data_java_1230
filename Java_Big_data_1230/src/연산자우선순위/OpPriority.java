package 연산자우선순위;

public class OpPriority {
    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int rst1, rst2, rst3;
        rst1 = val1 + val2 * val3; //30
        rst2 = (val1 + val2) * val3; //50
        rst3 = val1 + (val2++) * val3; //35

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
    }
}

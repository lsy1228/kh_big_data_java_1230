package 메소드오버로딩;
//메소드 오버로딩? 동일한 이름의 메소드를 매개변수의 타입이나 개수, 순서에 따라 다르게 호출하는 것
//반환타입은 보지않음, 당연하게 메소드 이름은 동일해야함
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(100, "100", 200));
        System.out.println(sum("seoul", "busan", "incheon"));
        System.out.println(sum(1, 2, 3, 4));
    }

    static int sum(int x, int y) {
        return x + y;
    }
    //매개변수의 개수가 달라서 오버로딩 가능
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    //매개변수의 개수가 달라서 오버로딩 가능
    static double sum(int x, int y, int z, int aa) {
        return (double)(x + y + z + aa);
    }
    //매개변수의 타입이 달라서 오버로딩 가능
    static String sum(String x, String y, String z) {
        return x + y + z;
    }
    //매개변수의 타입 또는 순서가 달라서 오버로딩 가능
    static String sum(int x, String y, int z) {
        return x + y + z;
    }
}

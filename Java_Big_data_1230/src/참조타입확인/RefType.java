package 참조타입확인;
//참조변수의 == (같음을 확인)
public class RefType {
    public static void main(String[] args) {
        /*int x = 0;
        String str  = null; //참조타입 변수가 객체를 참조하지 않는다는 의미
        int[] intArr = null;*/
        /*Integer val = null;
        int val2 = val; //NullPointException 발생
        System.out.println(val2);*/
        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String("진부연");
        if(name1 == name3) {
            System.out.println("두개의 이름에 대한 참조가 같음");
        }
        else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if(name1.equals(name3)) {
            System.out.println("두개의 이름의 내용이 같음");
        }
        else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
}

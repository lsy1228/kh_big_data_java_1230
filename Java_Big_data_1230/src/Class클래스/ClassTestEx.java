package Class클래스;
//Class : 클래스의 패키지 이름이나 클래스 이름등의 정보를 가져옴
public class ClassTestEx {
    public static void main(String[] args) {
        String s = new String();
        Class c = s.getClass(); //해당 클래스의 정보를 가져옴
        System.out.println(c);

        Person person = new Person();
        Class pCls = person.getClass();
        System.out.println(pCls.getSimpleName());
        System.out.println(pCls.getClass());
    }
}
class Person {

}

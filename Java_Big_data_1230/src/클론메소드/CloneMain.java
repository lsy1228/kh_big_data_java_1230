package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member m1 = new Member("1234567", "곰돌이사육사", "lsy1228", 25, true);
        Member m2 = m1.getMember();

        m2.age = 300;
        m2.name = "Tiger";

        System.out.println("name : " + m1.name);
        System.out.println("age : " + m1.age);

        System.out.println("name : " + m2.name);
        System.out.println("age : " + m2.age);
    }
}

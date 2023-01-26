package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("이소영", DevType.BACKEND, Career.JUNIOR, Gender.FEMALE);
        developer.devInfo();

        Developer developer1 = new Developer("곰돌이", DevType.FRONTEND, Career.JUNIOR, Gender.MALE);
        developer1.devInfo();
    }
}

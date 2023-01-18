package 싱글톤;
//싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
//사용하는 이유 : 메모리의 효율성과 데이터 공유의 이점이 있음
//단점 : 구현이 까다로움, 데이터의 무결성이 깨질 수 있음(멀티쓰레드에서 사용시 동기화가 필요)
public class SingletonMain {
    public static void main(String[] args) {
        /*//Singleton singleton = new Singleton();
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        if(singleton1 == singleton2) {
            System.out.println("같은 싱글톤 객체를 참조합니다");
        } else {
            System.out.println("다른 싱글톤 객체를 참조합니다");
        }
        singleton1.id = 999;
        singleton1.name = "곰돌이";
        System.out.println(singleton1.id);
        System.out.println(singleton1.name);
        System.out.println(singleton2.id);
        System.out.println(singleton2.name);*/
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.seInfo("안유진", 21);
        ref2.viewInfo();
    }
}

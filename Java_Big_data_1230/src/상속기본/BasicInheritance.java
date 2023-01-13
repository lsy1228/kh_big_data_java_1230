package 상속기본;

public class BasicInheritance {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        dog.setName("멍멍이");
        System.out.println(dog.name);*/

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(4);
    }

}

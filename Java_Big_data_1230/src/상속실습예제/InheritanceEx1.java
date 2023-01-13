package 상속실습예제;
//인간(Person)이라는 클래스 생성
//age : 나이 특성을 가짐 (정수 값 사용, getter/setter) - 몇살인지
//sleep : 잠자는 특성 (정수 값 사용, getter/setter) - 몇시간 잠자는지
//인간으로부터 직장인을 생성
//직장인 work 특성: 몇 시간 일하는지 (정수, getter/setter)
//인간으로부터 학생을 생성
//학생 study 특성 : (1로 입력 받으면 "열심히", 2 입력 "적당히", 3 입력 "놀면서")

public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(30);
        worker.setSleep(7);
        worker.setWork(8);
        System.out.println("직장인이 " + worker.getWork() + "시간 동안 일을 합니다");
        System.out.println("직장인이 " + worker.getSleep() + "시간 동안 잠을 잡니다");
        System.out.println("직장인의 나이는 " + worker.getAge() + "살 입니다");


        Student student = new Student();
        student.setAge(20);
        student.setStudy(1);
        student.setSleep(7);
        System.out.println("학생이 " + student.getStudy()+ " 공부를 합니다");
        System.out.println("학생이 " + student.getSleep() + "시간 동안 잠을 잡니다");
        System.out.println("힉생의 나이는 " + student.getAge() + "살 입니다");

    }
}

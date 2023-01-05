package 회원정보종합예제;

import java.util.Scanner;

//이름, 나이, 성별, 직업 입력 받아서 출력하기
public class MemberInfo { //필드와 메소드가 있음
    //필드 추가하기 : 필드는 클래스 내부에서 사용하는 변수를 의미 (객체 생성시 객체 갯수만큼 생성 됨)
    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    //키보드로 입력된 값을 name 필드에 저장
    public void setName() {
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
    }
    //주어진 조건에 맞는 나이를 입력 받아서 age 필드에 저장
    public void setAge() {
        while(true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) return;
            System.out.println("나이를 잘 못 입력하셨습니다");
        }
    }
    //주어진 조건에 맞는 성별을 입력 받아서 gender 필드에 저장
    public void setGender() {
        while (true) {
            System.out.print("성별을 입력하세요(M/F) : ");
            gender = sc.next().charAt(0); //문자열에서 첫번째 문자를 입력받음
            switch (gender) {
                case 'M' : case 'm' : case 'F' : case 'f': return;
                default :
                    System.out.println("성별을 잘 못 입력하셨습니다");
            }
        }
    }
    //주어진 조건에 맞는 직업을 입력 받아서 jobs 필드에 저장
    public void setJobs() {
        while(true) {
            System.out.print("직업을 입력하세요(1.학생, 2.회사원, 3.주부, 4.무직) : ");
            jobs = sc.nextInt();
            if(jobs > 0 && jobs < 5) return;
            System.out.println("직업을 잘 못 입력하셨습니다");
        }
    }
    public int getGenderType() {
        if(gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void viewInfo() {
        String[] genderStr = {"", "남성", "여성"};
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("===== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobsStr[jobs]);
    }

}

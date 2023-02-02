package 클래스정렬연습문제;
import java.util.Scanner;
import java.util.TreeSet;
//학생의 수를 입력 받기
//학생의 수 만큼의 객체를 생성하여 정보를 입력 (이름, 성적, 학번)
//학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번순으로 정렬
//그리고 출력시 등수가 표기 되도록 할 것

//[입력 예시]
//학생 수 입력 :
//안유진 99 202301
//전정국 87 202302
//김채은 88 202303

//[출력예시]
//==== 학생 성적 출력 ====
//----------------------
//  석차  성적  이름   학번
//----------------------
//   1    99  안유진  202301

public class ClassSortEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int num = sc.nextInt();
        int cnt = 0;
        int preScore = 0;
        TreeSet<Student> ts = new TreeSet<>();
        for(int i = 0; i < num; i++) {
            ts.add(new Student(sc.next(), sc.nextInt(), sc.nextInt()));
        }

        System.out.println("====== 학생 성적 출력 ======");
        System.out.println("---------------------------");
        System.out.println(" 석차   성적    이름    학번 ");
        System.out.println("---------------------------");
        for(Student e : ts) {
            if(preScore != e.score) cnt++;
            System.out.println("  "+ cnt +"     "+ e.score + "    " + e.name + "  " +e.stdNum);
            preScore = e.score; //현재 점수를 변수에 저장
        }
        System.out.println("---------------------------");
    }
}

package 입출력스트림연습문제;
//1. 적절한 위치에 이름과 성적 파일 생성
//-- TreeSet<클래스> ts = new TreeSet<>();
//2. FileInputStream으로 생성된 파일을 읽기 위한 스트림 생성
//3. 파일을 스캐너로 읽어 들이기 위해 스캐너 생성하고 스캐너의 입력으로 스트링 연결
//4. 스캐너의 hasNextLine()메소드를 이용해 읽을 라인이 있는 동안 반복 수행
//5. 스캐너의 nextLine()으로 라인별로 문자열을 읽어들임
//6. 입력 받은 문자열을 split(" ")을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입(요소가 4개인 배열이 생성)
//7. 첫번째 요소는 문자열이기 떄문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
//8. ts.add(new 클래스(생성자));
//9. 향상된 for문을 순회하면서 결과 출력

//1. 이름과 3개의 성적을 객체 단위로 관리 하기 위해 클래스 생성하고 정렬을 위해 Comparable을 상속받거나 Comparator 사용
//2. Comparable를 상속 받아 정렬 기준에 대한 메소드를 오버라이딩해 정렬에 대한 조건을 구현하거나 Comparator를 상속
//3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순으로...)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        TreeSet<Student> ts = new TreeSet<>();

        try {
            fis = new FileInputStream("src/입출력스트림연습문제/score.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            ts.add(new Student(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3])));
        }
        for(Student e : ts) System.out.println(e.getName() + " : " + e.getTotal());
    }
}

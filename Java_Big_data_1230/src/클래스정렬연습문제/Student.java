package 클래스정렬연습문제;

public class Student implements Comparable<Student>{
    String name;
    int score;
    int stdNum;

    public Student(String name, int score, int stdNum) {
        this.name = name;
        this.score = score;
        this.stdNum = stdNum;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score == o.score) { //성적이 같은 경우 학번순으로 정렬
            return this.stdNum - o.stdNum; }
        return o.score - this.score; //성적이 높은 사람순으로 내림차순 정렬
    }
}

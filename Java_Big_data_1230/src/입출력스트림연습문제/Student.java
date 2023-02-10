package 입출력스트림연습문제;

public class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotal() {
        return kor + eng + mat;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal(); //내림차순 정렬
    }
}

package 상속실습예제;

public class Person {
    int age;
    int sleep;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSleep() {
        return sleep;
    }
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}
class Worker extends Person {
    int hour;

    void setWork(int hour) {
        this.hour = hour;
    }
    int getWork() {
        return hour;
    }

}
class Student extends Person {
    int study;

    public String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }

    public void setStudy(int study) {
        this.study = study;
    }


}
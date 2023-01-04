package 기본프로그래밍;  //접근제한자(캡슐화)와 연관성이 있음
//접근제한자 : public, protected, default, private

/*
여기는 범위 주석
주석이란? 사람은 이해하고 컴파일러는 무시하는 영역
저자 : 이소영
Date : 2023.01.02 오전 10:16
목적 : 자바 연습용 프로그램
*/

//ctrl + / : 주석//
//ctrl + shift + / : 주석 /* ... */

public class Sample { //public은 공용이라는 뜻으로 아무나 접근 가능, 클래스 이름 첫자는 대문자
    // 클래스 이름을 지정, 파일이름과 클래스 이름이 같아야 함, Public 클래스는 하나여야 함
   //main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출함
    //{} : 중괄호, 클래스나 메소드 등의 범위를 결정
    //() : 소괄호, 메소드의 매개변수를 넣는 곳
    //[] : 대괄호, 배열 등을 정의 할 때 사용
    public static void main(String[] args) { //main은 딱 하나, 클래스는 여러개 (단, public class는 무조건 하나)
        //static이라고 붙이면 딱 한번만 만들어짐, 그래서 main은 static이 붙어야 함
        //void는 메소드 실행 이후의 반환 타입 중 하나, 반환 할 것이 없으면 void
        System.out.println("Hello, Java!!");
    }
}


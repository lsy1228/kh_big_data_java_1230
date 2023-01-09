package 상근날드;
//상근날드 가게에서는 세트 메뉴를 판매합니다
//햄버거는 3개 가격이 있고
//음료는 2가지 가격이 있음
//입력은 총 5개의 값을 연속으로 입력하는데 햄버거 3개 가격, 음료 2개 가격를 연속으로 입력
//햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2가지 중 가장 싼 메뉴 선택하고 세트메뉴이기 때문에 50원 할인
//총 세트 메뉴의 금액을 구하는 문제

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[5];

        System.out.print("가격을 입력하시오: ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int min_h = menu[0];
        for (int i = 0; i < 3; i++) {
            if (min_h > menu[i]) min_h = menu[i];
        }

        int min_b;
        if (menu[3] > menu[4]) min_b = menu[4];
        else min_b = menu[3];

        System.out.println("세트메뉴의 가격은 " + (min_h + min_b - 50) + "원 입니다");

        //------------------------------------------------------------
        /*int[] menu = new int[5]; //5개의 정수로 구성된 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : "); //화면 출력
        for(int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt(); //배열의 길이만큼 순회하면서 값을 연속으로 입력 받음
        }
        int minBurger = menu[0]; // 0 ~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3 ~ 4 인덱스 사이의 음료 중 하나의 값을 기본값으로 설정
        //반복문을 순회하면서 제일 싼 햄버거 1개와 음료 1개를 선택
        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);*/
    }
}

package 소수단어판별문제;

import java.util.Scanner;

public class PrimeEx1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum = 0;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                sum += word.charAt(i) - 96;
            } else {
                sum += word.charAt(i) - 38;
            }
        }
            //System.out.println(sum);
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    System.out.println("It is not a prime word."); break;
                } else
                    System.out.println("It is a prime word"); break;
            }*/
        int sum = 0;
        boolean isPrime = true; //소수인 상태를 기본값으로 설정
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);
        //소수인지 아닌지 판별하기, 1은 소수로 정하기로 했기 때문에 조건에서 제외
        for(int i = 2; i < sum; i++) {
            if(sum % i == 0) isPrime = false; //나누어지면 소수가 아님
        }
        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");

    }
}



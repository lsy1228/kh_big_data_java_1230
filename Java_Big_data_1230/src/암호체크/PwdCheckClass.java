package 암호체크;

public class PwdCheckClass {
    //길이체크
    boolean validLength(String pwd) {
        if (pwd.length() >= 10 && pwd.length() <= 30) return true;
        return false;
    }
    //숫자 체크
    boolean validNumber(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
        }
        return false;
    }
    //소문자 체크
    boolean validLowerAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
        }
        return false;
    }
    //대문자 체크
    boolean validUpperAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
        }
        return false;
    }
    //특수문자 체크
    boolean validRex(String pwd) {
        String specialLetter = "!%_&#+=*/";
        for(int i = 0; i < specialLetter.length(); i++) {
            for(int j = 0; j < pwd.length(); j++) {
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;
    }
}

package 게임만들기;

public class Character extends Unit implements GameAction {

    //생성자의 매개변수로 전달받는 값으로 캐릭터의 기본 능력치를 설정
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hP) {
        this.name =  name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hP;
    }

    @Override
    public double pAttack() {   //물리 공격력
        return pPower * pHit;
    }

    @Override
    public double mAttack() {
        return mPower * mHit;
    }

    @Override
    public int ultimate() {
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {   //받는 피해량
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다");
            return false; //아직 살아있음
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료합니다");
            return true; //죽었음
        }
    }
}

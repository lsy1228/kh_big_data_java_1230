package 게임만들기;

public class GameThB extends Thread {
    private Character warrior;
    private Character wizard;

    public GameThB(Character warrior, Character wizard) {
        this.warrior = warrior; //전사
        this.wizard = wizard;   //마법사
    }
    @Override
        public void run() {
            int normal; //일반 공격에 대한 확률 구하기
            int special; //특수 공격에 대한 확률 구하기
            boolean endGame; //게임에 대한 종료 여부
            while (true) {
                try {
                    sleep(3300);  //3초마다 반복
                    normal = (int) (Math.random() * 2); //50% 확률
                    special = (int) (Math.random() * 18); //5% 확률
                    if (normal == 1) {
                        System.out.println("마법 공격 : " + warrior.name + "에게" + wizard.mAttack() + "데미지를 입혔습니다");
                        endGame = warrior.setDamage(wizard.pAttack());
                    } else {
                        System.out.println("물리 공격 : " + warrior.name + "에게" + wizard.mAttack() + "데미지를 입혔습니다");
                        endGame = warrior.setDamage(wizard.mAttack());
                    }
                    if (special == 10) { //5% 확률
                        System.out.println(wizard.name + " 궁극기 발동 !!!, " + warrior.name + "에게" + wizard.ultimate() + "데미지를 입혔습니다");
                        endGame = warrior.setDamage(wizard.ultimate());
                    }
                    if (endGame) {
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }


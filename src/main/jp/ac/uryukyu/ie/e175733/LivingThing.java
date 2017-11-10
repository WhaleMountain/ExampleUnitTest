package jp.ac.uryukyu.ie.e175733;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public LivingThing(String name,int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead=isDead();
    }
    public boolean isDead(){
        if(hitPoint<0) {
            return true;
        }else {
            return false;
        }
    }

    public String getName(){return name;}

    public void attack(LivingThing opponent){
        int damage=(int)(Math.random()*attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.name, damage);
        opponent.wounded(damage);
    }
    public void wounded(int damage){
        hitPoint-=damage;
        if(dead=isDead()) {
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }
}

package jp.ac.uryukyu.ie.e175733;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead=true;
    public LivingThing(String name,int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
    }
    public boolean isDead(){

    }
    public String getName(){return name;}

    public void attack(LivingThing opponent){

    }
    public void wounded(int damage){
        hitPoint-=damage;
        if(hitPoint>0) {
            dead=true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }
}

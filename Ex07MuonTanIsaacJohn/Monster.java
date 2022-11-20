/*
Changelog
 - added package declaration
 - changed <Monster> to <SimpleMonster>
 - changed constructor return type from Monster to SimpleMonster
 - changed access modifier for maxHp, hp, atk, def, xp, and lvl from private to protected
 - added assignments for xp and level
 - added rest method
*/
package Ex07MuonTanIsaacJohn;

import java.util.ArrayList;
abstract class Monster implements Interactive{
    private final String name, type, strongAgainst, weakAgainst;
    /*
        added increaseCounter to set limit on amount of times fire type
        and water type specials could be used, since the games only allow for a
        maxiumum of 3 stat increases mid-battle
    */
    protected int maxHP, hp, atk, def, xp, lvl, increaseCounter;

    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        xp = 0;
        lvl = 0;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    //added setHP() method
    public void setHP(int newHP){
        hp=newHP;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int newAtk) {
        atk=newAtk;
    }    
    public int getDef() {
        return def;
    }
    public String getType(){
        return type;
    }
    
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        //updated method to use getter/setter methods
        int damage = (int)Math.round((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.getType())){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.getType())){
            damage *= 0.5;
            weak = true;
        }
        m.setHP(m.getHP()-damage);
        //added variable mHP to get monster health efficiently
        int mHP=m.getHP();
        if(mHP < 0) m.setHP(0);
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + mHP + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }
    public void duel (Monster opponent){
        System.out.printf("battle: %s vs %s%n",name,opponent.getName());
        while (true){
            this.special();
            if (getHP()<=getMaxHP()*0.3){
                this.rest();
            }
            else{
                this.attack(opponent);
            }
            
            if(opponent.getHP()<=0){
                System.out.println(name+" wins!");
                break;
            }
            opponent.special();
            if (opponent.getHP()<opponent.getMaxHP()*0.3){
                opponent.rest();
            }
            else{
                opponent.attack(this);
            }
            if(hp <=0){
                System.out.println(opponent.getName()+" wins!");
                break;
            }            
        }
        this.restoreHealth();
        opponent.restoreHealth();
        System.out.println("==END_OF_BATTLE==");
    }
    public void rest(){
        hp += (int)Math.round(maxHP * 0.15);
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    abstract void special();

    public void restoreHealth(){
        hp = maxHP;
        //resets increaseCounter so pokemon can use specials again
        increaseCounter = 0;
    }
    /**
     *prints Pokemon Info
     */
    @Override
    public void interact(){
        System.out.printf("Name: %s%nType: %s%nStrong Against: %s%nWeakAgainst: %s%nhp: %d%natk: %d%ndef: %d%n",name,type,strongAgainst,weakAgainst,hp,atk,def);
    }
}


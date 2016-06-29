/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 
    private int mDamage;
    private int mHealth;

    public Monster (int health, int damage) {
        mDamage = damage;
        mHealth = health;
    }

    public Monster () {}

    public int getDamage() {return mDamage;}
    public void setDamage(int num) {
        mDamage = num;
    }

    public int getHealth() {return mHealth;}
    public void setHealth(int num) {
        mHealth = num;
    }



    public abstract String aboutMe();





}

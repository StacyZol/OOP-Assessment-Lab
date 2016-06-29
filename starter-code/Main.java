/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        Monster[] monsters = new Monster [2];
        monsters[0] = new Dragon(2, 5);
        monsters[1] = new Zombie(45,3);

        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (Monster monster : monsters){
            System.out.println(monster.aboutMe());
        }

    }
}

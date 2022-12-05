/*
 * Manager class
 */
package zombiewar;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Eric Oliphant
 */
public class Manager {

    //instance variables
    private Combatant[] combatants;
    private int numberOfChildren=0;
    private int numberOfTeachers=0;
    private int numberOfSoldiers=0;
    private int numberOfCommonInfected=0;
    private int numberOfTanks=0;
    private int numberOfSurvivors = 0;
    private int numberOfZombies = 0;
    private ArrayList<String> names = new ArrayList<>();

    /**
     * createCombatantsArray(). This method randomly generates an array of
     * Zombies and Survivors. The length of the array is randomly generated as
     * well. After the array is generated, this method calls the beginBattle()
     * method to begin the battle.
     */
    public void createCombatantsArray() {
        Random random = new Random();
        combatants = new Combatant[random.nextInt(20 - 2 + 1) + 2];
        for (int i = 0; i < combatants.length; i++) {
            combatants[i] = generateCharacter(random.nextInt(5));
        }
        System.out.println("We have " + numberOfSurvivors + " survivors trying to make it to safety.");
        System.out.println("But there are " + numberOfZombies + " zombies waiting for them.");

        if (numberOfSurvivors == combatants.length) {
            System.out.println("Try Again, this array only contains humans.");
        } else if (numberOfZombies == combatants.length) {
            System.out.println("Try again, this array only contains zombies.");
        } else {
            beginBattle();
        }
    }

    /**
     * beginBattle() method. This method begins the battle.
     */
    public void beginBattle() {
        while (numberOfRemainingHumans() > 0 && numberOfRemainingZombies() > 0) {
            for (int i = 0; i < combatants.length; i++) {
                for (int j = 0; j < combatants.length; j++) {
                    if (i == j) {

                    } else if (combatants[i].isDead()) {

                    } else if (combatants[j].isDead()) {

                    } else {
                        if (!(combatants[i].getCombatantType().equals(combatants[j].getCombatantType()))) {
                            combatants[i].attack(combatants[j]);
                        }
                    }

                }
            }
        }
        System.out.println("It seems " + numberOfRemainingHumans() + " survivors have made it to safety.");

    }

    /**
     * numberOfRemainingHumans(). This method calculates the number of remaining
     * Survivors.
     *
     * @return int
     */
    private int numberOfRemainingHumans() {
        int humans = 0;
        for (int i = 0; i < combatants.length; i++) {
            if ((!(combatants[i].isDead())) && combatants[i].getCombatantType().equals("Survivor")) {
                humans++;
            }
        }
        return humans;
    }

    /**
     * numberOfRemainingZombies(). This method calculates the number of
     * remaining Zombies.
     *
     * @return int
     */
    private int numberOfRemainingZombies() {
        int zombies = 0;
        for (int i = 0; i < combatants.length; i++) {
            if ((!(combatants[i].isDead())) && combatants[i].getCombatantType().equals("Zombie")) {
                zombies++;
            }
        }
        return zombies;
    }

    /**
     * generateCharacter(). This method creates a new character.
     *
     * @param number int
     * @return Combatant
     */
    private Combatant generateCharacter(int number) {
        switch (number) {
            case 0:
                CommonInfect commonInfect = new CommonInfect();
                numberOfCommonInfected++;
                numberOfZombies++;
                return commonInfect;
            case 1:
                Tank tank = new Tank();
                numberOfTanks++;
                numberOfZombies++;
                return tank;
            case 2:
                Child child = new Child();
                numberOfChildren++;
                numberOfSurvivors++;
                return child;
            case 3:
                Teacher teacher = new Teacher();
                numberOfTeachers++;
                numberOfSurvivors++;
                return teacher;
            default:
                Soldier soldier = new Soldier();
                numberOfSoldiers++;
                numberOfSurvivors++;
                return soldier;
        }
    }
}

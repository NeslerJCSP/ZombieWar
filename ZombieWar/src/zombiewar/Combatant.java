/**
 *  Jnesler
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;

public class Combatant {
// Combatant types

    protected static final String ZOMBIE = "Zombie";
    protected static final String SURVIVOR = "Survivor";

// Instance variables
    private String combatantType;
    private int health;
    private int attack;

    public Combatant(String combatantType, int health, int attack) {
        this.combatantType = combatantType;
        this.health = health;
        this.attack = attack;
    }

    public void attack(Combatant combatant) {

        combatant.health = combatant.health - this.attack;
    }

    public void attack(Combatant combatant, WeaponCache weapon) {
        combatant.health = combatant.health - weapon.getAttack();
    }

    public String getCombatantType() {
        return this.combatantType;
    }

    public boolean isDead() {
        return (health <= 0);
    }
}

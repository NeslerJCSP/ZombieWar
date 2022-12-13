 /**
 *  Jnesler 
 * Software engineering
 * Last Edit 12/1/2022
 */
package zombiewar;

public class Zombie extends Combatant {

// Zombie types
protected static final String COMMON_INFECTED = "CommonInfected";
protected static final String TANK = "Tank";

private String zombieType;
 
public Zombie(String zombieType, int health, int attack) {
super(Combatant.ZOMBIE, health, attack);

// Set zombie type
this.zombieType = zombieType;
}
 
@Override
public String toString() {
return zombieType;
}
}

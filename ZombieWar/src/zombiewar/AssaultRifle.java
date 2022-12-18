/*
 * AssaultRifle class.
 */
package zombiewar;

/**
 *
 * @author Eric Oliphant
 */
public class AssaultRifle extends Weapon {

    private static final float ACCURACY = (float) 0.40;
    private static final int ATTACK = 35;

    public AssaultRifle() {
        super(Weapon.ASSAULTRIFLE, ATTACK, ACCURACY);
    }
}

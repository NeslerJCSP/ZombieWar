/*
 * SubmachineGun class.
 */
package zombiewar;

/**
 *
 * @author Eric Oliphant
 */
public class SubmachineGun extends Weapon {

    private static final float ACCURACY = (float) 0.45;
    private static final int ATTACK = 40;

    public SubmachineGun() {
        super(Weapon.SUBMACHINEGUN, ATTACK, ACCURACY);
    }
}

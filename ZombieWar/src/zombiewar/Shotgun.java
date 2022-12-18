/*
 * Shotgun class.
 */
package zombiewar;

/**
 *
 * @author Eric Oliphant
 */
public class Shotgun extends Weapon {

    private static final float ACCURACY = (float) 0.50;
    private static final int ATTACK = 50;

    public Shotgun() {
        super(Weapon.SHOTGUN, ATTACK, ACCURACY);
    }
}

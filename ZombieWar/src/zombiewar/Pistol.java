/*
 * Pistol class.
 */
package zombiewar;

/**
 *
 * @author Eric Oliphant
 */
public class Pistol extends Weapon {

    private static final float ACCURACY = (float) 0.75;
    private static final int ATTACK = 25;

    public Pistol() {
        super(Weapon.PISTOL, ATTACK, ACCURACY);
    }
}

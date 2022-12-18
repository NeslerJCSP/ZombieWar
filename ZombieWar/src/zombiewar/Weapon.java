/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Weapon extends WeaponCache {

    protected static final String FISTS = "Fists";
    protected static final String PISTOL = "Pistol";
    protected static final String SHOTGUN = "Shotgun";
    protected static final String SUBMACHINEGUN = "SubmachineGun";
    protected static final String ASSAULTRIFLE = "AssaultRifle";
    protected static final String AXE = "Axe";
    protected static final String CROWBAR = "Crowbar";
    protected static final String FRYINGPAN = "Fryingpan";

// Instance variables
    private String weaponType;
    private int attack;
    private float accuracy;

    public Weapon(String weaponType, int attack, float accuracy) {
        super(WeaponCache.WEAPON, attack, accuracy);

        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return weaponType;
    }
}

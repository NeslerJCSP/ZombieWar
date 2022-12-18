/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
class WeaponCache {

    protected static final String WEAPON = "Weapon";

// Instance variables
    private String weaponType;
    private int attack;
    private float accuracy;

    public WeaponCache(String weaponType, int attack, float accuracy) {
        this.weaponType = weaponType;
        this.attack = attack;
        this.accuracy = accuracy;
    }

    public String getWeaponType() {
        return this.weaponType;
    }

    public int getAttack() {
        return this.attack;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

}

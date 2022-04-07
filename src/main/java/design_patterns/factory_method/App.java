package design_patterns.factory_method;

public class App {

    public static void main(String[] args) {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(blacksmith);
        System.out.println(weapon);
    }


}

package design_patterns.factory_method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OrcWeapon implements Weapon{

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "an orcish " + weaponType;
    }
}

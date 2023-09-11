package Rewards;

public class WeaponGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new WeaponReward();
    }
}
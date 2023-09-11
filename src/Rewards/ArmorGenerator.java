package Rewards;

public class ArmorGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new ArmorReward();
    }
}
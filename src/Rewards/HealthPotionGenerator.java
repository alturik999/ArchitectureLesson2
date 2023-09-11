package Rewards;

public class HealthPotionGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new HealthPotionReward();
    }
}
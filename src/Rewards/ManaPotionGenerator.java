package Rewards;

public class ManaPotionGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new ManaPotionReward();
    }
}
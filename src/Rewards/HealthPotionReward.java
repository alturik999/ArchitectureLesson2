package Rewards;

public class HealthPotionReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Зелье здоровья");
    }
}
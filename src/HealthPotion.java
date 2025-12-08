public class HealthPotion  implements Consumable{
    @Override
    public void consume(Character target) {
        IO.println(target.getName() + " Used a Health Potion, +32 Health");
        target.health(32);
    }
}


void main() {

    Archer helen = new Archer(78,"Helen shard");
    HealthPotion healthPotion = new HealthPotion();
    helen.card();
    helen.takeDamage(2);
    IO.println(helen.health);
    healthPotion.consume(helen);
    IO.println(helen.health);

}

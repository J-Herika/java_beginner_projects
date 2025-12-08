public class Character{

    protected int level;
    protected String name;
    protected double health;
    protected double attackDamage;
    Character(int level,String name){
        this.level = level;
        this.name = name;
        health = 100;
        attackDamage = level * 10.3;
    }

    public void takeDamage(double damage){
        this.health -= damage;
        if(health < 0) health = 0;
    }
    public void useitem(Consumable item){
        item.consume(this);
    }

    public void setHealth(double addedHealth){
        this.health += addedHealth;
        if(health > 100) health = 100;
    }
    public double getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    public void attack(Character target){
        IO.println(this.name+ " uses Generic attack");
        target.takeDamage(this.attackDamage);
    }

    public void card(){
        double prettyHealth = Math.round(this.attackDamage * 100.0) / 100.0;
        IO.println("-----Adventurer Card-----");
        IO.println("Name: " + this.name);
        IO.println("level: " + this.level);
        IO.println("Current Health: " + this.health);
        IO.println("Attack Power: " + prettyHealth);
        IO.println("-------------------------");
    }

}

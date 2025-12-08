public class Samurai extends Character{
    Samurai(int level,String name){
        super(level,name);
    }

    @Override
    public void attack(Character target) {
        IO.println(this.name+ "Uses Thousand Slashes");
        target.takeDamage(this.attackDamage + 55);

    }
}

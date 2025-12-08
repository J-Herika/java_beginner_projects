public class Archer extends Character {

   Archer(int level,String name){
      super(level,name);
  }

    @Override
    public void attack(Character target) {
        IO.println(this.name+ "Fires Wind Arrows");
        target.takeDamage(this.attackDamage);

  }
}


void main() {

    Archer helen = new Archer(100,"Helen shard");
    Samurai yami = new Samurai(12,"Yami Sukehiro");
    Villain villain = new Villain(50,"MOJO JOJO");

    while(villain.getHealth() > 0 && (yami.getHealth() > 0 || helen.getHealth() > 0)){
        helen.attack(villain);
        yami.attack(villain);
        villain.attack(helen);
        villain.attack(yami);
    }



    IO.println("helen: " + helen.getHealth());
    IO.println("yami: " + yami.getHealth());
    IO.println("villain: " + villain.getHealth());

}

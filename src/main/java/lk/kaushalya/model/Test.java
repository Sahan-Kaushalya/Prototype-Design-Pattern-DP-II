package lk.kaushalya.model;

interface Prototype {
    public Prototype clone();
}

class Zombie implements Prototype{

    private String type;
    private int attackPower;
    private int health;

    public Zombie(String type, int attackPower, int health) {
        this.type = type;
        this.attackPower = attackPower;
        this.health = health;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Zombie Type: " + type);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Health: " + health);
        System.out.println(this);

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // මෙක තමයි වැදගත්ම point එක
    @Override
    public Zombie clone() {
        return new Zombie(this.type, this.attackPower, this.health);
    }
}

public class Test {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Ice Zombie", 50, 100);
        Zombie zombie2 = zombie1.clone();
        zombie2.setType("Fire Zombie");
        zombie2.setAttackPower(70);

        zombie1.displayInfo();
        zombie2.displayInfo();

    }
}
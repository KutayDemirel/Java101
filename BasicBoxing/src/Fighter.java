public class Fighter {
    String name;
    int weight;
    int damage;
    int health;
    int dodge;

    Fighter(String name, int weight, int damage, int health, int dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        if (this.damage > foe.health) {
            System.out.println(this.name + " hits to " + foe.name + " " + foe.health + " damage");
            return 0;
        }
        if (isDodge()) {
            System.out.println(this.name + " hits to " + foe.name + " " + this.damage + " damage");
            return foe.health - this.damage;
        } else {
            System.out.println(this.name + "'s hit dodged by " + foe.name);
            return foe.health;
        }
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber > this.dodge;
    }

}





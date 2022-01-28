public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;


    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        double randomNumber = Math.random() * 100;
        if (randomNumber < 50.00) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                healthCheck();
            }
        } else
            System.out.println("Weight category didn't match!");

    }

    boolean isCheck() {
        return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight) && (f2.weight >= this.minWeight && f2.weight <= this.maxWeight);
    }

    boolean isWin() {
        if (f2.health == 0) {
            System.out.println(this.f2.name + " => " + this.f2.health);
            System.out.println(this.f1.name + " => " + this.f1.health);
            System.out.println(this.f1.name + " wins !");
            return true;
        }
        if (f1.health == 0) {
            System.out.println(this.f1.name + " => " + this.f1.health);
            System.out.println(this.f2.name + " => " + this.f2.health);
            System.out.println(this.f2.name + " wins !");
            return true;
        }
        return false;
    }

    void healthCheck() {
        System.out.println(f1.name + " => " + f1.health);
        System.out.println(f2.name + " => " + f2.health);
        System.out.println("---------------------------------------");
    }
}
public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Khabib", 75, 15, 120, 30);
        Fighter f2 = new Fighter("Conor", 85, 20, 100, 35);

        Match match = new Match(f1, f2, 100, 70);
        match.run();
    }
}

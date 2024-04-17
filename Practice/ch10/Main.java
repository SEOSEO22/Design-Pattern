package Practice.ch10;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("csy1", new WinningStrategy(100));
        Player p2 = new Player("csy2", new ProbStrategy(200));

        Hand h1 = p1.nextHand();
        Hand h2 = p2.nextHand();

        if (h1.isStrongerThan(h2)) {
            p1.win();
            p2.lose();
        }
        else if (h1.isWeakerThan(h2)) {
            p1.lose();
            p2.win();
        }
        else {
            p1.even();
            p2.even();
        }

        System.out.println(p1);
        System.out.println(p2);

        p1.setStrategy(new ProbStrategy(300));
    }
}

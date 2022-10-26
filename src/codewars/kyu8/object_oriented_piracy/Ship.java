package codewars.kyu8.object_oriented_piracy;

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        return draft - crew * 1.5 > 20;
    }
}


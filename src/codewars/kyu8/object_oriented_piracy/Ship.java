package codewars.kyu8.object_oriented_piracy;

record Ship(double draft, int crew) {

    public boolean isWorthIt() {
        return draft - (crew * 1.5) > 20;
    }
}


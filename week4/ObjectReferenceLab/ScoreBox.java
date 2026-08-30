public class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        if (!setScore(score)) throw new IllegalArgumentException("Score must be between 0 and 100");
    }

    public int getScore() { return score; }

    public boolean setScore(int score) {
        if (score < 0 || score > 100) return false;
        this.score = score;
        return true;
    }

    public String toString() { return "ScoreBox{score=" + score + "}"; }
}

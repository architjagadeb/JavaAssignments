public class ObjectReferenceLab {
    public static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    public static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
        System.out.println("Inside replaceLocally: " + box);
    }

    public static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {
        ScoreBox first = new ScoreBox(60);
        ScoreBox alias = first;
        ScoreBox separate = new ScoreBox(30);
        System.out.println(first == alias);
        System.out.println(first == separate);
        addBonus(alias, 10);
        System.out.println(first);
        replaceLocally(first);
        System.out.println(first);
        ScoreBox created = createScoreBox(90);
        System.out.println(created);
        System.out.println(created == first);
    }
}

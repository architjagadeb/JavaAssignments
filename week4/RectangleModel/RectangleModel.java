public class RectangleModel {
    public static void main(String[] args) {
        Rectangle first = new Rectangle(); Rectangle second = new Rectangle(5); Rectangle third = new Rectangle(4, 6);
        System.out.println(first); System.out.println(second); System.out.println(third); third.scale(2); System.out.println(third);
    }
}

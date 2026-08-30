public class TextProfile {
    public static void main(String[] args) {
        if (args.length != 3) { System.out.println("Use: java TextProfile <name> <age> <heightMetres>"); return; }
        String name = args[0]; int age = Integer.parseInt(args[1]); double height = Double.parseDouble(args[2]); Profile profile = new Profile(name, age, height);
        System.out.println(profile); System.out.println("Age as text: " + Integer.toString(profile.getAge())); System.out.println("Height as text: " + String.valueOf(profile.getHeightMetres()));
    }
}

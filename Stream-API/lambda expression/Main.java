interface Light {
    void apply();
}

public class Main {
    public static void main(String[] args) {
        Light motion = () -> System.out.println("Motion Light ON");
        Light night = () -> System.out.println("Night Dim Light");

        motion.apply();
        night.apply();
    }
}
import java.util.Random;

public final class RandomGenerator {
    static Random random = new Random();

    public static int nextInt(int bound) {
        return random.nextInt(bound);
    }
}

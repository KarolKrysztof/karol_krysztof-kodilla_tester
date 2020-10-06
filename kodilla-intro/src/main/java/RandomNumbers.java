import java.util.Random;

public class RandomNumbers {

    private static final Random random = new Random();
    private static final int MAX_VALUE = 31;

    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void run() {
        int sum = 0;
        int actual;

        while (sum <= 5000) {

            actual = random.nextInt(MAX_VALUE);

            if (actual < min) {
                min = actual;

            }

            if (actual > max) {
                max = actual;

            }

            sum = sum + actual;
        }

    }

    public static void main(String[] args) {

    }

}

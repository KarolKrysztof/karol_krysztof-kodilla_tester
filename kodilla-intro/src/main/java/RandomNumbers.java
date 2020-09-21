import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.println(randomBetween(0, 30));
        }
    }

    static int randomBetween(int start, int end) {

        Random random = new Random();

        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        int sum = 0;
        int min = 0;
        int max = 30;
        int result = 0;

        while (sum < 5000) {
            int temp = random.nextInt(end - start + 1);

            sum = sum + temp;

            result++;

        }
        return result;

    }
}


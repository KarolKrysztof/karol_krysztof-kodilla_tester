import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(31);

        int min = 0;
        int max = 30;
        int sum = 0;

        while (sum <= 5000) {

            int n1 = random.nextInt(31);

            sum = sum + n1;

            System.out.println(n1);
            System.out.println(n1 + sum);

        }

    }

}



public class Application {

    public static void main(String[] args) {

        PersonValidation person = new PersonValidation("Adam", 40.5, 178);

        if (person.hasName()) {
            if (person.isOlderThan(30) && person.isHigherThan(160)) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");
            }
        }
    }
}

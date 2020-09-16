public class User {
    private static Object User;
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void showNameBelowAverageAge(User[] users) {
        if (users == null || users.length == 0) {
            System.out.println("Your array is empty.");
            return;
        }
        double averageAge = 0;
        for (int i = 0; i < users.length; i++) {
            averageAge += users[i].age;
        }
        averageAge /= users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }

    }

    public static void main(String[] args) {

        User karol = new User("Karol", 34);
        User ela = new User("Ela", 56);
        User frank = new User("Frank", 23);
        User ola = new User("Ola", 19);
        User marek = new User("Marek", 76);
        User anna = new User("Anna", 42);
    }

    User[] userEmpty = new User[0];
}



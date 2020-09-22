public class Application {
    public static void main(String[] args) {

        Person adam = new Person("Adam", 40.5);

        if (adam.name != null) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");

        }
    }
}

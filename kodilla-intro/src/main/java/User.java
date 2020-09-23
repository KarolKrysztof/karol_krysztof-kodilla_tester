public class User {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        User anna = new User("Anna", 23);
        User karol = new User("Karol", 33);
        User witold = new User("Witold", 75);
        User niko = new User("Niko", 59);
        User beata = new User("Beata", 47);
        User ola = new User("Ola", 28);
        User dawid = new User("Dawid", 17);
        User ewa = new User("Ewa", 29);

        User[] users = {anna, karol, witold, niko, beata, ola, dawid, ewa};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result += users[i].getAge();

        }
        int averageAge = result /= users.length;
        System.out.println(averageAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }

}

public class PersonValidation {

    private String name;
    private double age;
    private double height;

    public PersonValidation(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public boolean hasName() {
        return name != null;
    }

    public  boolean isOlderThan(double age) {
        return this.age > age;
    }

    public boolean isHigherThan(double height) {
        return this.height > height;

    }
}

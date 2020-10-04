public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (size == 10) {
            return;
        }
        grades[size] = value;
        size++;
    }

    public int returnLastGrade () {
        return grades[size - 1];
    }

    public double returnAverage () {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
           sum = sum + grades[i];
        }
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(6);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(2);
        grades.add(1);
        grades.add(4);

        System.out.println(grades.returnLastGrade());
        System.out.println(grades.returnAverage());

    }
}






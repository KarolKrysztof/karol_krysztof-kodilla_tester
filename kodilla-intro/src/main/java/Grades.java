public class Grades {
    public static void main(String[] args) {
        private int[] grades;
        private int size;

    public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void add(int value){
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;

            public int returnLastGrade () {
                return this.grades(this.size - 1);
            }

            public doble returnAverage () {
                int sum = 0
                for (int i = 0; i < grades.length; i++) {
                    sum /= grades.length;
                    return sum / this.size;
                }
            }
        }
    }
}





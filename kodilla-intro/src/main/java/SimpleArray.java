public class SimpleArray {

    public static void main(String[] args) {
        String[] carBrands = init();
        printWithIndex(carBrands, 3);
    }

    private static String[] init() {
        String[] carBrands = new String[5];
        carBrands[0] = "Audi";
        carBrands[1] = "Volvo";
        carBrands[2] = "Mercedes";
        carBrands[3] = "Kia";
        carBrands[4] = "Toyota";
        return carBrands;
    }

    private static void printWithIndex(String[] carBrands, int index) {
        String carBrand = carBrands[index];
        System.out.println(carBrand);
    }
}

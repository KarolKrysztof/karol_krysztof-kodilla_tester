public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {

        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if ((this.price >= 600) && (this.price >= 1000)) {
            System.out.println("This notebook is good.");
        } else if (this.price > 1000) {

            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        weight = weight.substring(0, weight.length() - 1);
        int weight2 = Integer.parseInt(weight);

        if (weight2 < 600) {
            System.out.println("This notebook is light.");
        } else if (weight2 > 2000) {
            System.out.println("This notebook is heavy.");
        } else {
            System.out.println("This notebook is not very heavy");
        }

        if ((this.price > 2000) && (this.year > 2018)) {
            System.out.println("This is new generation notebook");
        } else if ((this.price >= 600) && (this.year < 2010)) {
            System.out.println("This notebook is older generation and is cheap");
        } else if ((this.price <= 1000) && (this.year >= 2015)) {
            System.out.println("This notebook is mid-range");
        }
    }
}
public class FirstClass {
 example-2.1-2.2
        public static void main (String[] args){
            Notebook notebook = new Notebook("600g",1000, 2019);
            System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
            notebook.checkPrice();
            notebook.checkWeight();

            Notebook heavyNotebook = new Notebook("2000g", 1500, 2015);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();

            Notebook oldNotebook = new Notebook("1200g", 500, 2000);
            System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();

            }
        }

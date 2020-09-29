import java.util.Scanner;

public class Colours {

    public String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Provide first char of your favourite colour:");
            String colour = scanner.nextLine().trim().toLowerCase();
            switch (colour) {
                case "a":
                    return "Azure";
                case "b":
                    return "Baby blue";
                case "g":
                    return "Grey";
                case "i":
                    return "Indygo";
                case "n":
                    return "Navy Blue";
                case "o":
                    return "Orange";
                case "p":
                    return "Purple";
                case "r":
                    return "Red";
                case "y":
                    return "Yellow";
                case "w":
                    return "White";
                case "v":
                    return "Violet";
                default:
                    System.out.println("Please type another char. There is no modul2.colour starts with " + colour);
            }
        }
    }

    public static void main(String[] args) {
        Colours colour = new Colours();
        String result = colour.getUserSelection();
        System.out.println(result);
    }
}
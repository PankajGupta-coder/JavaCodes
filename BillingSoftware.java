import java.util.Scanner;

public class BillingSoftware {
    public static void main(String[] args) {
        int x, weight, ans = 0;
        Scanner take = new Scanner(System.in);
        System.out.println("Chose the Item From the list  ");
        System.out.println("1 Apple  2 Orange  3 Grapes ");
        System.out.println("4 Mango  5 Drangon Fruit  6 Papaya  ");
        System.out.println("7 Guava  \n");
        System.out.println("Enter the number ");
        x = take.nextInt();
        switch (x) {
        case 1: {
            System.out.println("Select unit  ");
            System.out.println(" 1 Kilograms  \n 2 Grams");
            int sel = take.nextInt();

            switch (sel) {
            case 1:
                System.out.println("Enter Weight in Kilograms");
                weight = take.nextInt();
                ans = weight * 80;
                break;
            case 2:
                weight = take.nextInt();
                ans = (80 / 1000) * weight;
                break;
            }

            System.out.println(" Rs  " + ans);

        }
        case 2:

        case 3:

        case 4:

        case 5:

        case 6:

        case 7:

        }
    }
}
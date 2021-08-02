import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        Product laptop = new Product(1211,"Laptop");

        int x;
        displayMenu();
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 9) {
            doActions(x);
            displayMenu();
            x = sc.nextInt();
        }
    }


    static void displayMenu() {
        System.out.println("--------- Menu ---------");
        System.out.println("1. Add product");
        System.out.println("2. Dispaly all products");
        System.out.println("3. Delete product");
        System.out.println("4. Activate product");
        System.out.println("5. Deactivate product");
        System.out.println("6. Delete product");
        System.out.println("9. Exit ");
        System.out.println();
        System.out.println("Enter any option");
    }

    static void doActions(int x) {
        switch (x) {
            case 1:
                System.out.println("Enter product name");
                break;
            case 3:
                System.out.println("Delete product");
                break;
            case 4:
                System.out.println("Acvitivate product");
                break;
            case 5:
                System.out.println("Deactivate product");
                break;
            case 6:
                System.out.println("Add Stock");
                break;

            case 9:
                System.out.println("Exit");
        }
    }
}

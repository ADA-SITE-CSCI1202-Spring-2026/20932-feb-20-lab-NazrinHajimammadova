import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear enter

    
        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear enter

    
            invoices[i] = new Invoice(name, qty, price);
        }

  
        System.out.println("\n===== INVOICES =====");
        for (int i = 0; i < invoices.length; i++) {
            invoices[i].printInvoice();
        }

        sc.close();
    }
}

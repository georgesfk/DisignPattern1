package visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Book("Java Programming", 50.0));
        items.add(new Fruit("Apple", 2.0, 1.5));
        items.add(new Fruit("Banana", 1.2, 2.0));

        TotalCostVisitor totalCostVisitor = new TotalCostVisitor();
        InvoiceVisitor invoiceVisitor = new InvoiceVisitor();

        // Generate Invoice
        System.out.println("Invoice:");
        for (Item item : items) {
            item.accept(invoiceVisitor);
        }

        // Calculate Total Cost
        for (Item item : items) {
            item.accept(totalCostVisitor);
        }
        System.out.println("Total Cost: " + totalCostVisitor.getTotalCost());
    }
}

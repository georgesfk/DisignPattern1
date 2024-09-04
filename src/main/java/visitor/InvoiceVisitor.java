package visitor;

// InvoiceVisitor.java
public class InvoiceVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + " | Price: " + book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("Fruit: " + fruit.getName() + " | Cost: " + (fruit.getPricePerKg() * fruit.getWeight()));
    }
}

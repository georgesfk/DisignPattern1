package visitor;

// TotalCostVisitor.java
public class TotalCostVisitor implements ItemVisitor {
    private double totalCost = 0.0;

    @Override
    public void visit(Book book) {
        totalCost += book.getPrice();
    }

    @Override
    public void visit(Fruit fruit) {
        totalCost += fruit.getPricePerKg() * fruit.getWeight();
    }

    public double getTotalCost() {
        return totalCost;
    }
}

package visitor;

// ItemVisitor.java
public interface ItemVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}


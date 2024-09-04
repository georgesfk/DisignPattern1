package visitor;

public interface Item {
    void accept(ItemVisitor visitor);
}
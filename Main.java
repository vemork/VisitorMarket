import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Product food = new Food(100.0);
    Product electronics = new Electronics(200.0);

    Visitor discountVisitor = new DiscountVisitor();
    food.accept(discountVisitor);
    electronics.accept(discountVisitor);

    List<Visitor> remainingVisitors = new ArrayList<>();
    remainingVisitors.add(new ShippingVisitor());
    remainingVisitors.add(new InsuranceVisitor());

    for (Visitor visitor : remainingVisitors) {
      food.accept(visitor);
      electronics.accept(visitor);
    }
  }
}

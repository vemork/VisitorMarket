class ShippingVisitor implements Visitor {
  @Override
  public void visit(Food food) {
    double shippingCost = food.getPrice() * 0.02;
    System.out.println("Shipping cost for food: " + shippingCost);
  }

  @Override
  public void visit(Electronics electronics) {
    double shippingCost = electronics.getPrice() * 0.05;
    System.out.println("Shipping cost for electronics: " + shippingCost);
  }
}

class DiscountVisitor implements Visitor {
  @Override
  public void visit(Food food) {
    System.out.println("Price before discount for food: " + food.getPrice());
    food.setPrice(food.getPrice() * 0.9); // 10% discount
    System.out.println("Price after discount for food: " + food.getPrice());
  }

  @Override
  public void visit(Electronics electronics) {
    System.out.println("Price before discount for electronics: " + electronics.getPrice());
    electronics.setPrice(electronics.getPrice() * 0.85); // 15% discount
    System.out.println("Price after discount for electronics: " + electronics.getPrice());
  }
}

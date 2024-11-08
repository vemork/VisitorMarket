class InsuranceVisitor implements Visitor {
  @Override
  public void visit(Food food) {
    double insuranceCost = food.getPrice() * 0.01;
    System.out.println("Insurance cost for food: " + insuranceCost);
  }

  @Override
  public void visit(Electronics electronics) {
    double insuranceCost = electronics.getPrice() * 0.08;
    System.out.println("Insurance cost for electronics: " + insuranceCost);
  }
}


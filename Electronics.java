class Electronics implements Product {
  private double price;

  public Electronics(double price) {
    this.price = price;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public void setPrice(double price) {
    this.price = price;
  }
}
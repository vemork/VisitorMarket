interface Product {
  void accept(Visitor visitor);
  double getPrice();
  void setPrice(double price);
}
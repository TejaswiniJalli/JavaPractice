class Product {
    private double price; // private = restricted access

    // Getter
    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public double getPrice(double quantity){
        return quantity*price;
    }

}
class Main {
    public static void main(String[] args) {
        Product myObj = new Product();
        myObj.setPrice(12.0);
        System.out.println(myObj.getPrice());
        System.out.println(myObj.getPrice(23));
    }
}
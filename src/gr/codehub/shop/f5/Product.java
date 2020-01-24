package gr.codehub.shop.f5;

public class Product implements Comparable<Product>{
    private double price;

    @Override
    public int compareTo(Product otherProduct) {
        return (int)Math.signum(price- otherProduct.price);
    }
}

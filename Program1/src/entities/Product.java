package entities;

public class Product {
public String name;
public double price;
public int quantity;


public Product() {
	
}
public Product(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public double TotalValueInStock() {
	return price * quantity;
}
public void AddProcucts(int quantity) {
	this.quantity += quantity;
}
public void RemoveProductsint (int quantity) {
	this.quantity -= quantity;
}
@Override
public String toString() {
	return "Product Name= " + name + ", price= " + String.format("%.2f", price) + ", quantity= " + quantity + " Total $: " + String.format("%.2f", TotalValueInStock());
}


}

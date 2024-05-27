package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter procuct here: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity In Stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		System.out.println(product);

		System.out.println("Enter the number of products to be added in stock: ");
		int quantity1 = sc.nextInt();
		product.AddProcucts(quantity1);
		System.out.println("Update data: " + product);

		System.out.println("Enter the number of products to be remove in stock: ");
		int quantity2 = sc.nextInt();
		product.RemoveProductsint(quantity2);
		System.out.println("Update data: " + product);
		
		
		System.out.println(product);
	}
}
